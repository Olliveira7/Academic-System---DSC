/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_LogicaAplicacao;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "client")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "name", length = 250, nullable = true)
    private String name;
    
    @Column(name = "cpf", length = 20, nullable = true, unique = true)
    private String cpf;
    
    @Column(name = "email", length = 250)
    private String email;
    
    @Column(name = "status")
    private int status;
    
    @Column(name = "street", length = 250)
    private String street;
    
    @Column(name = "numberhouse")
    private int numberhouse;
    
    @Column(name = "neighborhood", length = 250)
    private String neighborhood;
    
    @Column(name = "telephone", length = 250)
    private String telephone;
    
    @Column(name = "sex")
    private char Sex;
    
    public Client(){
        this.Sex = 'm';
        this.cpf = "";
        this.email = "";
        this.id = 0L;
        this.name = "";
        this.neighborhood = "";
        this.numberhouse = 0;
        this.status = 1;
        this.street = "";
        this.telephone = "";
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getStatus() {
        return status;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberhouse() {
        return numberhouse;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getTelephone() {
        return telephone;
    }

    public char getSex() {
        return Sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumberhouse(int numberhouse) {
        this.numberhouse = numberhouse;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setSex(char Sex) {
        this.Sex = Sex;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.cpf);
        hash = 73 * hash + Objects.hashCode(this.email);
        hash = 73 * hash + this.status;
        hash = 73 * hash + Objects.hashCode(this.street);
        hash = 73 * hash + this.numberhouse;
        hash = 73 * hash + Objects.hashCode(this.neighborhood);
        hash = 73 * hash + Objects.hashCode(this.telephone);
        hash = 73 * hash + this.Sex;
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
        final Client other = (Client) obj;
        if (this.status != other.status) {
            return false;
        }
        if (this.numberhouse != other.numberhouse) {
            return false;
        }
        if (this.Sex != other.Sex) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.neighborhood, other.neighborhood)) {
            return false;
        }
        if (!Objects.equals(this.telephone, other.telephone)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return this.name;
    }
    
}
