
package br.edu.ifnmg.rpc.bo;

import br.edu.ifnmg.rpc.dao.ItensPedidoDAO;
import br.edu.ifnmg.rpc.domainModel.ItensPedido;
import br.edu.ifnmg.rpc.repositorio.ItensPedidoRepositorio;
import java.util.List;

public class ItensPedidoBO {
       
    public List<ItensPedido> Busca(ItensPedido filtro) {
        ItensPedidoRepositorio repositorio = new ItensPedidoDAO();
        return repositorio.Buscar(filtro);
    }
    
    public void Salvar(ItensPedido pedido) throws Exception {
        ItensPedidoRepositorio repositorio = new ItensPedidoDAO();
        if (!repositorio.Salvar(pedido)) {
            throw new Exception();
        }
    }
    
    public void Apagar(ItensPedido pedido) throws Exception {
       ItensPedidoRepositorio repositorio = new ItensPedidoDAO();
        if (!repositorio.Apagar(pedido)) {
            throw new Exception();
        }
    }
    
    public void Refresh(ItensPedido pedido) throws Exception {
        ItensPedidoRepositorio repositorio = new ItensPedidoDAO();
        if (!repositorio.Refresh(pedido)) {
            throw new Exception();
        }
    }
}
