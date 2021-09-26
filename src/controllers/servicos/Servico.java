package controllers.servicos;

public class Servico {

    private String codigo, nome;
    private double valor;

    // construtor
    public Servico(String codigo, String nome, double valor) {

        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    // getters e setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    // formatação
    @Override
    public String toString() {
        return String.format("%s: %s | %s: %s %s : %s ", "id", getCodigo(), "nome", getNome(), "| valor",getValor());
    }

}
