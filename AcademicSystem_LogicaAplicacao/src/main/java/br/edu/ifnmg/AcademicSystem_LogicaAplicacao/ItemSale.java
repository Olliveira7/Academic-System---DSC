/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_LogicaAplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "itemssale")
public class ItemSale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @ManyToOne
    @JoinColumn(name = "sale_id", nullable = false)
    private Sale sale;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    
    private int amount;
    
    @Column(precision = 8, scale = 2)
    private BigDecimal UnitValue;
    
    public ItemSale(){
        this.UnitValue = new BigDecimal("0.00");
        this.sale = null;
        this.product = null;
        this.amount = 0;
    }
    
    public ItemSale(Product product, int amount){
        this.product = product;
        this.amount = amount;
        this.UnitValue = this.product.getSale_price();
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getUnitValue() {
        return UnitValue;
    }

    public void setUnitValue(BigDecimal UnitValue) {
        this.UnitValue = UnitValue;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.sale);
        hash = 19 * hash + Objects.hashCode(this.product);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemSale other = (ItemSale) obj;
        if (!Objects.equals(this.sale, other.sale)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "ItemSale";
    }
    
    
    
}
