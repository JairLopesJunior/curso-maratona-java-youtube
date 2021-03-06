package com.youtube.maratonajava.Hheranca.dominio;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("=====================");
        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
