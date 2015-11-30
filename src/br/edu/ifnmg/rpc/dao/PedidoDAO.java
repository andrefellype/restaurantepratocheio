/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.dao;

import br.edu.ifnmg.rpc.domainModel.Pedido;
import br.edu.ifnmg.rpc.repositorio.PedidoRepositorio;
import java.util.List;

/**
 *
 * @author ALUNO 2015-1
 */
public class PedidoDAO extends DAOGenerico<Pedido> implements PedidoRepositorio {

    public PedidoDAO() {
        super(Pedido.class);
    }

    @Override
    public List<Pedido> Buscar(Pedido filtro) {
        return Like("numerocartao", filtro.getNumerocartao())
                .Buscar();
    }

}
