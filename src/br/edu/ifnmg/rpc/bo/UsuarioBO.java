/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.rpc.bo;

import br.edu.ifnmg.rpc.dao.UsuarioDAO;
import br.edu.ifnmg.rpc.domainModel.Usuario;
import br.edu.ifnmg.rpc.excecoes.SenhasDiferentesException;
import br.edu.ifnmg.rpc.excecoes.VazioException;
import br.edu.ifnmg.rpc.repositorio.UsuarioRepositorio;
import java.util.List;
import javax.swing.JOptionPane;

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

    public void validar(String nome, String login, String senha, String confSenha) throws Exception {

        if (!nome.isEmpty() && !login.isEmpty() && !senha.isEmpty() && !confSenha.isEmpty()) {
            if (!senha.equals(confSenha)) {
                throw new SenhasDiferentesException();
            }
        } else {
            throw new VazioException();
        }

    }
}
