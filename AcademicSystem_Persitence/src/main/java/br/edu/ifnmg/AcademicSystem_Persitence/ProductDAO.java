/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Persitence;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Product;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ProductRepository;
import java.util.List;
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
    public List<Product> OpenName(String name) {
        //select pf from PessoaFisica pf where pf.cpf =:parametro
        String jpql = "select o from Product o";
        if(name != null)
            jpql = "select pd from Product pd where pd.name =:parameter";
        Query query = this.manager.createQuery(jpql);
        
        if(name != null)
            query.setParameter("parameter", name);
        return query.getResultList();
    }
    
}
