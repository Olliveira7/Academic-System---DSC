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
    
    @Column(name = "Street", length = 250, nullable = true)
    private String street;
    
    @Column(name = "Numberhouse" , nullable = true)
    private int numberhouse;
    
    @Column(name = "Password", length = 250, nullable = true)
    private String password;
    
    @Column(name = "Login", length = 250, unique = true, nullable = true)
    private String login;
    
    @Column(name = "Cpf", length = 15, unique = true, nullable = true)
    private String cpf;
    
    @Column(name = "Type", length = 15, nullable = true)
    private String type;
    
    @Column(name = "Sex", length = 1)
    private char sex;
    
    @Column(name = "Status", nullable = true)
    private int status;
    
    public User(){
        this.id = 0L;
        this.name = "";
        this.cpf = "";
        this.login = "";
        this.numberhouse = 0;
        this.password = "";
        this.sex = 'm';
        this.status = 0;
        this.street = "";
        this.type = "";
        
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long newUser) {
        this.id = newUser;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String getStreet(){
        return street;
    }
    
    public void setStreet(String newStreet){
        this.street = newStreet;
    }
    
    public int getNumberhouse(){
        return numberhouse;
    }
    
    public void setNumberhouse(int newNumberhouse){
        this.numberhouse = newNumberhouse;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String newLogin){
        this.login = newLogin;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String newCpf){
        this.cpf = newCpf;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String newType){
        this.type = newType;
    }
    
    public char getSex(){
        return sex;
    }
    
    public void setSex(char newSex){
        this.sex = newSex;
    }
    
    public int getStatus(){
        return status;
    } 
    
    public void setStatus(int newStatus){
        this.status = newStatus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.street);
        hash = 79 * hash + this.numberhouse;
        hash = 79 * hash + Objects.hashCode(this.password);
        hash = 79 * hash + Objects.hashCode(this.login);
        hash = 79 * hash + Objects.hashCode(this.cpf);
        hash = 79 * hash + Objects.hashCode(this.type);
        hash = 79 * hash + this.sex;
        hash = 79 * hash + this.status;
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
        if (this.sex != other.sex) {
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
        return true;
    }
    
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
