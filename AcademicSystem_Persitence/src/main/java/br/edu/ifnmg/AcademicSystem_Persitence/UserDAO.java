/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.User;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.UserRepository;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
public class UserDAO extends DataAccessObject<User> implements UserRepository{

    public UserDAO() {
        super(User.class);
    }
    
    @Override
    public User login(String login, String password) {
        Query sql = this.manager.createQuery("select l from User l where l.login = :login and l.password = :password");
        sql.setParameter("login", login);
        sql.setParameter("password", password);
        
        if(sql.getResultList().size() > 0){
            User u = (User) sql.getSingleResult();
            return u;
        }
        return null;
    }

    @Override
    public List<User> Search(User obj) {
        String jpql = "select o from User o";
        
        HashMap <String, Object> parameter = new HashMap<>();
        
        if(obj != null){
            if(obj.getLogin() != null & !obj.getLogin().isEmpty()){
                parameter.put("login", obj.getLogin());
            }
            if(obj.getId() > 0){
                parameter.put("id", obj.getId());
            }
        }
        
        if(!parameter.isEmpty()){
            String filter = "";
            jpql += " where ";
            for(String field : parameter.keySet()){
                if(!filter.isEmpty()){
                    filter += " and ";
                }
                jpql += "o." + field + " = :" + field;
            }
            jpql += filter;
        }
        
        Query sql = this.manager.createQuery(jpql);
        
        if(!parameter.isEmpty()){
            for(String field : parameter.keySet()){
                sql.setParameter(field, parameter.get(field));
            }
        }
        
        return sql.getResultList();
    }

    @Override
    public boolean DeleteLogin(String login) {
        
        String jpql = "delete from User o where o.login = :login";
        
        EntityTransaction transaction = this.manager.getTransaction();
        try{
            transaction.begin();// inicia a transação
            
            Query sql = this.manager.createQuery(jpql);
            sql.setParameter("login", login);

            if(sql.executeUpdate() > 0){//Até aqui é simulado a transação e não consecutivamente a transação
                transaction.commit(); // Aqui é relalizado efetivamente a trasanção/ Finalia a transação
                return true;
            }
        }catch(Exception exeption){
            transaction.rollback();
            System.out.println("Exceção: " + exeption);
            return false;
        }
        
        
        
   
        return false;
    }
    
     
}
