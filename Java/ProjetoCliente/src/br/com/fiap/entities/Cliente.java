package br.com.fiap.entities;

public class Cliente {
    private String cpf;
    private int idade;

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
}

