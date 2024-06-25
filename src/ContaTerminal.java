import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);;

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o numero da conta !");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite seu nome !");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Digite seu saldo !");
        double saldo = sc.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque. ", nome, agencia, numero, saldo);
        sc.close();


    }

}
