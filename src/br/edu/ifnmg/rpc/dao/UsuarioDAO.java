/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.dao;

import br.edu.ifnmg.rpc.domainModel.Usuario;
import br.edu.ifnmg.rpc.repositorio.UsuarioRepositorio;
import java.util.List;

/**
 *
 * @author ALUNO 2015-1
 */
public class UsuarioDAO extends DAOGenerico<Usuario> implements UsuarioRepositorio {

    public UsuarioDAO() {
        super(Usuario.class);
    }

    @Override
    public List<Usuario> Buscar(Usuario filtro) {
        return Like("nome", filtro.getNome())
                .Like("login", filtro.getLogin())
                .Buscar();
    }

}
