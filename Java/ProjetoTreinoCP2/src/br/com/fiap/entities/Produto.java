package br.com.fiap.entities;

public class Produto {
    private String marca;
    private int numprod;
    private String validade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumprod() {
        return numprod;
    }

    public void setNumprod(int numprod) {
        this.numprod = numprod;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {

        this.validade = validade;
    }

    public Produto() {
    }

    public Produto(String marca, int numprod, String validade) {
        this.marca = marca;
        this.numprod = numprod;
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "\n\nProduto" +
                "\nmarca='" + marca + '\'' +
                ",\nnumprod=" + numprod +
                ",\nvalidade='" + validade;
    }
}
