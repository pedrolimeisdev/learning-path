package br.com.fiap.entities;

public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String estado;
    private String cep;
    private String cidade;
    private String bairro;

    public Endereco() {
    }

    public Endereco(String logradouro, String bairro, String cidade, String cep, String estado, String complemento, int numero) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.complemento = complemento;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\n\nEndereco do Cliente:" +
                "\nlogradouro='" + logradouro + '\'' +
                ", \nnumero=" + numero +
                ", \ncomplemento='" + complemento + '\'' +
                ", \nestado='" + estado + '\'' +
                ", \ncep='" + cep + '\'' +
                ", \ncidade='" + cidade + '\'' +
                ", \nbairro='" + bairro;
    }
}
