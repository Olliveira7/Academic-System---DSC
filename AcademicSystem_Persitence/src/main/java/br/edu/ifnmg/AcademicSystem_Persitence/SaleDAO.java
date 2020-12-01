/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Sale;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.SaleRepository;

/**
 *
 * @author diego
 */
public class SaleDAO extends DataAccessObject<Sale> implements SaleRepository{
    public SaleDAO(){
        super(Sale.class);
    }
}
