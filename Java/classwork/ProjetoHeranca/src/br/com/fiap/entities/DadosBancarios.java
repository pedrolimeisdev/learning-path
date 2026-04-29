package br.com.fiap.entities;

public class DadosBancarios {

    // visibilidade, tipo de dados e atributo
    private String banco;
    private String agencia;
    private String numeroConta;
    private String tipoConta;

    // metodo construtor com parametro vazio
    public DadosBancarios() {
    }

    // metodo construtor com parametro cheio
    public DadosBancarios(String banco, String agencia, String numeroConta, String tipoConta) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    // metodos getters e setters
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "\nDADOS BANCÁRIOS " +
                "\nBanco = '" + banco + '\'' +
                "\nAgência = '" + agencia + '\'' +
                "\nNúmero da Conta = '" + numeroConta + '\'' +
                "\nTipo de Conta = '" + tipoConta + '\'';
    }
}
