/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.bo;

import br.edu.ifnmg.rpc.dao.ClienteDAO;
import br.edu.ifnmg.rpc.dao.PedidoDAO;
import br.edu.ifnmg.rpc.domainModel.Cliente;
import br.edu.ifnmg.rpc.domainModel.Pedido;
import br.edu.ifnmg.rpc.repositorio.ClienteRepositorio;
import br.edu.ifnmg.rpc.repositorio.PedidoRepositorio;
import java.util.List;

/**
 *
 * @author ALUNO 2015-1
 */
public class ClienteBO {

    public List<Cliente> Busca(Cliente filtro) {
        ClienteRepositorio repositorio = new ClienteDAO();
        return repositorio.Buscar(filtro);
    }

    public void Salvar(Cliente cliente) throws Exception {
        ClienteRepositorio repositorio = new ClienteDAO();
        if (!repositorio.Salvar(cliente)) {
            throw new Exception();
        }
    }

    public void Apagar(Cliente cliente) throws Exception {
        ClienteRepositorio repositorio = new ClienteDAO();
        if (!repositorio.Apagar(cliente)) {
            throw new Exception();
        }
    }

    public void Refresh(Cliente cliente) throws Exception {
        ClienteRepositorio repositorio = new ClienteDAO();
        if (!repositorio.Refresh(cliente)) {
            throw new Exception();
        }
    }
}
