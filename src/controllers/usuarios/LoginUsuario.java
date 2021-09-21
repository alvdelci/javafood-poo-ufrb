package controllers.usuarios;

/*import java.util.Scanner;

import views.menus.MenuFrete;
import views.menus.MenusUsuarios;

public class LoginUsuario {
	
	private Scanner entrada = new Scanner(System.in);

	public void exibirTelaUsuario(Usuario uAtual) {
		MenuFrete mF = new MenuFrete();
		MenusUsuarios mU= new MenusUsuarios();
		int opcao;
		do {
			System.out.println("------------Menu Usuario: "+uAtual.getNome()+"-------------");
			System.out.println("Digite 1 para ir ao menu de anuncio:");
			System.out.println("Digite 2 para comprar:");
			System.out.println("Digite 3 para ver lista de compras efetuadas:");
			System.out.println("Digite -1 para sair:");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				System.out.println();
				mF.menuAnuncio(uAtual);
				break;
			case 2:
				mU.exibirMenuCompra(uAtual);
				break;
			case 3:
				if(MenuFrete.getListCompra()==null) {
					System.out.println("Nenhuma compra efetuada!!!");
				}else {
					for (MenuFrete a: MenuFrete.this.cadastrarFrete()) {
						System.out.println(a.getProdutoAnunciado().descricaoProduto());
						System.out.println();
						}	
				}
				
				break;
			case -1:
				System.out.println("Saindo...");
			default:
				System.out.println("Digite um valor valido");
				break;
			}

		} while (opcao != -1);
	}
	
	
}*/

