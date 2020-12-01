/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Product;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ProductRepository;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
public class ProductDAO extends DataAccessObject<Product> implements ProductRepository {

    public ProductDAO() {
        super(Product.class);
    }

    @Override
    public Product OpenName(String name) {
        //select pf from PessoaFisica pf where pf.cpf =:parametro
        Query query = this.manager.createQuery("select pd from Product pd where pd.name =:parameter");
        query.setParameter("parameter", name);
        return (Product) query.getSingleResult();
    }
    
}
