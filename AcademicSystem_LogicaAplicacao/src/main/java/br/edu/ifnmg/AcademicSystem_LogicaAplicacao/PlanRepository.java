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
public interface PlanRepository extends Repository<Plan>{
    public List<Plan> Search(Plan plan);
}
