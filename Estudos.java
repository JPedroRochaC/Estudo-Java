
import java.util.Scanner;

public class Estudos{
    static void linha() {
        System.out.println("\n------------------------------");
    }
    public static void main(String[] args) {
     Scanner in = new Scanner (System.in);

     float saldoInicial = 2500, saldoAtual, valorRecebido, valorTransferido;
     saldoAtual = saldoInicial;
     String nome = "João Pedro", tipoConta = "Corrente";
     int operacao = 0;
     linha();
     System.out.println("Dados do cliente");
     System.out.println("Nome: "+nome);
     System.out.println("Tipo de conta: "+tipoConta);
     System.out.println("Saldo disponível: R$"+saldoInicial);
    
      while (operacao != 4){
         linha();
         System.out.println("MENU PRINCIPAL - Selecione uma opção:");
         System.out.println("1. Consultar saldo");
         System.out.println("2. Receber valor");
         System.out.println("3. Transferir valor");
         System.out.println("4. Sair");
         System.out.print("Opção: ");
         operacao = in.nextInt();
         linha();
          switch(operacao){
              case 1 -> {
              System.out.println(nome+", seu saldo atual é de: R$"+saldoAtual);
              }
              case 2 -> {
              System.out.print("Digite o valor que você vai receber: R$");
              valorRecebido = in.nextFloat();
              saldoAtual += valorRecebido;
              System.out.println(nome+", agora seu saldo é de: R$"+saldoAtual);
              }
              case 3-> {
                System.out.println("Digite o valor que deseja transferir: R$");
                valorTransferido = in.nextFloat();
                 if(valorTransferido > saldoAtual){
                    System.out.println("Saldo indisponível, você tem apenas: R$"+saldoAtual);
                 }else{
                    System.out.println("Transferencia realizada com sucesso");
                    saldoAtual -= valorTransferido;
                    System.out.println(nome+", agora seu saldo é de: R$"+saldoAtual);
                 }
              }
              case 4->{
                System.out.println("Obrigado por usar nosso sistema "+nome+"!\nAté mais!");
              }
              default ->{
                System.out.println("Opcão inválida");
                System.out.println("Selecione novamente");
              }
             }
        }      
    }
}