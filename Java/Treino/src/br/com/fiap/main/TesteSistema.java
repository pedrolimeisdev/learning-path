package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

public class TesteSistema {
    public static void main(String[] args) {
        Colaborador c = new Colaborador();
        Endereco e = new Endereco();
        Produto p = new Produto();

        c.setEndereco(e);

        e.setRua("augusta");
        e.setNumero(11);
        e.setBairro("higienopolis");
        e.setCidade("são paulo");
        e.setCep("8959-98");

        c.setCargo("Gerente");
        c.setCpf("402462328-11");
        c.setIdade(18);
        c.setNome("Pedro");
        c.setSalario(5450);

        p.setCodigo(424);
        p.setMarca("Apple");
        p.setPreco(4000);
        p.setTipo("Big");

        System.out.println(c + "" + p);


    }
}
