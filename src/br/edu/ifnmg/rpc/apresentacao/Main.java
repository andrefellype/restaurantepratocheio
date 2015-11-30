package br.edu.ifnmg.rpc.apresentacao;

import br.edu.ifnmg.rpc.dao.UsuarioDAO;
import br.edu.ifnmg.rpc.domainModel.Usuario;
import br.edu.ifnmg.rpc.repositorio.UsuarioRepositorio;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioRepositorio repositorio = new UsuarioDAO();
        Usuario usuario = new Usuario();
        usuario.setNome("nome");
        usuario.setLogin("login");
        usuario.setSenha("senha");
        usuario.setStatus(true);
        usuario.setTipo("Administrador");
        repositorio.Salvar(usuario);
    }

}
