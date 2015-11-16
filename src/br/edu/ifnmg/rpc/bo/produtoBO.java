
package br.edu.ifnmg.rpc.bo;

import br.edu.ifnmg.rpc.dao.ProdutoDAO;
import br.edu.ifnmg.rpc.domainModel.Produto;

public class produtoBO {
    ProdutoDAO dao = new ProdutoDAO();
    
    public void salvar(Produto prod){
        dao.Salvar(prod);
    }
}
