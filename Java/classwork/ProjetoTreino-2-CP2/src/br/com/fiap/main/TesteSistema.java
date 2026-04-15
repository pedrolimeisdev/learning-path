package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real (String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        //String nome, double altura, int idade, String cpf
        Cliente objCliente = new Cliente(
                texto("Nome"),
                real("Altura"),
                inteiro("idade"),
                texto("CPF")
        );

        //String logradouro, String bairro, String cidade, String cep, String estado, String complemento, int numero
        Endereco objEndereco = new Endereco(
                texto("Logradouro"),
                texto("Bairro"),
                texto("Cidade"),
                texto("CEP"),
                texto("Estado"),
                texto("Complemento"),
                inteiro("Numero")
        );

        objCliente.setEndereco(objEndereco);

        //int codigo, String tipo, String marca, String preco
        Produto objProduto = new Produto(
                inteiro("Código"),
                texto("Tipo"),
                texto("Marca"),
                texto("Preço")

        );

        System.out.println(
                objCliente + "" + objProduto
        );
    }
}
