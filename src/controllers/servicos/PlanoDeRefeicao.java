
package controllers.servicos;

public class PlanoDeRefeicao extends Serviços {

    private int duracao;
    private int marmitex;

    private double valor;

    // construtor
    public PlanoDeRefeicao(String codigo, String nome, int duracao, int marmitex, double valor) {

        super(codigo, nome);

        if (valor <= 0.0)
            throw new IllegalArgumentException("Valor must be > 0.0");

        if (duracao <= 0.0)
            throw new IllegalArgumentException("duracao must be > 0.0");

        this.duracao = duracao;
        this.marmitex = marmitex;
        this.valor = valor;
    }

    // gets e sets
    public int getduracao() {
        return duracao;
    }

    public void setduracao(int duracao) {
        this.duracao = duracao;
    }

    public int getMarmitex() {
        return marmitex;
    }

    public void setMarmitex(int marmitex) {
        this.marmitex = marmitex;
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
        return String.format("%s / %s: %s meses/%s: %s marmitas / %s: R$%,.2f", super.toString(), "dura", getduracao(),
                "quantidade", getMarmitex(), "valor", getValor());
    }

}
