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
    public boolean SearchClientPlan(Client client_id, Plan plan_id) {
        System.out.println("111111");
        // l where l.client_id = :client_id and l.plan_id = :plan_id   
        Query sql = this.manager.createQuery("select l from Contract l");
        
        List<Contract> list = sql.getResultList();
        
        if(list.size() > 0){
            for(Contract contract : list){
                System.out.println(contract.getClient().toString());
                if(contract.getClient().equals(client_id) && contract.getPlan().equals(plan_id)){
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
