/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.bo;

import br.edu.ifnmg.rpc.dao.PedidoDAO;
import br.edu.ifnmg.rpc.dao.TipoPagamentoDAO;
import br.edu.ifnmg.rpc.domainModel.Pedido;
import br.edu.ifnmg.rpc.domainModel.TipoPagamento;
import br.edu.ifnmg.rpc.repositorio.PedidoRepositorio;
import br.edu.ifnmg.rpc.repositorio.TipoPagamentoRepositorio;
import java.util.List;

/**
 *
 * @author ALUNO 2015-1
 */
public class TipoPagamentoBO {

    public List<TipoPagamento> Busca(TipoPagamento filtro) {
        TipoPagamentoRepositorio repositorio = new TipoPagamentoDAO();
        return repositorio.Buscar(filtro);
    }

    public void Salvar(TipoPagamento tipoPagamento) throws Exception {
        TipoPagamentoRepositorio repositorio = new TipoPagamentoDAO();
        if (!repositorio.Salvar(tipoPagamento)) {
            throw new Exception();
        }
    }

    public void Apagar(TipoPagamento tipoPagamento) throws Exception {
        TipoPagamentoRepositorio repositorio = new TipoPagamentoDAO();
        if (!repositorio.Apagar(tipoPagamento)) {
            throw new Exception();
        }
    }

    public void Refresh(TipoPagamento tipoPagamento) throws Exception {
        TipoPagamentoRepositorio repositorio = new TipoPagamentoDAO();
        if (!repositorio.Refresh(tipoPagamento)) {
            throw new Exception();
        }
    }
}
