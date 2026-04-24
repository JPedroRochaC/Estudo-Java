import java.util.Scanner;

public class index {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        String vermelho = "\u001B[31m";
        String verde    = "\u001B[32m";
        String amarelo  = "\u001B[33m";
        String laranja  = "\u001B[38;2;255;140;0m";
        String azul     = "\u001B[36m";
        String reset    = "\u001B[0m";
        int opcao = 0;
        int escolha;

        System.out.println("=====================================================");
        System.out.println(azul + "  GUIA DE SEGURANÇA DIGITAL / SIMULAÇÃO DE CENÁRIOS" + reset);
        System.out.println("=====================================================");

        while (opcao != 4) {
            System.out.println("\nMENU PRINCIPAL - Selecione uma opção:");
            System.out.println("1. Recebi um link suspeito");
            System.out.println("2. Me pediram minha senha");
            System.out.println("3. Meu perfil foi hackeado");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = in.nextInt();

            switch (opcao) {

                // ========================//
                // CASE 1 - LINK SUSPEITO  //
                // ========================//
                case 1:
                    System.out.println("\n==============================");
                    System.out.println(laranja + "        LINK SUSPEITO         " + reset);
                    System.out.println("==============================");
                    System.out.println("\nSituação:");
                    System.out.println("Você recebeu no WhatsApp:");
                    System.out.println("\"Parabéns! Você ganhou R$500 no Pix. Clique aqui: bit.ly/premia\"\n");
                    System.out.println("O que você faz?");
                    System.out.println("1. Clico no link pra ver do que se trata");
                    System.out.println("2. Verifico se o remetente é de confiança antes de qualquer ação");
                    System.out.println("3. Encaminho pros meus contatos pra avisar");
                    System.out.print("\nEscolha: ");
                    escolha = in.nextInt();

                    if (escolha == 1) {
                        System.out.println("\n------------------------------");
                        System.out.println(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        System.out.println("------------------------------");
                        System.out.println("Você caiu no golpe! Links encurtados como bit.ly escondem");
                        System.out.println("o destino real. Clicar pode instalar vírus ou roubar seus dados.");
                        System.out.println(amarelo + "--> DICA: Nunca clique em links de prêmios não solicitados!" + reset);
                        System.out.println("------------------------------\n");
                    } else if (escolha == 2) {
                        System.out.println("\n------------------------------");
                        System.out.println(verde + "  PARABÉNS - RESPOSTA CERTA!  " + reset);
                        System.out.println("------------------------------");
                        System.out.println("Ótima decisão! Antes de qualquer ação, sempre verifique");
                        System.out.println("quem enviou a mensagem. Números desconhecidos e promessas");
                        System.out.println("de prêmio são sinais claros de golpe.");
                        System.out.println(amarelo + "--> DICA: Desconfie sempre. Nenhuma empresa sorteia prêmio por WhatsApp!" + reset);
                        System.out.println("------------------------------\n");
                    } else if (escolha == 3) {
                        System.out.println("\n------------------------------");
                        System.out.println(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        System.out.println("------------------------------");
                        System.out.println("Encaminhar é ainda pior! Você estaria espalhando");
                        System.out.println("o golpe para amigos e familiares que confiam em você.");
                        System.out.println(amarelo + "--> DICA: Ao receber algo suspeito, delete e avise as pessoas sem encaminhar!" + reset);
                        System.out.println("------------------------------\n");
                    } else {
                        System.out.println(vermelho + "\nResposta inválida. Tente novamente.\n" + reset);
                    }
                    break;

                // ================================//
                // CASE 2 - ME PEDIRAM MINHA SENHA //
                // ================================//
                case 2:
                    System.out.println("\n==============================");
                    System.out.println(laranja + "     PEDIRAM MINHA SENHA      " + reset);
                    System.out.println("==============================");
                    System.out.println("\nSituação:");
                    System.out.println("Você recebeu um e-mail do \"Banco X\":");
                    System.out.println("\"Sua conta será bloqueada. Mande sua senha para confirmar.\"\n");
                    System.out.println("O que você faz?");
                    System.out.println("1. Informo a senha, não quero perder minha conta");
                    System.out.println("2. Acesso o site oficial do banco digitando o endereço no navegador");
                    System.out.println("3. Respondo o e-mail pedindo mais informações");
                    System.out.print("\nEscolha: ");
                    escolha = in.nextInt();

                    if (escolha == 1) {
                        System.out.println("\n------------------------------");
                        System.out.println(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        System.out.println("------------------------------");
                        System.out.println("Você foi vítima de phishing! Nenhum banco jamais");
                        System.out.println("pede sua senha por e-mail. Sua conta pode estar comprometida.");
                        System.out.println(amarelo + "--> DICA: Troque sua senha imediatamente se isso acontecer!" + reset);
                        System.out.println("------------------------------\n");
                    } else if (escolha == 2) {
                        System.out.println("\n------------------------------");
                        System.out.println(verde + "  PARABÉNS - RESPOSTA CERTA!  " + reset);
                        System.out.println("------------------------------");
                        System.out.println("Excelente! Acessar o site oficial digitando o endereço");
                        System.out.println("você mesmo é a forma mais segura. Links em e-mails");
                        System.out.println("podem redirecionar para sites falsos idênticos ao original.");
                        System.out.println(amarelo + "--> DICA: Nunca acesse o banco pelo link do e-mail, sempre pelo navegador!" + reset);
                        System.out.println("------------------------------\n");
                    } else if (escolha == 3) {
                        System.out.println("\n------------------------------");
                        System.out.println(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        System.out.println("------------------------------");
                        System.out.println("Responder confirma que seu e-mail existe e está ativo.");
                        System.out.println("Isso pode gerar ainda mais tentativas de golpe contra você.");
                        System.out.println(amarelo + "--> DICA: Nunca responda e-mails suspeitos, apenas delete!" + reset);
                        System.out.println("------------------------------\n");
                    } else {
                        System.out.println(vermelho + "\nResposta inválida. Tente novamente.\n" + reset);
                    }
                    break;

                // =================================//
                // CASE 3 - MEU PERFIL FOI HACKEADO //
                // =================================//
                case 3:
                    System.out.println("\n==============================");
                    System.out.println(laranja + "   MEU PERFIL FOI HACKEADO    " + reset);
                    System.out.println("==============================");
                    System.out.println("\nSituação:");
                    System.out.println("Você percebe que alguém acessou seu Instagram");
                    System.out.println("e está pedindo dinheiro para seus seguidores.\n");
                    System.out.println("O que você faz?");
                    System.out.println("1. Espero pra ver se a pessoa para sozinha");
                    System.out.println("2. Aviso meus contatos, recupero o acesso e ativo verificação em duas etapas");
                    System.out.println("3. Crio uma conta nova e abandono a antiga");
                    System.out.print("\nEscolha: ");
                    escolha = in.nextInt();

                    if (escolha == 1) {
                        System.out.println("\n------------------------------");
                        System.out.println(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        System.out.println("------------------------------");
                        System.out.println("Esperar é um erro grave! A cada minuto, seus seguidores");
                        System.out.println("podem estar sendo enganados e perdendo dinheiro.");
                        System.out.println(amarelo + "--> DICA: Aja rápido! Tempo é crucial quando sua conta é hackeada." + reset);
                        System.out.println("------------------------------\n");
                    } else if (escolha == 2) {
                        System.out.println("\n------------------------------");
                        System.out.println(verde + "  PARABÉNS - RESPOSTA CERTA!  " + reset);
                        System.out.println("------------------------------");
                        System.out.println("Perfeito! Avisar seus contatos evita que caiam no golpe.");
                        System.out.println("Ao recuperar o acesso, troque a senha imediatamente e");
                        System.out.println("ative o 2FA para ninguém mais conseguir entrar na sua conta.");
                        System.out.println(amarelo + "--> DICA: Ative verificação em duas etapas em TODAS as suas redes sociais!" + reset);
                        System.out.println("------------------------------\n");
                    } else if (escolha == 3) {
                        System.out.println("\n------------------------------");
                        System.out.println(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        System.out.println("------------------------------");
                        System.out.println("Abandonar não resolve! Sua conta antiga continua ativa");
                        System.out.println("e o golpista segue prejudicando quem te conhece.");
                        System.out.println(amarelo + "--> DICA: Sempre tente recuperar o acesso pelo próprio aplicativo!" + reset);
                        System.out.println("------------------------------\n");
                    } else {
                        System.out.println(vermelho + "\nResposta inválida. Tente novamente.\n" + reset);
                    }
                    break;

                case 4:
                    System.out.println("\n============================================================");
                    System.out.println(azul + "  Obrigado por usar o Guia de Segurança Digital! Até mais!" + reset);
                    System.out.println("============================================================\n");
                    break;

                default:
                    System.out.println(vermelho + "\nOpção inválida! Digite um número entre 1 e 4.\n" + reset);
            }
        }
    in.close();
    }
}