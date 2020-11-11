/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_LogicaAplicacao;

import java.io.Serializable;
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
    private Long user;
    
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
    
    }
    
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
