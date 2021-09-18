package principal;

import java.util.ArrayList;

import java.util.Scanner;

import controllers.servicos.PlanoDeRefeicao;
import controllers.servicos.ProdutoMercado;
import database.servicos.DBPlanoDeRefeicao;
import database.servicos.DBProdutoMercado;
import controllers.servicos.frete.Frete;
import controllers.servicos.Refeicao;
import database.servicos.DBRefeicao;
import views.menus.MenuMain;

public class Principal {

    public static void main(String[] args) {

        // Instância de DBProdutoMercado
        DBProdutoMercado modelProdutoMercado = new DBProdutoMercado();
        // Instância de DBRefeicao
        DBRefeicao modelRefeicao = new DBRefeicao();
        // Instância de DBPlanoDeRefeicao
        DBPlanoDeRefeicao modelPanoDeRefeicao = new DBPlanoDeRefeicao();

        // Array de objectos do tipo ProdutoMercado
        ArrayList<ProdutoMercado> produtoMercado = modelProdutoMercado.returnProdutoMercado();
        // Array de objetos do tipo Refeicao
        ArrayList<Refeicao> refeicao = modelRefeicao.returnRefeicao();
        // Array de objectos do tipo PlanoDeRefeicao
        ArrayList<PlanoDeRefeicao> planoDeRefeicao = modelPanoDeRefeicao.returnPlanoDeRefeicao();

        ArrayList<Frete> frete = new ArrayList<Frete>();

        // fretes iniciais
        Frete fretes = new Frete("loggi", 14, 25);
        Frete fretes1 = new Frete("express", 10, 40);
        Frete fretes2 = new Frete("correios", 12, 20);

        // adiciona os fretes na array
        frete.add(fretes);
        frete.add(fretes1);
        frete.add(fretes2);

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.print("BEM VINDO A NOSSA PLATAFORMA");

        // loop do Menu
        while (true) {

            int num;
            // Instancia da classe MenuMain
            MenuMain menu = new MenuMain();
            try {
                num = menu.exibirMenuPrincipal();
            } catch (Exception e) {
                System.out.println("Caracter inserido não compatível!");
                continue;
            }

            if (num == 0) {
                System.out.println("fim do programa");
                break;
            } else {

                // switch para os casos de uso
                switch (num) {

                    // imprimir toda a lista de produtos e serviços disponiveis
                    case 1:

                        // Imprime todos os produtos de mercado cadastrados
                        for (ProdutoMercado element : produtoMercado) {
                            System.out.println(element.toString());
                        }

                        // Imprime todas as refeicoes cadastradas
                        for (Refeicao element : refeicao) {
                            System.out.println(element.toString());
                        }

                        // Imprime todos os planos de refeicao cadastrados
                        for (PlanoDeRefeicao element : planoDeRefeicao) {
                            System.out.println(element.toString());
                        }
                        break;

                    // ver item especifico pesquisando o id do produto
                    case 2:
                        int x;
                        try {
                            System.out.printf("qual o id do produto que vc quer ver: ");
                            x = input.nextInt();
                            System.out.println(produtoMercado.get(x));
                        } catch (Exception e) {
                            System.out.println("Caracter inserido não compatível!");
                        }

                        break;

                    // adicionar um tipo de frete
                    case 3:
                        try {
                            System.out.println("digite o nome da empresa: ");
                            String empresa = inputString.nextLine();
                            System.out.println("digite o prazo: ");
                            int prazo = input.nextInt();
                            System.out.println("digite o valor minimo: ");
                            double valorMinimo = input.nextDouble();

                            Frete objFrete = new Frete(empresa, prazo, valorMinimo);

                            frete.add(objFrete);
                        } catch (Exception e) {
                            System.out.println("Digitou algo errado, tente novamente!");

                        }

                        break;
                    // ver lista completa de fretes disponiveis
                    case 4:
                        for (Frete f : frete) {
                            System.out.println(f);

                        }
                        break;

                    // excluir frete com base no indice (lembre q se inicia no 0 e não no 1)
                    case 6:
                        int j;
                        try {
                            System.out.printf("digite a posição a ser excluida: ");
                            j = input.nextInt();
                            frete.remove(j);
                        } catch (Exception e) {
                            System.out.println("Caracter inserido não compatível!");

                        }
                        break;

                    // adicionar um anuncio de um produto de acordo com a categoria
                    case 7:
                        String n;
                        try {

                            System.out.println("em qual categoria? ");
                            n = inputString.nextLine();
                            if ("produtos".equals(n)) {
                                System.out.println("digite o id: ");
                                String codigo = input.nextLine();
                                System.out.println("digite o nome: ");
                                String nome = inputString.nextLine();
                                System.out.println("digite o valor: ");
                                double valor = input.nextDouble();
                                System.out.println("digite o estoque: ");
                                int estoque = input.nextInt();

                                ProdutoMercado objProduto = new ProdutoMercado(codigo, nome, valor, estoque);

                                produtoMercado.add(objProduto);

                            }
                            if ("refeicao".equals(n)) {
                                System.out.println("digite o id: ");
                                String codigo = input.nextLine();
                                System.out.println("digite o nome: ");
                                String nome = inputString.nextLine();
                                System.out.println("digite a bebida: ");
                                String bebida = inputString.nextLine();
                                System.out.println("digite o acompanhamento: ");
                                String acompanhamento = inputString.nextLine();
                                System.out.println("digite o valor: ");
                                double valor = input.nextDouble();

                                Refeicao objRefeição = new Refeicao(codigo, nome, bebida, acompanhamento, valor);

                                refeicao.add(objRefeição);

                            }
                            if ("plano de refeicao".equals(n)) {
                                System.out.println("digite o id: ");
                                String codigo = input.nextLine();
                                System.out.println("digite o nome: ");
                                String nome = inputString.nextLine();
                                System.out.println("digite a duração: ");
                                int duração = input.nextInt();
                                System.out.println("digite a quantidade: ");
                                int marmitex = input.nextInt();
                                System.out.println("digite o valor: ");
                                double valor = input.nextDouble();

                                PlanoDeRefeicao objPlanoDeRefeição = new PlanoDeRefeicao(codigo, nome, duração,
                                        marmitex, valor);

                                planoDeRefeicao.add(objPlanoDeRefeição);

                            }

                        } catch (Exception e) {
                            System.out.println("Caracter inserido não compatível!");

                        }

                        break;

                    // remover um anuncio com base no id dele
                    // case 9:
                    // int i;
                    // try {
                    // System.out.printf("digite o id do produto a ser excluido: ");
                    // i = input.nextInt();
                    // produto.remove(i);
                    // } catch (Exception e) {
                    // System.out.println("Caracter inserido não compatível!");

                    // }
                    // break;

                    default:
                        System.out.println("opção invalida");

                }

            }

        }
        input.close();
        inputString.close();
    }

}
