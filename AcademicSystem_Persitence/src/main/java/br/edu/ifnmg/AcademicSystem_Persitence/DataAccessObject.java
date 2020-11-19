/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Repository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author diego
 *///Esse é uma classe genérica 
public class DataAccessObject<T> implements Repository<T> {
    // é aqui que faz as operações de banco de dados 
    private Class type;
    private EntityManager manager; //é a repsonsável em fazer tds as configurações de banco de dados
    
    public DataAccessObject(Class type){// isso só serve para inicializar o gerenciador de entidade
        var factory = Persistence.createEntityManagerFactory("UP");//aqui tem que dá o nome que está no arquivo persitece
        this.manager = factory.createEntityManager();
        this.type = type;
    }

    public DataAccessObject(){
    
    }
    
    public Class getType() {
        return type;
    }

    public EntityManager getManager() {
        return manager;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public void setManager(EntityManager manager) {
        this.manager = manager;
    }
    
    @Override
    public boolean Save(T obg) {
        EntityTransaction transaction = this.manager.getTransaction();
        try{
            transaction.begin();// inicia a transação
            
            this.manager.persist(obg);//faz a transação
            
            transaction.commit(); // Finalia a transação
            System.out.println("554545454545454");
            return true; 
            
        }catch(Exception exeption){
            transaction.rollback();
            System.out.println("Exceção: " + exeption);
            System.out.println("888888");
            return false;
        }
    }

    @Override
    public boolean Delete(T obg) {
        EntityTransaction transaction = this.manager.getTransaction();
        try{
            transaction.begin();// inicia a transação
            
            this.manager.remove(obg);//faz a transação, nesse caso trocasse o persiste pelo remove
            
            transaction.commit(); // Finalia a transação
            
            return true; 
            
        }catch(Exception exeption){
            transaction.rollback();
            System.out.println("Exceção: " + exeption);
            return false;
        }
    }

    @Override
    public T Open(Long id) {
        try{
            
            T obg = (T)this.manager.find(this.type, id);
            
            return obg; 
            
        }catch(Exception exeption){
            return null;
        }
    }

    @Override
    public List<T> search(T filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
