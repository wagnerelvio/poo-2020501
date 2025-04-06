// Programa principal
package abstrata;

import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria cc = new ContaCorrente("Jose", 1000.0);
        ContaBancaria cp = new ContaPoupanca("Cristine", 800.0);

        int opcao;
        do {
            System.out.println("\n======= MENU BANCÁRIO =======");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cc.consultarSaldo();
                    cp.consultarSaldo();
                    break;

                case 2:
                    System.out.print("Escolha a conta (1 - Corrente | 2 - Poupança): ");
                    int contaDep = sc.nextInt();
                    System.out.print("Valor para depositar: R$ ");
                    double valorDep = sc.nextDouble();
                    if (contaDep == 1) cc.depositar(valorDep);
                    else if (contaDep == 2) cp.depositar(valorDep);
                    else System.out.println("Conta inválida.");
                    break;

                case 3:
                    System.out.print("Escolha a conta (1 - Corrente | 2 - Poupança): ");
                    int contaSaq = sc.nextInt();
                    System.out.print("Valor para sacar: R$ ");
                    double valorSaq = sc.nextDouble();
                    if (contaSaq == 1) cc.sacar(valorSaq);
                    else if (contaSaq == 2) cp.sacar(valorSaq);
                    else System.out.println("Conta inválida.");
                    break;

                case 4:
                    System.out.println("Transferir de:");
                    System.out.println("1 - Corrente para Poupança");
                    System.out.println("2 - Poupança para Corrente");
                    int tipoTransf = sc.nextInt();
                    System.out.print("Valor para transferir: R$ ");
                    double valorTransf = sc.nextDouble();
                    if (tipoTransf == 1) cc.transferir(cp, valorTransf);
                    else if (tipoTransf == 2) cp.transferir(cc, valorTransf);
                    else System.out.println("Opção inválida.");
                    break;

                case 0:
                    System.out.println("Saindo... Obrigado por usar o BancoApp!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
