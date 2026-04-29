package br.com.fiap.entities;

public class PessoaFisica extends Pessoa {

    // visibilidade, tipo de dados e atributo
    private String cpf;
    private String rg;
    private String dataNascimento;
    private DadosBancarios dadosBancarios; // atributo de referencia

    // metodo construtor com parametro vazio
    public PessoaFisica() {
    }

    // metodo construtor com parametro cheio, sem atributo de referencia
    public PessoaFisica(String cpf, String rg, String dataNascimento) {
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // metodo construtor com parametro cheio e herança
    public PessoaFisica(String nome, String email, String fone, double renda, String cpf, String rg, String dataNascimento) {
        super(nome, email, fone, renda);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // metodos getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public DadosBancarios getDadosBancarios() {
        return dadosBancarios;
    }

    public void setDadosBancarios(DadosBancarios dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }


    @Override
    public String toString() {
        return tipoPessoa() +
                super.toString() +
                "\nCPF = '" + cpf + '\'' +
                "\nRG = '" + rg + '\'' +
                "\nData de Nascimento = '" + dataNascimento + '\''
                + dadosBancarios; // Carrega o toString do atributo de referencia
    }

    // metodo herdado da superclasse
    @Override
    public String tipoPessoa() {
        return "PESSOA FÍSICA";
    }
}
