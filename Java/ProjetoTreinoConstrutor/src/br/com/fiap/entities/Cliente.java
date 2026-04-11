package br.com.fiap.entities;

public class Cliente {

    // visibilidade, tipo de dados e atributos

    private String nome;
    private String cpf;
    private int idade;
    private double renda;
    private Endereco endereco;

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // metodo construtor com parâmetro vazio

    public Cliente() {
    }


    // metodo construtor com parâmetro cheio, sem atributo de refrência

    public Cliente(String nome, double renda, int idade, String cpf) {
        this.nome = nome;
        this.renda = renda;
        this.idade = idade;
        this.cpf = cpf;
    }

    // toString

    @Override
    public String toString() {
        return "\n\nCliente{" +
                "\nnome='" + nome + '\'' +
                ", \ncpf='" + cpf + '\'' +
                ", \nidade=" + idade +
                ", \nrenda=" + renda + endereco;

    }
}
