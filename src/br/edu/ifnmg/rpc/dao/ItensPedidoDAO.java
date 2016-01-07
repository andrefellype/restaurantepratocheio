/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.dao;

import br.edu.ifnmg.rpc.domainModel.ItensPedido;
import br.edu.ifnmg.rpc.domainModel.Pedido;
import br.edu.ifnmg.rpc.repositorio.ItensPedidoRepositorio;

import java.util.List;

/**
 *
 * @author ALUNO 2015-1
 */
public class ItensPedidoDAO extends DAOGenerico<ItensPedido> implements ItensPedidoRepositorio {

    public ItensPedidoDAO() {
        super(Pedido.class);
    }

    @Override
    public List<ItensPedido> Buscar(ItensPedido filtro) {
        return IgualA("Id", filtro.getId())
                .Buscar();
    }

}
