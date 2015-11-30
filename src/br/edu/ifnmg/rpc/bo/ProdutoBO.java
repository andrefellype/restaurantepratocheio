
package br.edu.ifnmg.rpc.bo;

import br.edu.ifnmg.rpc.dao.ProdutoDAO;
import br.edu.ifnmg.rpc.domainModel.Produto;
import br.edu.ifnmg.rpc.repositorio.ProdutoRepositorio;
import java.util.List;

public class ProdutoBO {
       
    public List<Produto> Busca(Produto filtro) {
        ProdutoRepositorio repositorio = new ProdutoDAO();
        return repositorio.Buscar(filtro);
    }
    
    public void Salvar(Produto produto) throws Exception {
        ProdutoRepositorio repositorio = new ProdutoDAO();
        if (!repositorio.Salvar(produto)) {
            throw new Exception();
        }
    }
    
    public void Apagar(Produto produto) throws Exception {
       ProdutoRepositorio repositorio = new ProdutoDAO();
        if (!repositorio.Apagar(produto)) {
            throw new Exception();
        }
    }
    
    public void Refresh(Produto produto) throws Exception {
        ProdutoRepositorio repositorio = new ProdutoDAO();
        if (!repositorio.Refresh(produto)) {
            throw new Exception();
        }
    }
}
