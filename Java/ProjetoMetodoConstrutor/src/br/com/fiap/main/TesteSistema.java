package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Empresa;
import br.com.fiap.entities.Endereco;

import javax.swing.*;

public class TesteSistema {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int inteiro(String j){
        return Integer.parseInt( JOptionPane.showInputDialog(j) );
    }

    // double
    static double real(String j){
        return Double.parseDouble( JOptionPane.showInputDialog(j) );
    }

    public static void main(String[] args) {

        // Instanciar objetos
        // String nome, int numeroRegistro, String cargo, double salario
        Colaborador objColaborador = new Colaborador(
        texto("Informações do colaborador\n Nome"),
        inteiro("Nº do registro"),
        texto("Cargo"),
        real("Salário")
        );

        // String logradouro, int numero, String cep, String complemento, String bairro, String cidade, String estado
        Endereco objEndColaborador = new Endereco(
        texto("Informações do endereço do colaborador\n Logradouro"),
        inteiro("Número"),
        texto("CEP"),
        texto("Complemento"),
        texto("Bairro"),
        texto("Cidade"),
        texto("Estado")
        );

        objColaborador.setEndereco(objEndColaborador);

        // String cnpj, String nomeFantasia, String razaoSocial, String segmento
        Empresa objEmpresa = new Empresa(
        texto("Informações da Empresa\n CNPJ"),
        texto("Nome fantasia"),
        texto("Razão social"),
        texto("Segmento")
        );

       // String logradouro, int numero, String cep, String complemento, String bairro, String cidade, String estado
        Endereco objEndEmpresa = new Endereco(
                texto("Informações do endereço da empresa\n Logradouro"),
                inteiro("Número"),
                texto("CEP"),
                texto("Complemento"),
                texto("Bairro"),
                texto("Cidade"),
                texto("Estado")
        );

        objEmpresa.setEndereco(objEndEmpresa);

        System.out.println(
                objColaborador + "" + objEmpresa
        );
    }
}
