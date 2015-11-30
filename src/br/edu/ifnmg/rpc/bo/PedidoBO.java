
package br.edu.ifnmg.rpc.bo;

import br.edu.ifnmg.rpc.dao.PedidoDAO;
import br.edu.ifnmg.rpc.domainModel.Pedido;
import br.edu.ifnmg.rpc.repositorio.PedidoRepositorio;
import br.edu.ifnmg.rpc.repositorio.ProdutoRepositorio;
import java.util.List;

public class PedidoBO {
       
    public List<Pedido> Busca(Pedido filtro) {
        PedidoRepositorio repositorio = new PedidoDAO();
        return repositorio.Buscar(filtro);
    }
    
    public void Salvar(Pedido pedido) throws Exception {
        PedidoRepositorio repositorio = new PedidoDAO();
        if (!repositorio.Salvar(pedido)) {
            throw new Exception();
        }
    }
    
    public void Apagar(Pedido pedido) throws Exception {
       PedidoRepositorio repositorio = new PedidoDAO();
        if (!repositorio.Apagar(pedido)) {
            throw new Exception();
        }
    }
    
    public void Refresh(Pedido pedido) throws Exception {
        PedidoRepositorio repositorio = new PedidoDAO();
        if (!repositorio.Refresh(pedido)) {
            throw new Exception();
        }
    }
}
