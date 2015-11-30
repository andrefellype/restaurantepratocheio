/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.dao;

import br.edu.ifnmg.rpc.domainModel.Pagamento;
import br.edu.ifnmg.rpc.repositorio.PagamentoRepositorio;
import java.util.List;

/**
 *
 * @author ALUNO 2015-1
 */
public class PagamentoDAO extends DAOGenerico<Pagamento> implements PagamentoRepositorio {

    public PagamentoDAO() {
        super(Pagamento.class);
    }

    @Override
    public List<Pagamento> Buscar(Pagamento filtro) {
        return Like("status", filtro.getStatus())
                .Buscar();
    }

}
