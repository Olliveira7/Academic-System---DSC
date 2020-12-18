/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Purchase;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.PurchaseRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.User;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
public class PurchaseDAO extends DataAccessObject<Purchase> implements PurchaseRepository{
    public PurchaseDAO(){
        super(Purchase.class);
    }

    @Override
    public List<Purchase> SearchAll() {
        String jpql = "select o from Purchase o";
        Query sql = this.manager.createQuery(jpql);
        return sql.getResultList();
    }
}
