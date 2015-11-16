package br.edu.ifnmg.rpc.repositorio;


import java.util.List;


public interface Repositorio<T> {
    
    boolean Salvar(T obj);
    boolean Apagar(T obj);
    T Abrir(Long id);
    List<T> Buscar(T obj);
    
}


