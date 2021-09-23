package controllers.usuarios;

import java.util.ArrayList;

import database.usuario.DBUsuario;

public class LoginUsuario {

	public LoginUsuario() {

	}

	// Instância de DBUsuario
	DBUsuario bodyUsuario = new DBUsuario();
	// Lista recebe todos os usuarios cadastrados no sistema
	ArrayList<Usuario> listaDeUsuarios = bodyUsuario.returnUsuario();

	/**
	 * Método percorre o array de usuários cadastrados e verifica se os dados
	 * informados pelo usuario existes no banco de dados do sistema
	 * 
	 * @param inEmail
	 * @param inSenha
	 * @return Boolean
	 */
	public boolean authentication(String inEmail, String inSenha) {

		String email, senha;
		email = inEmail;
		senha = inSenha;

		boolean verification = false;
		for (Usuario element: listaDeUsuarios) {
			System.out.println(element.getEmail() + " | " + element.getSenha());
			if (element.getEmail() == email && element.getSenha() == senha) {
				System.out.println("Entrou na condicional!");
				verification = true;
			}
		}
		return verification;
	}
}