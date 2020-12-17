/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Supplier;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.SupplierRepository;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
public class SupplierDAO extends DataAccessObject<Supplier> implements SupplierRepository{
    public SupplierDAO() {
        super(Supplier.class);
    }

    @Override
    public List<Supplier> Search(Supplier supplier) {
        String jpql = "select o from Supplier o";
        
        HashMap <String, Object> parameter = new HashMap<>();
        
        if(supplier != null){
            if(supplier.getName() != null & !supplier.getName().isEmpty()){
                parameter.put("name", supplier.getName());
            }
            if(supplier.getId() > 0){
                parameter.put("id", supplier.getId());
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
