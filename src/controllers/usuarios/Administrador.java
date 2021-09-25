package controllers.usuarios;

import java.util.ArrayList;

import controllers.servicos.sistemaDeCompra.Compras;
import database.servicos.carrinhoDeCompra.CarrinhoDeCompras;

public class Administrador {
 
    private String nome;
    private int id_administrador;
    private double valorTotal;
    
    
    public Administrador(){

    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador=id_administrador;
    }
   
    //metodo para adicionar a taxa de 5% do sistema
    public void adicionarTaxa(){
        double somaTaxa=0;
        CarrinhoDeCompras produtosVendidos=new CarrinhoDeCompras();
        ArrayList <Compras> listaDeCompras =produtosVendidos.listarVendidos();

        for(Compras element:listaDeCompras){
           somaTaxa += element.getValor()*0.05;
            
        }
        setValorTotal(somaTaxa);
        
    }
    
}
