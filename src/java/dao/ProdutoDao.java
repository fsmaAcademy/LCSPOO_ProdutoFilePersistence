/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import model.Produto;

/**
 *
 * @author aluno
 */
public class ProdutoDao implements Dados {

    public static List<Produto> produtos = new ArrayList<>();
    
    @Override
    public void adicionar(Object obj) {
        Produto produto = (Produto) obj;
        this.produtos.add(produto);
    }

    @Override
    public void alterar(Object obj) {
        Produto produto = (Produto) obj;
        this.produtos.remove(produto);
        this.produtos.add(produto);
    }

    @Override
    public void excluir(Object obj) {
        Produto produto = (Produto) obj;
        this.produtos.remove(produto);
    }

    @Override
    public List getList() {
        return this.produtos;
    }
    
    private void persistir() throws FileNotFoundException {
        String dados = new String("");
        for (Produto produto : this.produtos) {
            dados += produto.getId().toString() + ";";
            dados += produto.getNome() + ";";
            dados += produto.getEstoque().toString() + "\n";
        }
        Formatter f = new Formatter("produto.csv");
        f.format(dados);
        f.close();
    }
    
}
