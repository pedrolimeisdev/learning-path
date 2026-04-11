package br.com.fiap.entities;

public class Endereco {
    private String cep;
    private String bairro;
    private String cidade;
    private String logradouro;
    private int numero;
    private String complemento;

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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Endereco() {
    }

    public Endereco(String cep, int numero, String logradouro, String cidade, String bairro, String complemento) {
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "\n\nEndereco: " +
                "\ncep='" + cep + '\'' +
                ",\nbairro='" + bairro + '\'' +
                ",\ncidade='" + cidade + '\'' +
                ",\nlogradouro='" + logradouro + '\'' +
                ",\nnumero=" + numero +
                ",\ncomplemento='" + complemento;
    }
}

