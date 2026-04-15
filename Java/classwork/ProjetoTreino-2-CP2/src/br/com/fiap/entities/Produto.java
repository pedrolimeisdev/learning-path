package br.com.fiap.entities;

public class Produto {
    private int codigo;
    private String preco;
    private String marca;
    private String tipo;

    public Produto() {
    }

    public Produto(int codigo, String tipo, String marca, String preco) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n\nInformaçoes do Produto:" +
                "\ncodigo=" + codigo +
                ", \npreco='" + preco + '\'' +
                ", \nmarca='" + marca + '\'' +
                ", \ntipo='" + tipo;
    }
}
