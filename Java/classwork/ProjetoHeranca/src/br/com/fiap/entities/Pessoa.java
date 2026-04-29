package br.com.fiap.entities;

public abstract class Pessoa {

    // visibilidade, tipo de dados e atributo
    protected String nome;
    protected String email;
    protected String fone;
    protected double renda;

    // metodo construtor com parametro vazio
    public Pessoa() {
    }

    // metodo construtor com parametro cheio
    public Pessoa(String nome, String email, String fone, double renda) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.renda = renda;
    }

    // metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return
                "\nNome = '" + nome + '\'' +
                "\nEmail = '" + email + '\'' +
                "\nFone = '" + fone + '\'' +
                "\nRenda = " + renda;
    }

    // metodo abstrato (obrigatório nas subclasses)
    public abstract String tipoPessoa();
}
