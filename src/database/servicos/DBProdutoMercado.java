package database.servicos;

import java.util.ArrayList;

import controllers.servicos.ProdutoMercado;

public class DBProdutoMercado {
    // Dados de pré cadastro
    ProdutoMercado produtos = new ProdutoMercado("0", "paçoca", 2.70, 800);
    ProdutoMercado produtos1 = new ProdutoMercado("1", "bolo", 5.00, 50);
    ProdutoMercado produtos2 = new ProdutoMercado("2", "pizza brotinho", 2.50, 100);
    ProdutoMercado produtos3 = new ProdutoMercado("3", "hamburguer", 20.00, 45);
    ProdutoMercado produtos4 = new ProdutoMercado("4", "cerveja itaipava", 3.50, 400);
    ProdutoMercado produtos5 = new ProdutoMercado("5", "cerveja devassa", 4.00, 200);
    ProdutoMercado produtos6 = new ProdutoMercado("6", "guarana antartica", 5.70, 200);
    ProdutoMercado produtos7 = new ProdutoMercado("7", "coca cola", 6.00, 300);
    ProdutoMercado produtos8 = new ProdutoMercado("8", "fanta uva", 6.50, 300);
    ProdutoMercado produtos9 = new ProdutoMercado("9", "fanta laranja", 6.50, 300);

    private ArrayList<ProdutoMercado> produtoList = new ArrayList<ProdutoMercado>();

    // Construtor
    public DBProdutoMercado(ProdutoMercado produto) {

    }

    public void adicionarProduto(ProdutoMercado produto) {
        produtoList.add(produto);
    }
}