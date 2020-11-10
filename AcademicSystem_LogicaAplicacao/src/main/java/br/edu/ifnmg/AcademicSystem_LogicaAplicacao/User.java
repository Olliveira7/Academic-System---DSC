/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_LogicaAplicacao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author diego
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user;

    private String name;
    private String street;
    private String numberhouse;
    private String password;
    private String login;
    private String cpf;
    private String type;
    private char sex;
    private int status;
    
    public Long getId() {
        return user;
    }

    public void setId(Long newUser) {
        this.user = newUser;
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
    
    public String getNumberhouse(){
        return numberhouse;
    }
    
    public void setNumberhouse(String newNumberhouse){
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
        int hash = 0;
        hash += ( user != null ? user.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.user == null && other.user != null) || (this.user != null && !this.user.equals(other.user))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.AcademicSystem_LogicaAplicacao.User[ user=" + user + " ]";
    }
    
}
