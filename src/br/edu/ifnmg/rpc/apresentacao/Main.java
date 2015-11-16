package br.edu.ifnmg.rpc.apresentacao;

import br.edu.ifnmg.rpc.bo.produtoBO;
import br.edu.ifnmg.rpc.domainModel.Produto;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto prod = new Produto();
        prod.setNome("Xerecão");
        prod.setTipo("Gay");
        prod.setValor(10.00);
        
        produtoBO bo = new produtoBO();
        bo.salvar(prod);

    }

}
