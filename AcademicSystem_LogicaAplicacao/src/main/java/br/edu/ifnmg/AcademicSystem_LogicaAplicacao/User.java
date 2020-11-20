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
@Table(name="Users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "Name", length = 250, nullable = true)
    private String name;
    
    @Column(name = "Street", length = 250)//, nullable = true)
    private String street;
    
    @Column(name = "Numberhouse" )//, nullable = true)
    private int numberhouse;
    
    @Column(name = "Neighborhood" )//, nullable = true)
    private String neighborhood;
    
    @Column(name = "Password", length = 250)//, nullable = true)
    private String password;
    
    @Column(name = "Login", length = 250)//, unique = true, nullable = true)
    private String login;
    
    @Column(name = "Cpf", length = 15)//, unique = true, nullable = true)
    private String cpf;
    
    @Column(name = "Type", length = 15)//, nullable = true)
    private String type;
    
    @Column(name = "Sex", length = 1)
    private Sex sex;
    
    @Column(name = "Status")//, nullable = true)
    private int status;
    
    public User(){
        //tipos long se inicializa com 0L
        this.id = 0L;
        this.name = "";
        this.cpf = "";
        this.login = "";
        this.numberhouse = 0;
        this.neighborhood = "";
        this.password = "";
        this.sex = Sex.F;
        this.status = 0;
        this.street = "";
        this.type = "";
        
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public String getCpf() {
        return cpf;
    }

    public String getType() {
        return type;
    }

    public Sex getSex() {
        return sex;
    }

    public int getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.street);
        hash = 83 * hash + this.numberhouse;
        hash = 83 * hash + Objects.hashCode(this.neighborhood);
        hash = 83 * hash + Objects.hashCode(this.password);
        hash = 83 * hash + Objects.hashCode(this.login);
        hash = 83 * hash + Objects.hashCode(this.cpf);
        hash = 83 * hash + Objects.hashCode(this.type);
        hash = 83 * hash + Objects.hashCode(this.sex);
        hash = 83 * hash + this.status;
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
        final User other = (User) obj;
        if (this.numberhouse != other.numberhouse) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.neighborhood, other.neighborhood)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.sex != other.sex) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
