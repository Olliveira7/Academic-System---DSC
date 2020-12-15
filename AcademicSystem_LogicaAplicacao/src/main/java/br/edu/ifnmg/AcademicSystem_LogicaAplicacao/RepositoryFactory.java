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
    private static ContractRepository contract;
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
    
    public static ClientRepository getClientRepository(){
        if(client == null){
            String nameClass = properties.getProperty("ClientRepository");
            client = (ClientRepository) getInstance(nameClass);
        }
        return client;
    }
    
    public static ContractRepository getContractRepository(){
        if(contract == null){
            String nameClass = properties.getProperty("ContractRepository");
            contract = (ContractRepository) getInstance(nameClass);
        }
        return contract;
    }
    
    public static SupplierRepository getSupplierRepository(){
        if(supplier == null){
            String nameClass = properties.getProperty("SupplierRepository");
            supplier = (SupplierRepository) getInstance(nameClass);
        }
        return supplier;
    }
    
    public static ProductRepository getProductRepository(){
        if(product == null){
            String nameClass = properties.getProperty("ProductRepository");
            product = (ProductRepository) getInstance(nameClass);
        }
        return product;
    }
    
    public static PlanRepository getPlanRepository(){
        if(plan == null){
            String nameClass = properties.getProperty("PlanRepository");
            plan = (PlanRepository) getInstance(nameClass);
        }
        return plan;
    }
    
    public static PurchaseRepository getPurchaseRepository(){
        if(purchase == null){
            String nameClass = properties.getProperty("PurchaseRepository");
            purchase = (PurchaseRepository) getInstance(nameClass);
        }
        return purchase;
    }
    
    public static SaleRepository getSaleRepository(){
        if(sale == null){
            String nameClass = properties.getProperty("SaleRepository");
            sale = (SaleRepository) getInstance(nameClass);
        }
        return sale;
    }
}
