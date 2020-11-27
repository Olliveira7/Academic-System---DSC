/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Plan;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.PlanRepository;

/**
 *
 * @author diego
 */
public class PlanDAO extends DataAccessObject<Plan> implements PlanRepository{
    public PlanDAO(){
        super(Plan.class);
    }
}
