import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine(); // Agência pode conter hífen

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo!");
        double saldo = sc.nextDouble();

        // mensagem final 
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
