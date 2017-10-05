/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Produto {
    
    private Integer id;
    private String nome;
    private Integer estoque;

    public Produto() {
    }

    public Produto(Integer id, String nome, Integer estoque) {
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
    }

    public Produto(String nome, Integer estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    
    
    
}
