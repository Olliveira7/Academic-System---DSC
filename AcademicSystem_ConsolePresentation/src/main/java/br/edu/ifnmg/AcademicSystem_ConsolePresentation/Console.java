/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_ConsolePresentation;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Client;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ClientRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ItemSale;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Product;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ProductRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.RepositoryFactory;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Sale;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.SaleRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.User;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.UserRepository;
import java.util.ArrayList;


/**
 *
 * @author diego
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            //        System.out.println("111111111");
//        UserRepository repo = new UserDAO();
//        System.out.println("22222222");
//        User c = new User();
//        System.out.println("333333333");
//        c.setCpf("sjwduj3d");
//        System.out.println("44444444");
//        c.setName("dnednioe");
//        System.out.println("555555");
//        if(repo.Save(c)){
//            System.out.println("Sucesso");
//        }else{
//            System.out.println("Falhoooooooo");
//        }
//        System.out.println("111111111");
//        ClientRepository repo = new ClientDAO();
//        
//        Client c = repo.Open(101L);
//        System.out.println(c.getName() + " , " + c.getCpf());
//        
//        ClientRepository repo = RepositoryFactory.getClientRepository();
//        System.out.println("22222222");
//        Client c = new Client();
//        c.setCpf("123");
//        c.setName("Maria");
//        if(repo.Save(c)){
//            System.out.println("Sucesso");
//        }else{
//            System.out.println("Falhoooooooo");
//        }
//        SupplierRepository repo = new SupplierDAO();
//        Supplier s = new Supplier();
//        s.setCnpj("hashiwdniuw");
//        s.setName("keniodneif");
//        s.setEmail("dhuediw");
//        
//        if(repo.Save(s)){
//            System.out.println("Sucesso");
//        }else{
//            System.out.println("Falhoooooooo");
//        }

//          ProductRepository repo = new ProductDAO();
//          Product p = new Product();
//          p.setName("dia");
//          
//          if(repo.Save(p)){
//            System.out.println("Sucesso");
//          }else{
//            System.out.println("Falhoooooooo");
//          }
//          ProductRepository repo = new ProductDAO();
//          Product p = repo.OpenName("dia");
//          System.out.println(p.getId());
//    

       
        
        SaleRepository repoS = RepositoryFactory.getSaleRepository();
        UserRepository repoU = RepositoryFactory.getUserRepository();
        ClientRepository repoC = RepositoryFactory.getClientRepository();
        ProductRepository repoP = RepositoryFactory.getProductRepository();
        
        Sale s = new Sale();
        User u = new User();
        Product p = new Product();
        Client c = new Client();
        
        c = repoC.Open(151L);
        u = repoU.Open(51L);
        p = repoP.Open(1L);
        
        ItemSale i = new ItemSale(p,5);
        i.setSale(s);
        s.setClient(c);
        s.add(i);
        s.setUser(u);
        
        repoS.Save(s);
//        u.setCpf("1234");
//        u.setName("bom");
//        u.setLogin("dado");
//        u.setPassword("123");
//        repo.Save(u);
//        System.out.println(u.getName());
//       u = repo.login("dado", "123");
//       if(u != null){
//           System.out.println(u.getId());
//       }else{
//           System.out.println("Deu errado");
//       }
        //Essa parte é para carregar aqueles dados na memória 
        
        
    }
    
    
}
