package parte1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "";
        int idade;
        String email;
        String endereco;

        while (true) {
            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Novo Cadastro     |\n");
            System.out.print("| Opção 2 - Clientes          |\n");
            System.out.print("| Opção 3 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 3) {
                System.out.println("Ate mais!");
                scanner.close();
            }

            switch (opcao) {

                case 1:
                    System.out.println("Digite seu nome:");
                    nome = scanner.nextLine();
                    if (nome.matches("[a-zA-ZÀ-ÖØ-öø-ÿ]+(\\s+[a-zA-ZÀ-ÖØ-öø-ÿ]+)*")) {
                        System.out.println("Cadastro feito com sucesso!");
                    } else {
                        System.out.println("O nome nao pode obter numeros ou simbolos !");
                        nome = "";
                    }
                    break;

                case 2:
                    System.out.println(nome);
                    break;

                default:
                    System.out.println("Opção invalida !");
                    break;
            }
        }


    }
}
