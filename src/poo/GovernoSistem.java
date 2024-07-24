package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GovernoSistem {

    List<Cliente> listaDeClientes = new ArrayList<>();

    public void cadastrarCliente(Scanner scanner) {
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe seu melhor email: ");
        String email = scanner.nextLine();

        System.out.println("Digite seu endereco: ");
        System.out.println("Informe o estado: (RS, SP, RJ...)");
        String estado = scanner.nextLine();
        System.out.println("Informe a cidade: ");
        String cidade = scanner.nextLine();
        System.out.println("Informe o bairro: ");
        String bairro = scanner.nextLine();

        System.out.println("Informe seu número de telefone: ");
        String telefone = scanner.nextLine();

        listaDeClientes.add(new Cliente(nome, email, new Endereco(estado, cidade, bairro), telefone));
        System.out.println("Cadastro realizado com sucesso!");
    }

    public void listarClientes() {
        for (Cliente cliente : listaDeClientes) {
            System.out.println(cliente);
        }
    }

    public void validarAuxilio(Scanner scanner) {
        System.out.println("Informe seu email: ");
        String email = scanner.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaDeClientes) {
            if (cliente.getEmail().equals(email)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            if (verificarEndereco(clienteEncontrado)) {
                System.out.println("Boas notícias! Você tem direito ao auxílio, fique atento ao seu email.");
            } else {
                System.out.println("Infelizmente, o auxílio não está disponível na sua região.");
            }
        } else {
            System.out.println("Cadastro não encontrado!");
        }
    }

    public boolean verificarEndereco(Cliente cliente) {
        return cliente.getEndereco().getEstado().equals("RS") &&
                (cliente.getEndereco().getCidade().equals("Porto Alegre") ||
                        cliente.getEndereco().getCidade().equals("Canoas"));
    }
}
