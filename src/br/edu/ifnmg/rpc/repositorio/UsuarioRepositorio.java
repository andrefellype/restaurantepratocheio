package br.edu.ifnmg.rpc.repositorio;

import br.edu.ifnmg.rpc.domainModel.Usuario;

/**
 *
 * @author ALUNO 2015-1
 */
public interface UsuarioRepositorio extends Repositorio<Usuario>{
    public Usuario login(Usuario usuario);
}
