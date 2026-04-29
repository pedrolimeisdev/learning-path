package br.com.fiap.entities;

public class Colaborador {

    private int numeroRegistro;
    private String nome;
    private String cargo;
    private double qtdadeHora;
    private double valorHora;
    private double percentual; // utilizado para calculo

    public Colaborador() {
    }

    public Colaborador(int numeroRegistro, String nome, String cargo, double qtdadeHora, double valorHora) {
        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
        this.cargo = cargo;
        this.qtdadeHora = qtdadeHora;
        this.valorHora = valorHora;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getQtdadeHora() {
        return qtdadeHora;
    }

    public void setQtdadeHora(double qtdadeHora) {
        this.qtdadeHora = qtdadeHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public String toString() {
        return "Colaborador " +
                "\nNumero de registro = " + numeroRegistro +
                "\nNome = '" + nome + '\'' +
                "\nCargo = '" + cargo + '\'' +
                "\nQuantidade de horas trabalhadas = " + qtdadeHora +
                "\nValor da hora trabalhada = " + valorHora +
                "\nCalculo do IR = " + calcularIr() +
                "\nPercentual de desconto = " + percentual +
                "\n\nCalculo do salário = " + calcularSalario() +
                "\n\nStatus de contribuição de IR = " + status() +
                "\n\nSalário Liquido com deconto de IR = " + salarioLiquido();
    }
    // Metodos workers
    // calcularSalario
    public double calcularSalario() {
        return valorHora * qtdadeHora;
    }

    // calcularIr   * calculos simplificados com valores ficticios
    public double calcularIr() {
        double calculo = 0;
        if (calcularSalario() <= 5000.00) {
            this.percentual = 0;
            calculo = percentual;
        } else {
            this.percentual = 7.5;
            calculo = calcularSalario() * percentual / 100;
        }
        return calculo;
    }

    // status
    public String status() {
        String informacao = null;
        if (calcularSalario() <= 5000.00) {
            informacao = "Isento de IR";
        } else {
            informacao = "Contribuinte de IR";
        }
        return informacao;
    }

    // salarioLiquido
    public double salarioLiquido() {
        return calcularSalario() - calcularIr();
    }
}
