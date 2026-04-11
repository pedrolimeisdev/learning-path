package br.com.fiap.entities;

public class Cliente {

    // visibilidade, tipo de dados e atributos
    private String nome;   // TADALA
    private String cpf;    // 222.222.222/22
    private int idade;     // 78
    private double altura; // 1.75
    private Endereco endereco; // atributo de referencia

    // metodos setters (entradas) e getters (retornar \ exibir)
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
