/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Contract;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ContractRepository;

/**
 *
 * @author diego
 */
public class ContractDAO extends DataAccessObject<Contract> implements ContractRepository{
    public ContractDAO(){
        super(Contract.class);
    }
}
