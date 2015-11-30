package br.edu.ifnmg.rpc.dao;

import br.edu.ifnmg.rpc.repositorio.Repositorio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class DAOGenerico<T> implements Repositorio<T> {

    @PersistenceContext(name = "RestaurantePratoCheioPU")
    protected EntityManager manager;
    private Class tipo;

    public DAOGenerico(Class t) {
        tipo = t;
    }

    @Override
    public boolean Salvar(T obj) {
        try {
            //salva o objeto
            manager.merge(obj);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public T Abrir(Long id) {
        try {
            T obj = (T) manager.find(tipo, id);
            return obj;
            //abrir
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public abstract List<T> Buscar(T obj);

    @Override
    public boolean Apagar(T obj) {
        try {
            manager.remove(manager.merge(obj));
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
