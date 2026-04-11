package br.com.fiap.main;

import br.com.fiap.entities.Cliente;

import java.util.Scanner;

public class TesteCliente{
    public static void main(String[] args) {
        Cliente pedro_cpf = new Cliente();
        Cliente pedro_idade = new Cliente();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu cpf:");
        pedro_cpf.setCpf(sc.nextLine());
        System.out.println("Digite seu idade:");
        pedro_idade.setIdade(sc.nextInt());

        System.out.println("Seu cpf é: " + pedro_cpf.getCpf());
        System.out.println("Sua idade é: " + pedro_idade.getIdade());
    }
}
