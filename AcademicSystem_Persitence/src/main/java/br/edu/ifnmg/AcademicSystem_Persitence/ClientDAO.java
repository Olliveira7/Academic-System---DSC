/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Client;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ClientRepository;

/**
 *
 * @author diego
 */
public class ClientDAO extends DataAccessObject<Client> implements ClientRepository{
    
    public ClientDAO(){
        super(Client.class);
    }
    // Se precisar de implementar alguma função que n seja da mãe incira aq
}
