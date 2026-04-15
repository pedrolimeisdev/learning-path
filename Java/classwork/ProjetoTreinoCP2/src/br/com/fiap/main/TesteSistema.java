package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteSistema {

    static String texto (String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro (String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real (String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        //String nome, int idade, double salario, String cpf
        Cliente objCliente = new Cliente(
                texto("NOME:"),
                inteiro("IDADE: "),
                real("SALÁRIO: "),
                texto("CPF: ")
        );

        //String marca, int numprod, String validade
        Produto objProduto = new Produto(
                texto("MARCA: "),
                inteiro("NÚMERO DO PRODUTO: "),
                texto("VALIDADE DO PRODUTO")
        );

        Endereco objEndereco = new Endereco(
                //String cep, int numero, String logradouro, String cidade, String bairro, String complemento
                texto("CEP: "),
                inteiro("NÚMERO: "),
                texto("LOGRADOURO: "),
                texto("CIDADE: "),
                texto("BAIRRO: "),
                texto("COMPLEMENTO: ")
        );

        objCliente.setEndereco(objEndereco);

        System.out.println(
                objCliente + "" + objProduto
        );
    }
}
