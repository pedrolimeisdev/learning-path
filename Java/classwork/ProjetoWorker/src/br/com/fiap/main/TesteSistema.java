package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;

import javax.swing.*;

public class TesteSistema {

    // String
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Instaciar objetos
        // int numeroRegistro, String nome, String cargo, double qtdadeHora, double valorHora
        Colaborador objColaborador = new Colaborador(
                inteiro("Informações do Colaborador\n Numero de registro"),
                texto("Nome"),
                texto("Cargo"),
                real("Quantidade de horas trabalhadas"),
                real("Valor da hora trabalhada")
        );

        // Saídas
        System.out.println(
                objColaborador
        );
    }
}
