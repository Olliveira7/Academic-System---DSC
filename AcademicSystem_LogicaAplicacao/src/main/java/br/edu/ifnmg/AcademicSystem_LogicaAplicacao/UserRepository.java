/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_LogicaAplicacao;

/**
 *
 * @author diego
 */
public interface UserRepository extends Repository<User> {
    public User login(String login, String password);
}

