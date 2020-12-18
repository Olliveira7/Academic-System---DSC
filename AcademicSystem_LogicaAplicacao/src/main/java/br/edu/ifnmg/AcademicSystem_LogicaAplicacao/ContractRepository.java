/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_LogicaAplicacao;

import java.util.List;

/**
 *
 * @author diego
 */
public interface ContractRepository extends Repository<Contract>{
    public List<Contract> SearchClientPlan(Client client_id, Plan plan_id);
    public List<Contract> SearchAll();
    public Contract OpenExist(Client client, Plan plan);
}
