package quest11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Conta> contas = new ArrayList<>();
        System.out.println("quantidade de contas");
        double qtde = scanner.nextInt();

        for (int i = 0; i < qtde; i++) {
            Conta c = new Conta();
            System.out.println("nome de conta");
            c.setNome(scanner.nextLine());
            scanner.nextLine();
            System.out.println("cpf");
            c.setCpf(scanner.next());
            scanner.nextLine();
            System.out.println("numero da conta");
            c.setNumero(scanner.nextLine());
            System.out.println("saldo R$: ");
            c.setSaldo(scanner.nextDouble());
            scanner.nextLine();

            contas.add(c);
        }

        System.out.println("MENU DE ESCOLHA :)\n" +
                "1- ver status da conta\n" +
                "2- realizar saque\n" +
                "3- realizar deposito\n" +
                "4- terminar atendimento");
        String acao = scanner.nextLine();
        switch (acao) {
            case "1":
                System.out.println("as informações são: " + contas.toString());
                break;

            case "2":
                System.out.println("qual conta?(lista começa em 0)");
                int indiceSaque = scanner.nextInt();
                Conta contaSaque = contas.get(indiceSaque);

                boolean sucesso = false;
                while (!sucesso) {
                    System.out.println("quanto deseja sacar? ");
                    double valorSaque = scanner.nextDouble();
                    sucesso = contaSaque.saque(valorSaque);
                }

                System.out.println("saldo após o saque: " + contaSaque.getSaldo());
                break;

            case "3":
                System.out.println("qual conta? (número da lista, começando em 0)");
                int indiceDeposito = scanner.nextInt();
                System.out.println("quanto deseja depositar?");
                double valorDeposito = scanner.nextDouble();

                Conta contaDeposito = contas.get(indiceDeposito);
                contaDeposito.deposito(valorDeposito);
                System.out.println("Saldo após depósito: " + contaDeposito.getSaldo());
                break;


            default:
                System.out.println("opção inválida");

        }

    }
}


