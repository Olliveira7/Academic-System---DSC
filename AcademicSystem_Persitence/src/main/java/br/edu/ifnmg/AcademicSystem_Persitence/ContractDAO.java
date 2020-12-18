/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Client;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Contract;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ContractRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Plan;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
public class ContractDAO extends DataAccessObject<Contract> implements ContractRepository{
    public ContractDAO(){
        super(Contract.class);
    }

    @Override
    public List<Contract> SearchClientPlan(Client client, Plan plan) {
        String jpql = "select o from Contract o";
        
        HashMap <String, Object> parameter = new HashMap<>();
        
        if(client != null){
            if(client.getId() != null){
                parameter.put("client", client);
            }
            if( plan != null){
                parameter.put("plan", plan);
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
    public List<Contract> SearchAll() {
        String jpql = "select o from Contract o";
        Query sql = this.manager.createQuery(jpql);
        return sql.getResultList();
    }

    @Override
    public Contract OpenExist(Client client, Plan plan) {
        String jpql = "select o from Contract o";
        Query sql = this.manager.createQuery("select l from Contract l where l.client = :client and l.plan = :plan");
        sql.setParameter("client", client);
        sql.setParameter("plan", plan);
        
        if(sql.getResultList().size() > 0){
            return (Contract) sql.getSingleResult();
        }else{
            return null;
        }
        //return sql.getResultList();
    }
}
