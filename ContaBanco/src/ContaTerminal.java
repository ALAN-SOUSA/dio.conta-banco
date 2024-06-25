import java.util.Locale;
    import java.util.Scanner;


public class ContaTerminal {
    
    

    public static void main(String[] args) throws Exception {

     // conhecer e importar a classe  scanner 
     Scanner scanner = new Scanner(System.in);


     // exibir as mensagens para novos usuarios

        System.out.println("/////////////Seja bem vindo ///////////");


     // obter pelo scanner valores obitidos pelo terminal

     System.out.println("Digite o numero da sua conta e pressione enter para o proximo campo.");
     int NumeroConta = scanner.nextInt();
     scanner.nextLine();
     

     System.out.println("Digite o numero da sua agencia e pressione enter para o proximo campo.");
     String NumeroAgencia = scanner.nextLine();
     

     System.out.println("Digite seu nome e pressione enter para o proximo campo.");
     String NomeUsuario = scanner.nextLine();
     scanner.close();
     
     Double saldo = 2.345;


        //exibir a mensagem conta criada
     System.out.println(" Olá " + NomeUsuario + " , obrigado por criar uma conta em nosso banco, sua agência é " + NumeroAgencia +
                        " conta " + NumeroConta + " e seu saldo de " + saldo + " já está disponível para saque .");
     
     
    }

}