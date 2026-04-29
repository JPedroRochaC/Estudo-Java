import java.util.Scanner;
public class trabaprog {
    // MÉTODO LINHA
    static void linha() {
        System.out.println("\n------------------------------");
    }
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        String vermelho = "\u001B[31m";
        String verde    = "\u001B[32m";
        String amarelo  = "\u001B[33m";
        String laranja  = "\u001B[38;2;255;140;0m";
        String azul     = "\u001B[36m";
        String reset    = "\u001B[0m";
        String nome;
        int contadorCerto = 0;
        int contadorErro = 0;
        int opcao = 0;
        int escolha;

        System.out.println("=====================================================");
        System.out.println(azul + "GUIA DE SEGURANÇA DIGITAL / SIMULAÇÃO DE CENÁRIOS" + reset);
        System.out.print("Olá seja bem vindo(a) qual seu nome?\n-> ");
        nome = in.nextLine();
        System.out.println("=====================================================");
    
        while (opcao != 4) {
            System.out.println("MENU PRINCIPAL - Selecione uma opção:");
            System.out.println("1. Recebi um link suspeito");
            System.out.println("2. Me pediram minha senha");
            System.out.println("3. Meu perfil foi hackeado");
            System.out.println("4. Sair e Ver resultado");
            System.out.print("Opção: ");
            opcao = in.nextInt();

            switch (opcao) {

                // ========================//
                // CASE 1 - LINK SUSPEITO  //
                // ========================//
            case 1-> {
                    System.out.println("\n==============================");
                    System.out.println(laranja+ "        LINK SUSPEITO         " + reset);
                    System.out.println("==============================");
                    System.out.println("\nSituação:");
                    System.out.println("Você recebeu no WhatsApp:");
                    System.out.println("Parabéns! Você ganhou R$500 no Pix. Clique aqui: bit.ly/premia\n");
                    System.out.println("O que você faz?");
                    System.out.println("1. Clico no link pra ver do que se trata");
                    System.out.println("2. Verifico se o remetente é de confiança antes de qualquer ação");
                    System.out.println("3. Encaminho pros meus contatos pra avisar");
                    System.out.print("\nEscolha: ");
                    escolha = in.nextInt();
                    // RESPOSTA
                    if (escolha == 1) {
                        contadorErro += 1;
                        linha();
                        System.out.print(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        linha();
                        System.out.println("Você caiu no golpe! Links encurtados como bit.ly escondem");
                        System.out.println("o destino real. Clicar pode instalar vírus ou roubar seus dados.");
                        System.out.print(amarelo + "--> DICA: Nunca clique em links de prêmios não solicitados!" + reset);
                        linha();
                    } else if (escolha == 2) {
                        contadorCerto += 1;
                        linha();
                        System.out.print(verde + "  PARABÉNS - RESPOSTA CERTA!  " + reset);
                        linha();
                        System.out.println("Ótima decisão! Antes de qualquer ação, sempre verifique");
                        System.out.println("quem enviou a mensagem. Números desconhecidos e promessas");
                        System.out.println("de prêmio são sinais claros de golpe.");
                        System.out.print(amarelo + "--> DICA: Desconfie sempre. Nenhuma empresa sorteia prêmio por WhatsApp!" + reset);
                        linha();
                    } else if (escolha == 3) {
                        contadorErro += 1;
                        linha();
                        System.out.print(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        linha();
                        System.out.println("Encaminhar é ainda pior! Você estaria espalhando");
                        System.out.println("o golpe para amigos e familiares que confiam em você.");
                        System.out.print(amarelo + "--> DICA: Ao receber algo suspeito, delete e avise as pessoas sem encaminhar!" + reset);
                        linha();
                    } else {
                        System.out.println(vermelho + "\nResposta inválida. Tente novamente.\n" + reset);
                    }
                    }

                // ================================//
                // CASE 2 - ME PEDIRAM MINHA SENHA //
                // ================================//
                case 2->{
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
                    // RESPOSTA
                    if (escolha == 1) {
                        contadorErro += 1;
                        linha();
                        System.out.print(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        linha();
                        System.out.println("Você foi vítima de phishing! Nenhum banco jamais");
                        System.out.println("pede sua senha por e-mail. Sua conta pode estar comprometida.");
                        System.out.print(amarelo + "--> DICA: Troque sua senha imediatamente se isso acontecer!" + reset);
                        linha();
                    } else if (escolha == 2) {
                        contadorCerto += 1;
                        linha();
                        System.out.print(verde + "  PARABÉNS - RESPOSTA CERTA!  " + reset);
                        linha();
                        System.out.println("Excelente! Acessar o site oficial digitando o endereço");
                        System.out.println("você mesmo é a forma mais segura. Links em e-mails");
                        System.out.println("podem redirecionar para sites falsos idênticos ao original.");
                        System.out.print(amarelo + "--> DICA: Nunca acesse o banco pelo link do e-mail, sempre pelo navegador!" + reset);
                        linha();
                    } else if (escolha == 3) {
                        contadorErro += 1;
                        linha();
                        System.out.print(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        linha();
                        System.out.println("Responder confirma que seu e-mail existe e está ativo.");
                        System.out.println("Isso pode gerar ainda mais tentativas de golpe contra você.");
                        System.out.print(amarelo + "--> DICA: Nunca responda e-mails suspeitos, apenas delete!" + reset);
                        linha();
                    } else {
                        System.out.println(vermelho + "\nResposta inválida. Tente novamente.\n" + reset);
                    }
                    }

                // =================================//
                // CASE 3 - MEU PERFIL FOI HACKEADO //
                // =================================//
                case 3->{
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
                    // RESPOSTA
                    if (escolha == 1) {
                        contadorErro += 1;
                        linha();
                        System.out.print(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        linha();
                        System.out.println("Esperar é um erro grave! A cada minuto, seus seguidores");
                        System.out.println("podem estar sendo enganados e perdendo dinheiro.");
                        System.out.print(amarelo + "--> DICA: Aja rápido! Tempo é crucial quando sua conta é hackeada." + reset);
                        linha();
                    } else if (escolha == 2) {
                        contadorCerto += 1;
                        linha();
                        System.out.print(verde + "  PARABÉNS - RESPOSTA CERTA!  " + reset);
                        linha();
                        System.out.println("Perfeito! Avisar seus contatos evita que caiam no golpe.");
                        System.out.println("Ao recuperar o acesso, troque a senha imediatamente e");
                        System.out.println("ative o 2FA para ninguém mais conseguir entrar na sua conta.");
                        System.out.print(amarelo + "--> DICA: Ative verificação em duas etapas em TODAS as suas redes sociais!" + reset);
                        linha();
                    } else if (escolha == 3) {
                        contadorErro += 1;
                        linha();
                        System.out.print(vermelho + "  ATENÇÃO - RESPOSTA ERRADA!  " + reset);
                        linha();
                        System.out.println("Abandonar não resolve! Sua conta antiga continua ativa");
                        System.out.println("e o golpista segue prejudicando quem te conhece.");
                        System.out.print(amarelo + "--> DICA: Sempre tente recuperar o acesso pelo próprio aplicativo!" + reset);
                        linha();
                    } else {
                        System.out.println(vermelho + "\nResposta inválida. Tente novamente.\n" + reset);
                    }
                    }

                case 4->{
                    System.out.println("\n============================================================");
                    System.out.println(nome+" você acertou "+contadorCerto+" e errou "+contadorErro);
                    System.out.println(azul + "Obrigado por usar o Guia de Segurança Digital! Até mais!" + reset);
                    System.out.println("============================================================\n");
                    }

                default->{
                    System.out.println(vermelho + "\nOpção inválida! Digite um número entre 1 e 4.\n" + reset);
                    }
            }
        }
    in.close();
    }
}