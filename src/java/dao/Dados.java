/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author aluno
 */
public interface Dados {
    public void adicionar(Object obj);
    public void alterar(Object obj);
    public void excluir(Object obj);
    public List getList();
}
