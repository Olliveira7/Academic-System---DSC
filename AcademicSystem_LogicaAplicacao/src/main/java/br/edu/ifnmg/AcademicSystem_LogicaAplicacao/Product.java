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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "products")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 250, nullable = true, unique = true)
    private String name;
    
    private int status;
    
    @Column(precision = 8, scale = 2)
    private BigDecimal sale_price;
    
    @Column(precision = 8, scale = 2)
    private BigDecimal purchace_price;
    
    @Column(length = 500)
    private String description;
    
    @Version
    private int version;
    
    public Product(){
        this.id = 0L;
        this.name = "";
        this.description = "";
        this.purchace_price = new BigDecimal("0.00");
        this.sale_price = new BigDecimal("0.00");
        this.status = 1;
        this.version = 1;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BigDecimal getSale_price() {
        return sale_price;
    }

    public void setSale_price(BigDecimal sale_price) {
        this.sale_price = sale_price;
    }

    public BigDecimal getPurchace_price() {
        return purchace_price;
    }

    public void setPurchace_price(BigDecimal purchace_price) {
        this.purchace_price = purchace_price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.status;
        hash = 67 * hash + Objects.hashCode(this.sale_price);
        hash = 67 * hash + Objects.hashCode(this.purchace_price);
        hash = 67 * hash + Objects.hashCode(this.description);
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
        final Product other = (Product) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.sale_price, other.sale_price)) {
            return false;
        }
        if (!Objects.equals(this.purchace_price, other.purchace_price)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
