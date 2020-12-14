/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Client;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ClientRepository;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
public class ClientDAO extends DataAccessObject<Client> implements ClientRepository{
    
    public ClientDAO(){
        super(Client.class);
    }
    // Se precisar de implementar alguma função que n seja da mãe incira aq

    @Override
    public List<Client> Search(Client client) {
        String jpql = "select o from Client o";
        
        HashMap <String, Object> parameter = new HashMap<>();
        
        if(client != null){
            if(client.getName() != null & !client.getName().isEmpty()){
                parameter.put("name", client.getName());
            }
            if(client.getId() > 0){
                parameter.put("id", client.getId());
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
}
