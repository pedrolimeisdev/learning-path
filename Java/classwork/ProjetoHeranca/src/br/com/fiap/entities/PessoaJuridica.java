package br.com.fiap.entities;

public class PessoaJuridica extends Pessoa {

    // visibilidade, tipo de dados e atributo
    private String cnpj;
    private String razaoSocial;
    private String segmento;

    // metodo construtor com parametro vazio
    public PessoaJuridica() {
    }

    // metodo construtor com parametro cheio
    public PessoaJuridica(String cnpj, String razaoSocial, String segmento) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.segmento = segmento;
    }

    // metodo construtor com parametro cheio e herança
    public PessoaJuridica(String nome, String email, String fone, double renda, String cnpj, String razaoSocial, String segmento) {
        super(nome, email, fone, renda);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.segmento = segmento;
    }

    // metodos getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    @Override
    public String toString() {
        return tipoPessoa() +
                "\nNome = '" + nome + '\'' +
                "\nEmail = '" + email + '\'' +
                "\nFone = '" + fone + '\'' +
                "\nRenda = " + renda +
                "\nCNPJ = '" + cnpj + '\'' +
                "\nRazão Social = '" + razaoSocial + '\'' +
                "\nSegmento = '" + segmento + '\'';
    }

    // metodo herdado da superclasse
    @Override
    public String tipoPessoa() {
        return "\nPESSOA JURÍDICA";
    }
}
