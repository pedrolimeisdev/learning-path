package br.com.fiap.main;

import br.com.fiap.entities.DadosBancarios;
import br.com.fiap.entities.PessoaFisica;
import br.com.fiap.entities.PessoaJuridica;

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

        // Instanciar objetos
        // String nome, String email, String fone, double renda, String cpf, String rg, String dataNascimento
        PessoaFisica objPessoaFisica = new PessoaFisica(
                texto("Informações da Pessoa Física\n Nome"),
                texto("Email"),
                texto("Fone"),
                real("Renda"),
                texto("CPF"),
                texto("RG"),
                texto("Data de Nascimento")
        );

        //String banco, String agencia, String numeroConta, String tipoConta
        DadosBancarios objDadosBancarios = new DadosBancarios(
                texto("Dados Bancários da Pessoa Física\n Banco"),
                texto("Agência"),
                texto("Número da Conta"),
                texto("Tipo de Conta")
        );

        objPessoaFisica.setDadosBancarios(objDadosBancarios);

        //String nome, String email, String fone, double renda, String cnpj, String razaoSocial, String segmento
        PessoaJuridica objPessoaJuridica = new PessoaJuridica(
                texto("Informações da Pessoa Jurídica\n Nome Fantasia"),
                texto("Email"),
                texto("Fone"),
                real("Pró-Labore"),
                texto("CNPJ"),
                texto("Razão Social"),
                texto("Segmento")
        );

        // Saídas
        System.out.println(objPessoaFisica + "\n" + objPessoaJuridica);
    }
}
