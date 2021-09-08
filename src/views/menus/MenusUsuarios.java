package views.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenusUsuarios {

    // Construtor
    public MenusUsuarios() {
    };

    Scanner input = new Scanner(System.in);

    /**
     * Método de login. Retorna as informações digitadas pelo usuario
     * 
     * @return [String email, String senha]
     */
    public List<String> login() {
        String email, senha;

        System.out.println("--------------------Login-----------------------------");
        System.out.println("\nEmail: ");
        email = input.nextLine();
        System.out.println("\nSenha: ");
        senha = input.nextLine();

        List<String> data = new ArrayList();

        data.add(email);
        data.add(senha);

        return data;
    }

    /**
     * Método de cadastro. Retorna as informações de cadastro informadas pelo usuario
     * @return [String nome, String sobrenome, String cpf, String cidade, String email, String senha]
     */
    public List<String> cadastrarUsuario() {
        String nome, sobrenome, cpf, cidade, email, senha;

        System.out.println("------------------ Cadastrar Usuário -------------------");
        System.out.println("\nNome: ");
        nome = input.nextLine();

        System.out.println("\nSobrenome: ");
        sobrenome = input.nextLine();

        System.out.println("\nCPF: ");
        cpf = input.nextLine();

        System.out.println("\nCidade: ");
        cidade = input.nextLine();

        System.out.println("\nEmail: ");
        email = input.nextLine();

        System.out.println("\nSenha: ");
        senha = input.nextLine();

        List<String> data = new ArrayList<>();

        data.add(nome);
        data.add(sobrenome);
        data.add(cpf);
        data.add(cidade);
        data.add(email);
        data.add(senha);

        return data;
    }


    
}
