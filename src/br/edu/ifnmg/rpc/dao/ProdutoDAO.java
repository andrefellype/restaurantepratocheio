/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.dao;

import br.edu.ifnmg.rpc.domainModel.Produto;
import br.edu.ifnmg.rpc.repositorio.ProdutoRepositorio;
import java.util.List;

/**
 *
 * @author ALUNO 2015-1
 */
public class ProdutoDAO extends DAOGenerico<Produto> implements ProdutoRepositorio {

    public ProdutoDAO() {
        super(Produto.class);
    }

    @Override
    public List<Produto> Buscar(Produto obj) {
        return Like("nome", obj.getNome())
                .Like("tipo", obj.getTipo())
                .Buscar();
    }

}
