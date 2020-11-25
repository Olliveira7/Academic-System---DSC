/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Purchase;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.PurchaseRepository;

/**
 *
 * @author diego
 */
public class PurchaseDAO extends DataAccessObject<Purchase> implements PurchaseRepository{
    public PurchaseDAO(){
        super(Purchase.class);
    }
}
