/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Product;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ProductRepository;

/**
 *
 * @author diego
 */
public class ProductDAO extends DataAccessObject<Product> implements ProductRepository {

    public ProductDAO() {
        super(Product.class);
    }
    
}
