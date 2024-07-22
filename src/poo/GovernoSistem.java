package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GovernoSistem {

    Cliente cliente = new Cliente();
    List<Cliente> listaDeClientes = new ArrayList<>();

    public void cadastrarCliente(Scanner scanner) {
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe seu melhor email: ");
        String email = scanner.nextLine();

        System.out.println("Digite seu endereco: ");
        System.out.println("informe o estado: (RS, SP, RJ...)");
        String estado = scanner.nextLine();
        System.out.println("Informe a cidade: ");
        String cidade = scanner.nextLine();
        System.out.println("Informe o bairro: ");
        String bairro = scanner.nextLine();

        System.out.println("Informe seu número de telefone: ");
        int telefone = scanner.nextInt();
        scanner.nextLine();

        listaDeClientes.add(new Cliente(nome, email, new Endereco(estado, cidade, bairro), telefone));
    }

    public List<Cliente> listarClientes() {
        return listaDeClientes;
    }

    public void validarAuxilio(Cliente cliente) {
        if (verificarEndereco(cliente) == true) {
            System.out.println("Boas noticias! Você tem direito ao auxilio, fique atento ao email.");
        } else
            System.out.println("Infelizmente o auxilio não esta disponivel na sua região.");
    }

    public boolean verificarEndereco(Cliente cliente) {
        if (cliente.getEndereco().getEstado().equals("RS") &&
            (cliente.getEndereco().getCidade().equals("Porto Alegre") ||
                cliente.getEndereco().getCidade().equals("Canoas"))) {
            return true;
        } else
            return false;
    }
}
