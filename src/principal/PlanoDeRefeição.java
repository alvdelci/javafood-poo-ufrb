
package principal;

public class PlanoDeRefeição extends Serviços {

    private int duração;
    private int marmitex;

    private double valor;

    // construtor
    public PlanoDeRefeição(String codigo, String nome, int duração, int marmitex, double valor) {

        super(codigo, nome);

        if (valor <= 0.0)
            throw new IllegalArgumentException("Valor must be > 0.0");

        if (duração <= 0.0)
            throw new IllegalArgumentException("Duração must be > 0.0");

        this.duração = duração;
        this.marmitex = marmitex;
        this.valor = valor;
    }

    // gets e sets
    public int getDuração() {
        return duração;
    }

    public void setDuração(int duração) {
        this.duração = duração;
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
        return String.format("%s / %s: %s meses/%s: %s marmitas / %s: R$%,.2f", super.toString(), "dura", getDuração(),
                "quantidade", getMarmitex(), "valor", getValor());
    }

}
