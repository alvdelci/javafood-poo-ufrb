package controllers.servicos.frete;

public class Frete {
    private String empresa;
    private int prazo;
    private double valorMinimo;

    // cosntrutor
    public Frete(String empresa, int prazo, double valorMinimo) {

        if (prazo <= 0.0)
            throw new IllegalArgumentException("Prazo must be > 0.0");

        this.prazo = prazo;

        if (valorMinimo <= 0.0)
            throw new IllegalArgumentException("Valor must be > 0.0");

        this.valorMinimo = valorMinimo;
        this.empresa = empresa;
    }

    // gets e sets
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    // formatação
    @Override
    public String toString() {
        return String.format("%s:%s / %s: %s dias / %s: R$%,.2f", "empresa", getEmpresa(), "prazo", getPrazo(),
                "valor minimo", getValorMinimo());
    }

}
