package br.com.fiap.entities;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String cidade;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "\n\nEndereco{" +
                "\nrua='" + rua + '\'' +
                ", \nnumero=" + numero +
                ", \nbairro='" + bairro + '\'' +
                ", \ncep='" + cep + '\'' +
                ", \ncidade='" + cidade + '\'' +
                '}';
    }
}
