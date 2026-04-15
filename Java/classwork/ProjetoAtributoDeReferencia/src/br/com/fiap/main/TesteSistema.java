package br.com.fiap.main;


import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;

public class TesteSistema {

    public static void main(String[] args) {

        // Instanciar objetos
        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();

        // Entradas
        objCliente.setNome("TADALA");
        objCliente.setCpf("222.222.222/22");
        objCliente.setIdade(78);
        objCliente.setAltura(1.75);

        objEndereco.setLogradouro("Rua Apito do Vapor");
        objEndereco.setNumero(222);
        objEndereco.setComplemento("Casa");
        objEndereco.setCep("08484-440");
        objEndereco.setBairro("Jabaquara");
        objEndereco.setCidade("São Paulo");
        objEndereco.setEstado("SP");

        objCliente.setEndereco(objEndereco);


        // Saídas
        System.out.println(
                "Nome: " + objCliente.getNome() +
                "\nCPF: "  + objCliente.getCpf() +
                "\nIdade: " + objCliente.getIdade() +
                "\nAltura: " + objCliente.getAltura() +
                 "\n\nEndereço\nLogradouro: " + objCliente.getEndereco().getLogradouro()  +
                 "\nNumero: " + objCliente.getEndereco().getNumero() +
                 "\nComplemento: " + objCliente.getEndereco().getComplemento() +
                 "\nCEP: " + objCliente.getEndereco().getCep() +
                 "\nBairro: " + objCliente.getEndereco().getBairro() +
                 "\nCidade: " + objCliente.getEndereco().getCidade() +
                 "\nEstado: " + objCliente.getEndereco().getEstado()
                );
    }
}

