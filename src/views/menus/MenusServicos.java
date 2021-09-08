package views.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import principal.Produtos;

public class MenusServicos {
    //Consturtor
    public MenusServicos(){};

    Scanner input = new Scanner(System.in);

    /**
     * Retornar a opcao que o usuario deseja cadastrar/comprar
     * @return int opcao
     */
    public int selecionarCategoria() {

        System.out.println("---------------Selecionar Categoria -----------------");
        System.out.println("\n1 - Produto");
        System.out.println("\n2 - Refeição");
        System.out.println("\n3 - Plano de Refeição");

        int opcao = input.nextInt();

        return opcao;
    }

    /**
     * Método de cadastro de produto. Retorna as infromações de cadastro informadas pelo usuario
     * @return [int idProduto, String nome, double valor, int estoque]
     */
    public Produtos cadastrarProduto() {
        int estoque;
        double valor;
        String nome, codigo;

        System.out.println("-------------------- Cadastrar Produto --------------------------");
        System.out.println("\nCodigo: ");
        codigo = input.nextLine();
        System.out.println("\nNome: ");
        nome = input.nextLine();
        System.out.println("\nValor: ");
        valor = input.nextDouble();
        System.out.println("\nQuantidade em Estoque: ");
        estoque = input.nextInt();

        Produtos data = new Produtos(codigo, nome, valor, estoque);


        return data;
    }
}
