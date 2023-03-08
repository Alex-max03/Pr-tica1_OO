import java.util.Scanner;
public class Banco {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         String nome,agencia, numConta;
         double valor;
         System.out.println("digite nome ");
         nome = ler.nextLine();
         System.out.println("informe o numero da sua agencia ");
         agencia = ler.next();
         System.out.println("informe o numero da conta ");
         numConta = ler.next();
         ContaBancaria cli1 = new ContaBancaria(nome,agencia,numConta);

         System.out.println("digite o valor de deposito ");
         valor =  ler.nextDouble();
         cli1.depositar(valor);

         System.out.println("saldo atual:" + cli1.mostraSaldo());
         System.out.println("digite o valor de saque:");
         valor = ler.nextDouble();
         cli1.sacar(valor);
         System.out.println("saldo atual:" + cli1.mostraSaldo());






         /* ContaBancaria cli1;

         cli1 = new ContaBancaria("Isabela", "123", 12454);
         cli1.depositar(1000);
         cli1.sacar(500);
         System.out.println("Saldo" + cli1.mostraSaldo());*/
     }

}
