package br.com.fiap.entities;

public class Empresa {

    // visibilidade, tipo de dados e atributo
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String segmento;
    private Endereco endereco; // atributo de referência

    // metodo construtor com parametro vazio
    public Empresa() {
    }

    // metodo construtor com parametro cheio, sem atributo de referencia
    public Empresa(String cnpj, String nomeFantasia, String razaoSocial, String segmento) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.segmento = segmento;
    }

    // getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // toString
    @Override
    public String toString() {
        return "\n\nEmpresa " +
                "\ncnpj='" + cnpj + '\'' +
                "\nnome fantasia='" + nomeFantasia + '\'' +
                "\nrazão social='" + razaoSocial + '\'' +
                "\nsegmento='" + segmento + '\'' + endereco;
    }
}
