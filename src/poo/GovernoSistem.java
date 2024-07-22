package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GovernoSistem {

    Cliente cliente = new Cliente();
    List<Cliente> listaDeClientes = new ArrayList<>();

    public Cliente cadastrarCliente(Scanner scanner) {
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe seu melhor email: ");
        String email = scanner.nextLine();

        System.out.println("Digite seu endereco: ");
        System.out.println("informe o estado: ");
        String estado = scanner.nextLine();
        System.out.println("Informe a cidade: ");
        String cidade = scanner.nextLine();
        System.out.println("Informe o bairro: ");
        String bairro = scanner.nextLine();

        System.out.println("Informe seu número de telefone: ");
        int telefone = scanner.nextInt();
        scanner.nextLine();

        return new Cliente(nome,email,new Endereco(estado,cidade,bairro),telefone);
    }
}
