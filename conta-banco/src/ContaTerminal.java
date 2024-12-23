import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();
        System.out.println("Por favor, digite o nome de usuário: ");
        String nome = scanner.nextLine();
        System.out.println("Por favor, digite o saldo de sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println
                ("Seja bem-vindo " + nome +" , sua agência é " + numeroAgencia + " e seu saldo disponível é de R$" + saldo +".");

    }
}