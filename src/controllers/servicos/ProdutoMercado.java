
package controllers.servicos;

public class ProdutoMercado extends Servico {

	private int estoque;

	// cosntrutor
	public ProdutoMercado(String codigo, String nome, double valor, int estoque) {

		super(codigo, nome, valor);

		if (valor <= 0.0)
			throw new IllegalArgumentException("Valor must be > 0.0");

		if (estoque < 0.0)
			throw new IllegalArgumentException("Estoque must be >= 0.0");

		this.estoque = estoque;

	}

	// gets e sets
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