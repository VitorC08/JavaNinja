package JavaNinja.Desafios.BancoKonoha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("==== Banco Konoha ====");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Acessar Conta Corrente");
            System.out.println("2 - Acessar Conta Poupança");
            System.out.println("5 - Sair do Sistema.");

            option = scanner.nextInt();

            switch (option) {
                case 1: {
                    ContaCorrente contaCorrente = new ContaCorrente(0.00);
                    int subOption;

                    do {
                        System.out.println("=== Conta Corrente ===");
                        System.out.println("Escolha uma operação: ");
                        System.out.println("1 - Depositar valores.");
                        System.out.println("2 - Consultar meu saldo.");
                        System.out.println("3 - Efetuar Saque.");
                        System.out.println("4 - Voltar para o Menu principal.");

                        subOption = scanner.nextInt();

                        switch (subOption) {
                            case 1:
                                System.out.println("Digite o valor que deseja depositar: ");
                                double valor = scanner.nextDouble();
                                contaCorrente.depositar(valor);
                                break;
                            case 2:
                                contaCorrente.consultarSaldo();
                                break;
                            case 3:
                                System.out.println("Digite o valor que deseja sacar: ");
                                double valorDoSaque = scanner.nextDouble();
                                contaCorrente.sacar(valorDoSaque);
                                System.out.println("Saque efetuado com sucesso !");
                            case 4:
                                System.out.println("Voltando para o menu principal...");
                                break;
                            default:
                                System.out.println("Operação inválida !");
                        }
                    } while (subOption != 4);
                    break;
                }
                case 2: {
                    ContaPoupanca contaPoupanca = new ContaPoupanca(0.00);
                    int subOption;

                    do {
                        System.out.println("=== Conta Corrente ===");
                        System.out.println("Escolha uma operação: ");
                        System.out.println("1 - Depositar valores.");
                        System.out.println("2 - Consultar meu saldo.");
                        System.out.println("4 - Voltar para o Menu principal.");

                        subOption = scanner.nextInt();

                        switch (subOption) {
                            case 1: {
                                double valor = scanner.nextDouble();
                                contaPoupanca.depositar(valor);
                                System.out.println("Valor depositado com sucesso !");
                                break;
                            }
                            case 2: {
                                contaPoupanca.consultarSaldo();
                                break;
                            }
                            case 3: {
                                System.out.println("Voltando para o menu principal...");
                                break;
                            }
                            default:
                                System.out.println("Operação Inválida !");
                        }
                    } while (subOption != 4);
                    break;
                }
            }
        }while (option != 5) ;
    }
}