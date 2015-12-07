/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.dao;

import br.edu.ifnmg.rpc.domainModel.TipoPagamento;
import br.edu.ifnmg.rpc.repositorio.TipoPagamentoRepositorio;
import java.util.List;

/**
 *
 * @author ALUNO 2015-1
 */
public class TipoPagamentoDAO extends DAOGenerico<TipoPagamento> implements TipoPagamentoRepositorio {

    public TipoPagamentoDAO() {
        super(TipoPagamento.class);
    }

    @Override
    public List<TipoPagamento> Buscar(TipoPagamento filtro) {
        return Like("nome", filtro.getNome())
                .Buscar();
    }

}
