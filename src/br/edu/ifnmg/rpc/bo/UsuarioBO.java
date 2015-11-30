/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.bo;

import br.edu.ifnmg.rpc.dao.UsuarioDAO;
import br.edu.ifnmg.rpc.domainModel.Usuario;
import br.edu.ifnmg.rpc.repositorio.UsuarioRepositorio;
import java.util.List;

/**
 *
 * @author ALUNO 2015-1
 */
public class UsuarioBO {

    public List<Usuario> Busca(Usuario filtro) {
        UsuarioRepositorio repositorio = new UsuarioDAO();
        return repositorio.Buscar(filtro);
    }

    public void Salvar(Usuario usuario) throws Exception {
        UsuarioRepositorio repositorio = new UsuarioDAO();
        if (!repositorio.Salvar(usuario)) {
            throw new Exception();
        }
    }
    
    public void Apagar(Usuario usuario) throws Exception {
        UsuarioRepositorio repositorio = new UsuarioDAO();
        if (!repositorio.Apagar(usuario)) {
            throw new Exception();
        }
    }
     public void Refresh(Usuario usuario) throws Exception {
        UsuarioRepositorio repositorio = new UsuarioDAO();
        if (!repositorio.Refresh(usuario)) {
            throw new Exception();
        }
    }
}
