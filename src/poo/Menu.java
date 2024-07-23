package poo;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GovernoSistem governoSistem = new GovernoSistem();

        while (true) {

            System.out.print("##--Auxilio Calamidade RS--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Novo Cadastro     |\n");
            System.out.print("| Opção 2 - Clientes          |\n");
            System.out.print("| Opção 3 - Consultar Auxilio |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 4) {
                System.out.println("Até mais!");
            }

            switch (opcao) {
                case 1:
                    governoSistem.cadastrarCliente(scanner);
                    break;

                case 2:
                    governoSistem.listarClientes();
                    break;

                case 3:
                    governoSistem.validarAuxilio();
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

}
