package controllers.servicos;

public class Refeicao extends Serviços {

    private String bebida;
    private String acompanhamento;

    private double valor;

    // construtor
    public Refeicao(String codigo, String nome, String bebida, String acompanhamento, double valor) {

        super(codigo, nome);

        if (valor <= 0.0)
            throw new IllegalArgumentException("Valor must be > 0.0");

        this.bebida = bebida;
        this.acompanhamento = acompanhamento;
        this.valor = valor;
    }

    // gets e sets
    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // formatação
    @Override
    public String toString() {
        return String.format("%s / %s: %s /%s: %s / %s: R$%,.2f", super.toString(), "bebida", getBebida(), "acompanha",
                getAcompanhamento(), "valor", getValor());
    }

}
