/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_LogicaAplicacao;

/**
 *
 * @author diego
 */
public interface ContractRepository extends Repository<Contract>{
    public boolean SearchClientPlan(Client client_id, Plan plan_id);
}
