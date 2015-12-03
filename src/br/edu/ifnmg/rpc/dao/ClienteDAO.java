/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.dao;

import br.edu.ifnmg.rpc.domainModel.Cliente;
import br.edu.ifnmg.rpc.repositorio.ClienteRepositorio;
import java.util.List;

/**
 *
 * @author ALUNO 2015-1
 */
public class ClienteDAO extends DAOGenerico<Cliente> implements ClienteRepositorio {

    public ClienteDAO() {
        super(Cliente.class);
    }

    @Override
    public List<Cliente> Buscar(Cliente filtro) {
        return Like("nome", filtro.getNome())
                .Like("cpf", filtro.getCpf())
                .Buscar();
    }
}
