package br.com.fiap.entities;

public class Colaborador {
    private String nome;
    private String cpf;
    private int idade;
    private String cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n\nColaborador{" +
                "\nnome='" + nome + '\'' +
                ", \ncpf='" + cpf + '\'' +
                ", \nidade=" + idade +
                ", \ncargo='" + cargo + '\'' +
                ", \nsalario=" + salario +
                ", \nendereco=" + endereco +
                '}';
    }
}
