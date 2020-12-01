/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_LogicaAplicacao;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class RepositoryFactory {
    private static Properties properties = new Properties();
    private static UserRepository user;
    private static ClientRepository client;
    private static SupplierRepository supplier;
    private static ProductRepository product;
    private static PlanRepository plan;
    private static SaleRepository sale;
    private static PurchaseRepository purchase;
    
    static {
        FileReader readerFile = null;
        //Essa parte é somente para buscar o arquivo config.properties, que já estava feito
        try {
            File fileProperties = new File("config.properties");
            readerFile = new FileReader(fileProperties);
            
            properties.load(readerFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
    private static Object getInstance(String nameClass){
        try{
        
            Class classe = Class.forName(nameClass);//Carreguei a classe na memória
            //Instanciei um novo objeto da classe UserRepository
            Object instance = classe.getDeclaredConstructor().newInstance();
            
            //User u = new User();
            return instance;
            
        } catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex){
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static UserRepository getUserRepository(){
        if(user == null){
            String nameClass = properties.getProperty("UserRepository");
            user = (UserRepository) getInstance(nameClass);
        }
        return user;
    }
    
}
