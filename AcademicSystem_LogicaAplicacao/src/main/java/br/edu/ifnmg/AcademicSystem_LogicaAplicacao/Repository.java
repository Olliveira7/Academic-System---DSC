/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_LogicaAplicacao;

import java.util.List;

/**
 *
 * @author diego
 */
public interface Repository<T> {
    public boolean Save(T obg);
    public boolean Delete(T obg);
    public T Open(Long id);
    public List<T> search(T filtro);
}
