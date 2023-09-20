import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o valor do deposito inicial: ");
        float dep = scanner.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco," + " sua agência é " + agencia + ", conta " + conta + " e seu saldo " + dep + " já está disponível para saque. ");
    }
}
