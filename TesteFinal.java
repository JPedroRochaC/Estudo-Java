import java.util.Scanner;

public class TesteFinal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ========== INICIO ==========
        int quantClientes;
        int i = 0, opcao = 0;
        int clienteT, clienteR, clienteDeposito, clienteSaque;
        double valorTransf, valorDeposito, valorSaque;

        System.out.println("===== CADASTRO DE CLIENTES =====");

        do {
            System.out.print("Quantos clientes deseja cadastrar (1 a 5): ");
            quantClientes = in.nextInt();
            if (quantClientes > 5 || quantClientes < 1) {
                System.out.println("Quantidade inválida, escolha entre 1 a 5.");
            }
        } while (quantClientes > 5 || quantClientes < 1);

        String[] nome   = new String[quantClientes];
        String[] cpf    = new String[quantClientes];
        double[] saldos = new double[quantClientes];

        // ========== CADASTRO ==========
        System.out.println("\n===== BEM VINDO(A) À ÁREA DE CADASTRO =====");

        while (i < quantClientes) {
            System.out.println("\n---- Cliente " + (i + 1) + " ----");

            System.out.print("Nome: ");
            nome[i] = in.nextLine();

            System.out.print("CPF (somente números): ");
            cpf[i] = in.next();
            while (cpf[i].length() != 11 || !cpf[i].matches("\\d+")) {
                System.out.print("CPF inválido! Digite exatamente 11 números: ");
                cpf[i] = in.next();
            }

            System.out.print("Saldo inicial: R$ ");
            saldos[i] = in.nextDouble();
            while (saldos[i] < 0) {
                System.out.print("Saldo não pode ser negativo. Digite novamente: R$ ");
                saldos[i] = in.nextDouble();
            }

            i++;
        }

        // ========== MENU ==========
        while (opcao != 5) {
            System.out.print("""

                    ===== BANCO PAN =====
                    1. Depositar
                    2. Sacar
                    3. Transferir
                    4. Extrato de todos os clientes
                    5. Sair
                    Opção: """);
            opcao = in.nextInt();

            switch (opcao) {

                case 1 -> {
                    System.out.println("\n===== DEPÓSITO =====");
                    for (int j = 0; j < quantClientes; j++) {
                        System.out.println(j + " - " + nome[j]);
                    }
                    System.out.print("Escolha: ");
                    clienteDeposito = in.nextInt();
                    if (clienteDeposito < 0 || clienteDeposito >= quantClientes) {
                        System.out.println("Cliente inválido!");
                        break;
                    }
                    System.out.print("Valor: R$ ");
                    valorDeposito = in.nextDouble();
                    if (valorDeposito <= 0) {
                        System.out.println("Valor inválido!");
                        break;
                    }
                    System.out.print("Confirmar depósito? (s/n): ");
                    String confirmDep = in.next();
                    if (confirmDep.equalsIgnoreCase("n")) {
                        System.out.println("Operação cancelada.");
                        break;
                    }
                    saldos[clienteDeposito] += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                }

                case 2 -> {
                    System.out.println("\n===== SAQUE =====");
                    for (int j = 0; j < quantClientes; j++) {
                        System.out.println(j + " - " + nome[j]);
                    }
                    System.out.print("Escolha: ");
                    clienteSaque = in.nextInt();
                    if (clienteSaque < 0 || clienteSaque >= quantClientes) {
                        System.out.println("Cliente inválido!");
                        break;
                    }
                    System.out.print("Valor: R$ ");
                    valorSaque = in.nextDouble();
                    if (valorSaque <= 0) {
                        System.out.println("Valor inválido!");
                        break;
                    }
                    if (saldos[clienteSaque] < valorSaque) {
                        System.out.println("Saldo insuficiente!");
                        break;
                    }
                    System.out.print("Confirmar saque? (s/n): ");
                    String confirmSaq = in.next();
                    if (confirmSaq.equalsIgnoreCase("n")) {
                        System.out.println("Operação cancelada.");
                        break;
                    }
                    saldos[clienteSaque] -= valorSaque;
                    System.out.println("Saque realizado com sucesso!");
                }

                case 3 -> {
                    System.out.println("\n===== TRANSFERÊNCIA =====");
                    for (int j = 0; j < quantClientes; j++) {
                        System.out.println(j + " - " + nome[j]);
                    }
                    System.out.print("Cliente origem: ");
                    clienteT = in.nextInt();
                    System.out.print("Cliente destino: ");
                    clienteR = in.nextInt();
                    if (clienteT < 0 || clienteT >= quantClientes ||
                        clienteR < 0 || clienteR >= quantClientes) {
                        System.out.println("Cliente inválido!");
                        break;
                    }
                    if (clienteT == clienteR) {
                        System.out.println("Origem e destino não podem ser o mesmo cliente!");
                        break;
                    }
                    System.out.print("Valor: R$ ");
                    valorTransf = in.nextDouble();
                    if (valorTransf <= 0) {
                        System.out.println("Valor inválido!");
                        break;
                    }
                    if (saldos[clienteT] < valorTransf) {
                        System.out.println("Saldo insuficiente!");
                        break;
                    }
                    System.out.print("Confirmar transferência? (s/n): ");
                    String confirmTrans = in.next();
                    if (confirmTrans.equalsIgnoreCase("n")) {
                        System.out.println("Operação cancelada.");
                        break;
                    }
                    saldos[clienteT] -= valorTransf;
                    saldos[clienteR] += valorTransf;
                    System.out.println("Transferência realizada com sucesso!");
                }

                case 4 -> {
                    System.out.println("\n===== EXTRATO =====");
                    for (int j = 0; j < quantClientes; j++) {
                        String cpfMascarado = "***.***.***-" + cpf[j].substring(9);
                        System.out.printf("Nome: %-20s | CPF: %s | Saldo: R$ %.2f%n",
                                nome[j], cpfMascarado, saldos[j]);
                    }
                }

                case 5 -> System.out.println("===== ATÉ LOGO! =====");

                default -> System.out.println("Opção inválida! Selecione entre 1 a 5.");
            }
        }

        in.close();
    }
}