package br.com.fiap.entities;

public class Colaborador {

    // visibilidade, tipo de dados e atributo
    private String nome;
    private int numeroRegistro;
    private String cargo;
    private double salario;
    private Endereco endereco;  // atributo de referencia


    // metodo construtor com parametro vazio
    public Colaborador() {
    }

    // metodo construtor com parametro cheio, sem atributo de referencia
    public Colaborador(String nome, int numeroRegistro, String cargo, double salario) {
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.cargo = cargo;
        this.salario = salario;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
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

    // toString
    @Override
    public String toString() {
        return "Colaborador " +
                "\nnome='" + nome + '\'' +
                "\nnumeroRegistro=" + numeroRegistro +
                "\ncargo='" + cargo + '\'' +
                "\nsalario=" + salario + endereco;
    }
}
