/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Supplier;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.SupplierRepository;

/**
 *
 * @author diego
 */
public class SupplierDAO extends DataAccessObject<Supplier> implements SupplierRepository{
    public SupplierDAO() {
        super(Supplier.class);
    }
}
