/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.User;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.UserRepository;
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
    public boolean login(String login, String password) {
        Query sql = this.manager.createQuery("select l from User l where l.login = :login and l.password = :password");
        sql.setParameter("login", login);
        sql.setParameter("password", password);
        
        if(sql.getResultList().size() > 0){
            return true;
        }
        return false;
    }
    
     
}
