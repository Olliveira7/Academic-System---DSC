/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_ConsolePresentation;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.User;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.UserRepository;
import br.edu.ifnmg.AcademicSystem_Persitence.UserDAO;

/**
 *
 * @author diego
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       UserRepository repo = new UserDAO();
       User u = new User();
       u.setCpf("1515");
       u.setLogin("ghghgh");
       u.setName("ddfggr");
       u.setNumberhouse(2);
       u.setPassword("deofeofk");
       u.setSex('a');
       u.setStatus(3);
       u.setStreet("hdue");
       u.setType("oiiudu");
       //u.setId(Long.MIN_VALUE);
       
       if(repo.Save(u)){
           System.out.println("Sucesso!!!!");
       }else{
           System.out.println("Falhoooooooooooooo");
       }
    }
    
}
