/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_ConsolePresentation;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.RepositoryFactory;
import static br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Sale_.client;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.User;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.UserRepository;
import java.util.List;


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
//        
//        
//        System.out.println("22222222");
//        Client c = new Client();
//        Client b = new Client();
//        Client a = new Client();
//        c.setCpf("123");
//        c.setName("Maria");
//        a.setCpf("45600");
//        a.setName("João");
//        b.setCpf("789");
//        b.setName("Carlos");
//        if(repo.Save(c)){
//            repo.Save(b);
//            repo.Save(a);
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
//
//          ProductRepository repo = RepositoryFactory.getProductRepository();
//          Product p = new Product();
//          p.setName("Cachaça");
//          p.setPurchasereason(40);
//          p.setSalereason(21);
//          p.setUnitpurchase(Unit.Box);
//          p.setUnitsale(Unit.Unit);
//          p.setPurchace_price(BigDecimal.valueOf(4.5d));
//          p.setSale_price(BigDecimal.valueOf(20d));
//          
//          if(repo.Save(p)){
//            System.out.println("Sucesso");
//          }else{
//            System.out.println("Falhoooooooo");
//          }
          //ProductRepository repoo = RepositoryFactory.getProductRepository();
          //Product po = repo.OpenName("dia");
          //System.out.println(p.getId());
//    
//
//          User u = new User();
//          u.setLogin("dado");
//          UserRepository repoU = RepositoryFactory.getUserRepository();
//          for(User p: repoU.Search(u)){
//              System.out.println(p);
//          
//          }
//       
        
//        SaleRepository repoS = RepositoryFactory.getSaleRepository();
//        UserRepository repoU = RepositoryFactory.getUserRepository();
//        SupplierRepository repoSu = RepositoryFactory.getSupplierRepository();
//        ClientRepository repoC = RepositoryFactory.getClientRepository();
//        ProductRepository repoP = RepositoryFactory.getProductRepository();
//        
//        Product product = repoP.ProductName("Banana");
//        if(product != null){
//            System.out.println("OK " + product.getId().toString());
//        
//        }else{
//            System.out.println("NO");
//        }
//        
//        PurchaseRepository repoPu = RepositoryFactory.getPurchaseRepository();
//        
//        Purchase pu = new Purchase();
//        Sale s = new Sale();
//        User u = new User();
//        Product p = new Product();
//        Client c = new Client();
//        Supplier su = new Supplier();
//        Product v = new Product();
//        
//        c = repoC.Open(251L);
//        su = repoSu.Open(1L);
//        u = repoU.Open(1L);
//        p = repoP.Open(51L);
//        v = repoP.Open(101L);
//        
//        ItemPurchase i = new ItemPurchase(p,5,pu);
//        ItemPurchase e = new ItemPurchase(v,5,pu);
    
//          SaleRepository repository = RepositoryFactory.getSaleRepository();
//          Sale sale = repository.Open(501L);
//          System.out.println(sale.getUser().getLogin());

//        pu.setSupplier(su);
//        pu.setUser(u);
//        pu.add(e);
//        pu.add(i);
//        repoPu.Save(pu);
//        v.setStock(5, 1);
//        p.setStock(5, 1);
//        repoP.Save(v);
//        repoP.Save(p);

//        
//        ItemSale i = new ItemSale(p,5);
//        ItemSale e = new ItemSale(v,10);
//        i.setSale(s);
//        e.setSale(s);
//        s.setClient(c);
//        s.add(i);
//        s.add(e);
//        s.setUser(u);
        //
       // repoS.Save(s);
//        System.out.println("oiiiiiiii");
//        User u = new User();
//        System.out.println("oiiiiiiii");
//        UserRepository repo = RepositoryFactory.getUserRepository();
//        u.setCpf("1112");
//        u.setName("adm");
//        u.setLogin("adm");
//        u.setPassword("123");
//        u.setEmail("kkkkkkk@gmail.com");
//        u.setStatus(1);
//        u.setType("executivo");
//        repo.Save(u);
//        System.out.println(u.getName());
//        
//          System.out.println("Deu");
//          UserRepository repo = RepositoryFactory.getUserRepository();
//          System.out.println("certo");
//          //repo.Open(null);
//          if(repo.DeleteLogin("abc") == true){
//              System.out.println("Deu certo");
//          }else{
//              System.out.println("Deu errado");
//          }
        
        //Essa parte é para carregar aqueles dados na memória 
        
        
//        ClientRepository repo = RepositoryFactory.getClientRepository();
//        Client p = new Client();
//        p.setId(91L);
//        
//        List<Client> list = repo.Search(p);
//        for(Client client: list){
//            System.out.println();
//        }
        
//         SupplierRepository repo = RepositoryFactory.getSupplierRepository();
//         Supplier s = new Supplier();
//
//         s.setCnpj("5154484");
//         s.setName("Carcas");
//         repo.Save(s);
//          ContractRepository repoc = RepositoryFactory.getContractRepository();
//          //ClientRepository repo = RepositoryFactory.getClientRepository();
//          PlanRepository repop = RepositoryFactory.getPlanRepository();
//          
//          Plan plan = new Plan();
//          plan.setName("Premium");
//          
//          plan.setPrice(new BigDecimal(15d));
//          
//          if(repop.Save(plan)){
//              System.out.println("Susesso");
//          }
          
//          ClientRepository repo = RepositoryFactory.getClientRepository();
//          PlanRepository repop = RepositoryFactory.getPlanRepository();
////          UserRepository repou = RepositoryFactory.getUserRepository();
//          ContractRepository repoc = RepositoryFactory.getContractRepository();
////          User user = new User();
//          Plan plan = repop.Open(901L);
//          
//          Client client = repo.Open(151L);
//          List<Contract> con = repoc.SearchClientPlan(client, plan);
//          
//          for(Contract com: con){
//              System.out.println(com.getClient().getName());
//          }
            
            UserRepository repo = RepositoryFactory.getUserRepository();
            User user = new User();
            user.setId(1L);
            user.setLogin("adm");
            List<User> list = repo.Search(user);
//          
//          client = repo.Open(151L);
//          user = repou.Open(1L);
//          plan = repop.Open(901L);
//          
//          con.setClient(client);
//          con.setPlan(plan);
//          con.setUser(user);
//          repoc.Save(con);
          


//        ProductRepository repo = RepositoryFactory.getProductRepository();
//        List<Product> pros = repo.OpenName("dia");
//        for(Product product : pros){
//            System.out.println(product.getName());
//        }
//        

//          ClientRepository repo = RepositoryFactory.getClientRepository();
//          Client p = new Client();
//          
//          p.setCpf("15454948");
//          p.setEmail("amorcari@gmial.com");
//          p.setName("Andre");
//          p.setNeighborhood("caridade");
//          p.setNumberhouse(15);
//          p.setSex(Sex.Male);
//          p.setStreet("amaro");
//          p.setTelephone("389444444444");
//          repo.Save(p);

        //Client client = 
    }
    
    
}
