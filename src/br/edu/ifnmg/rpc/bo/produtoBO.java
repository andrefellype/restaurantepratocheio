package br.edu.ifnmg.rpc.bo;

import br.edu.ifnmg.rpc.dao.ProdutoDAO;
import br.edu.ifnmg.rpc.domainModel.Produto;

public class produtoBO {

    ProdutoDAO dao = new ProdutoDAO();

    public void salvar(Produto prod) {
        if (dao.Salvar(prod)) {
            System.err.println("certo");
        }

        System.err.println("certo");
    }
}
