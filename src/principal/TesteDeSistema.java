package principal;

import java.util.ArrayList;

import controllers.servicos.PlanoDeRefeicao;
import controllers.servicos.ProdutoMercado;
import controllers.servicos.Refeicao;
import controllers.servicos.frete.Frete;
import controllers.usuarios.Usuario;
import database.servicos.DBPlanoDeRefeicao;
import database.servicos.DBProdutoMercado;
import database.servicos.DBRefeicao;
import database.servicos.frete.DBFrete;
import database.usuario.DBUsuario;


public class TesteDeSistema {
    
 // Instância de DBUsuario
 static DBUsuario modelUsuario = new DBUsuario();
 // Instância de DBProdutoMercado
  static DBProdutoMercado modelProdutoMercado = new DBProdutoMercado();
 // Instância de DBRefeicao
  static DBRefeicao modelRefeicao = new DBRefeicao();
 // Instância de DBPlanoDeRefeicao
 static DBPlanoDeRefeicao modelPlanoDeRefeicao = new DBPlanoDeRefeicao();
 // Instância de DBFrete
  static DBFrete modelFrete = new DBFrete();

  static ArrayList<Usuario> usuario = modelUsuario.returnUsuario();
 // Array de objectos do tipo ProdutoMercado
  static ArrayList<ProdutoMercado> produtoMercado = modelProdutoMercado.returnProdutoMercado();
 // Array de objetos do tipo Refeicao
  static ArrayList<Refeicao> refeicao = modelRefeicao.returnRefeicao();
 // Array de objectos do tipo PlanoDeRefeicao
  static ArrayList<PlanoDeRefeicao> planoDeRefeicao = modelPlanoDeRefeicao.returnPlanoDeRefeicao();
 // Array de objetos do tipo Frete
  static ArrayList<Frete> frete = modelFrete.returnFretes();
public static void main(String[] args) {
        
    //autenticar(false);
    //cadastrarServico();
    //cadastrarFrete();
    Usuario usuario = new Usuario("claudio", "rubens", "55555555", "rio", "claddin@mail.com", "martelo");

    cadastrarUsuario(usuario);
    }

    /**
     * Analisa os dados de login do usuario e conferem com os dados cadastrados no
     * sistem
     * 
     * @param verificacao
     */
    public static void autenticar(boolean verificacao) {
        System.out.println("\n----------Teste autenticar--------");
        if (verificacao) {
            System.out.println("\nUsuário autenticado! Tem acesso ao sistema.");
        }else {
            System.out.println("\nUsuário não autenticado! Dados não conferem.");
        }
    }
    //adiciona o usuario a lista de usuarios cadastrados
    public static void cadastrarUsuario(Usuario user){
        System.out.println("cadastrando usuario...");
        usuario.add(user);
        System.out.println("usuario cadastrado");

    }
    // cadastra os produtos de cada serviço
    public static void cadastrarServico(){
        System.out.println("cadastrando anuncio...");
    
        

        System.out.println("-----------anuncios cadastrados-----------");
        for (ProdutoMercado element : produtoMercado) {
            System.out.println(element.toString());
            }
        for (Refeicao element : refeicao) {
                System.out.println(element.toString());
            } 
         for (PlanoDeRefeicao element : planoDeRefeicao) {
                System.out.println(element.toString());
            }           


    }
    //cadastrar os fretes 
    public static void cadastrarFrete(){
        System.out.println("------fretes cadastrados------");
        for (Frete element : frete) {
            System.out.println(element.toString());
            }


    }

    

    
}
