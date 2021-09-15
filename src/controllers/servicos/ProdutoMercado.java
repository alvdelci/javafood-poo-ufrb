
package controllers.servicos;

public class ProdutoMercado extends Serviços {

	private double valor;
	private int estoque;

	// cosntrutor
	public ProdutoMercado(String codigo, String nome, double valor, int estoque) {

		super(codigo, nome);

		if (valor <= 0.0)
			throw new IllegalArgumentException("Valor must be > 0.0");

		if (estoque < 0.0)
			throw new IllegalArgumentException("Estoque must be >= 0.0");

		this.valor = valor;
		this.estoque = estoque;

	}

	// gets e sets
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	// formatação
	@Override
	public String toString() {
		return String.format("%s / %s: R$%,.2f / %s: %s", super.toString(), "valor", getValor(), "estoque",
				getEstoque());
	}

}