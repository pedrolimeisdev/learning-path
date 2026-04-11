package br.com.fiap.entities;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private double salario;
    private Endereco endereco;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cliente() {
    }

    public Cliente(String nome, int idade, double salario, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\n\nCliente: " +
                "\nnome='" + nome + '\'' +
                ",\ncpf='" + cpf + '\'' +
                ",\nidade=" + idade +
                ",\nsalario=" + salario + endereco;

    }
}

