package principal;

import java.util.ArrayList;

import java.util.Scanner;

import controllers.servicos.PlanoDeRefeicao;
import controllers.servicos.ProdutoMercado;
import controllers.servicos.Refeicao;
import controllers.servicos.Servico;
import controllers.servicos.frete.Frete;
import views.menus.MenuMain;

public class Principal {

    public static void main(String[] args) {

        // criar as arrays
        ArrayList<Servico> produto = new ArrayList<Servico>();
        ArrayList<Frete> frete = new ArrayList<Frete>();

        // produtos iniciais
        // ProdutoMercado produtos = new ProdutoMercado("0", "paçoca", 2.70, 800);
        // ProdutoMercado produtos1 = new ProdutoMercado("1", "bolo", 5.00, 50);
        // ProdutoMercado produtos2 = new ProdutoMercado("2", "pizza brotinho", 2.50, 100);
        // ProdutoMercado produtos3 = new ProdutoMercado("3", "hamburguer", 20.00, 45);
        // ProdutoMercado produtos4 = new ProdutoMercado("4", "cerveja itaipava", 3.50, 400);
        // ProdutoMercado produtos5 = new ProdutoMercado("5", "cerveja devassa", 4.00, 200);
        // ProdutoMercado produtos6 = new ProdutoMercado("6", "guarana antartica", 5.70, 200);
        // ProdutoMercado produtos7 = new ProdutoMercado("7", "coca cola", 6.00, 300);
        // ProdutoMercado produtos8 = new ProdutoMercado("8", "fanta uva", 6.50, 300);
        // ProdutoMercado produtos9 = new ProdutoMercado("9", "fanta laranja", 6.50, 300);
        Refeicao refeição = new Refeicao("10", "bife acebolado", "refrigerante", "farofa", 25.00);
        Refeicao refeição1 = new Refeicao("11", "lasanha", "refrigerante", "ketchup", 20.00);
        Refeicao refeição2 = new Refeicao("12", "frango a parmegiana", "cerveja", "farofa", 25.00);
        Refeicao refeição3 = new Refeicao("13", "carne de sol", "cerveja", "batata frita", 20.00);
        Refeicao refeição4 = new Refeicao("14", "frango grelhado", "refrigerante", "farofa", 15.00);
        Refeicao refeição5 = new Refeicao("15", "peixe frito", "cerveja", "farofa", 15.00);
        Refeicao refeição6 = new Refeicao("16", "porção de batata frita", "refrigerante", "ketchup", 10.00);
        PlanoDeRefeicao plano = new PlanoDeRefeicao("17", "gordo", 12, 300, 1000);
        PlanoDeRefeicao plano1 = new PlanoDeRefeicao("18", "magro", 12, 150, 500);
        PlanoDeRefeicao plano2 = new PlanoDeRefeicao("19", "medio", 12, 170, 600);
        PlanoDeRefeicao plano3 = new PlanoDeRefeicao("20", "gordin", 12, 200, 700);
        PlanoDeRefeicao plano4 = new PlanoDeRefeicao("21", "hulk", 12, 450, 1500);

        // adiciona os produtos na array
        // produto.add(produtos);
        // produto.add(produtos1);
        // produto.add(produtos2);
        // produto.add(produtos3);
        // produto.add(produtos4);
        // produto.add(produtos5);
        // produto.add(produtos6);
        // produto.add(produtos7);
        // produto.add(produtos8);
        // produto.add(produtos9);
        produto.add(refeição);
        produto.add(refeição1);
        produto.add(refeição2);
        produto.add(refeição3);
        produto.add(refeição4);
        produto.add(refeição5);
        produto.add(refeição6);
        produto.add(plano);
        produto.add(plano1);
        produto.add(plano2);
        produto.add(plano3);
        produto.add(plano4);

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
                        for (Servico p : produto) {
                            System.out.println(p);

                        }
                        break;

                    // ver item especifico pesquisando o id do produto
                    case 2:
                        int x;
                        try {
                            System.out.printf("qual o id do produto que vc quer ver: ");
                            x = input.nextInt();
                            System.out.println(produto.get(x));
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

                                produto.add(objProduto);

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

                                produto.add(objRefeição);

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

                                produto.add(objPlanoDeRefeição);

                            }

                        } catch (Exception e) {
                            System.out.println("Caracter inserido não compatível!");

                        }

                        break;

                    // remover um anuncio com base no id dele
                    case 9:
                        int i;
                        try {
                            System.out.printf("digite o id do produto a ser excluido: ");
                            i = input.nextInt();
                            produto.remove(i);
                        } catch (Exception e) {
                            System.out.println("Caracter inserido não compatível!");

                        }
                        break;

                    default:
                        System.out.println("opção invalida");

                }

            }

        }
        input.close();
        inputString.close();
    }

}
