package br.com.fiap.entities;

public class Endereco {

    // visibilidade, tipo de dados e atributo
    private String logradouro;
    private int numero;
    private String cep;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    // metodo construtor com parametro vazio
    public Endereco() {
    }

    // metodo construtor com parametro cheio
    public Endereco(String logradouro, int numero, String cep, String complemento, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    // getters e setters
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // toString
    @Override
    public String toString() {
        return "\nEndereço " +
                "\nlogradouro='" + logradouro + '\'' +
                "\nnumero=" + numero +
                "\ncep='" + cep + '\'' +
                "\ncomplemento='" + complemento + '\'' +
                "\nbairro='" + bairro + '\'' +
                "\ncidade='" + cidade + '\'' +
                "\nestado='" + estado + '\'';
    }
}
