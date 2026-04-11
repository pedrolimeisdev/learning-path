package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteSistema {

    // String
    static String texto (String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int inteiro (String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real (String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }


    public static void main(String[] args) {

        //instanciar objetos

        //String nome, double renda, int idade, String cpf
        Cliente objCliente = new Cliente(
                texto("Digite seu Nome: "),
                real("Digite sua Renda: "),
                inteiro("Digite sua idade: "),
                texto("Digite seu CPF:")

        );

        //String logradouro, String estado, String cidade, String bairro, String cep, String complemento, int numero
        Endereco objEndCliente= new Endereco(
                texto("Digite o Logradouro: "),
                texto("Digite o estado: "),
                texto("Digite a cidade: "),
                texto("Digite o bairro: "),
                texto("Digite o cep: "),
                texto("Digite o complemento: "),
                inteiro("Digite o número: ")

        );

        objCliente.setEndereco(objEndCliente);

        //int codigo, String tipo, String marca, double valor
        Produto objProduto = new Produto(
                inteiro("Digite o código: "),
                texto("Digite o tipo: "),
                texto("Digite a marca: "),
                real("Digite o valor: ")

        );

        System.out.println(objCliente + "" + objProduto);
    }
}
