/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Plan;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.PlanRepository;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
public class PlanDAO extends DataAccessObject<Plan> implements PlanRepository{
    public PlanDAO(){
        super(Plan.class);
    }

    @Override
    public List<Plan> Search(Plan plan) {
        String jpql = "select o from Plan o";
        
        HashMap <String, Object> parameter = new HashMap<>();
        
        if(plan != null){
            if(plan.getName() != null & !plan.getName().isEmpty()){
                parameter.put("name", plan.getName());
            }
            if(plan.getId() > 0){
                parameter.put("id", plan.getId());
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
