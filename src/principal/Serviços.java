package principal;

public class Serviços implements Controle {

    String codigo;
    private String nome;

    // construtor
    public Serviços(String codigo, String nome) {

        // if (codigo < 0.0)
        //     throw new IllegalArgumentException("Id produto must be >= 0.0");

        this.codigo = codigo;
        this.nome = nome;

    }

    // gets e sets

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
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
        return String.format("%s: %s / %s: %s", "id", getcodigo(), "nome", getNome());
    }

    @Override
    public void Array() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
