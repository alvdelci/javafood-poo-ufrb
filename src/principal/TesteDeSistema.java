package principal;

public class TesteDeSistema {
    public static void main(String[] args) {
        autenticar(false);
    }

    /**
     * Analisa os dados de login do usuario e conferem com os dados cadastrados no
     * sistema
     * 
     * @param verificacao
     */
    public static void autenticar(boolean verificacao) {
        System.out.println("\n----------Teste autenticar--------");
        if (verificacao) {
            System.out.println("\nUsuário autenticado! Tem acesso ao sistema.");
        } else {
            System.out.println("\nUsuário não autenticado! Dados não conferem.");
        }
    }
}
