
package br.edu.ifnmg.rpc.bo;

import br.edu.ifnmg.rpc.dao.PagamentoDAO;
import br.edu.ifnmg.rpc.domainModel.Pagamento;
import br.edu.ifnmg.rpc.repositorio.PagamentoRepositorio;
import java.util.List;

public class PagamentoBO {
       
    public List<Pagamento> Busca(Pagamento  filtro) {
        PagamentoRepositorio repositorio = new PagamentoDAO();
        return repositorio.Buscar(filtro);
    }
    
    public void Salvar(Pagamento pagamento) throws Exception {
        PagamentoRepositorio repositorio = new PagamentoDAO();
        if (!repositorio.Salvar(pagamento)) {
            throw new Exception();
        }
    }
    
    public void Apagar(Pagamento pagamento) throws Exception {
       PagamentoRepositorio repositorio = new PagamentoDAO();
        if (!repositorio.Apagar(pagamento)) {
            throw new Exception();
        }
    }
    
    public void Refresh(Pagamento pagamento) throws Exception {
        PagamentoRepositorio repositorio = new PagamentoDAO();
        if (!repositorio.Refresh(pagamento)) {
            throw new Exception();
        }
    }
}
