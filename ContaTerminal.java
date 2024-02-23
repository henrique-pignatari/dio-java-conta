import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao banco! Vamos criar sua conta");

        System.out.println("Primeiro informe o número da conta:"); // ISSO NN FAZ SENTIDO KKKK
        String accountNumber = scanner.nextLine();

        System.out.println("Agora a agência:");
        String accountAgency = scanner.nextLine();

        System.out.println("Informe o seu nome completo:");
        String clientFullName = scanner.nextLine();

        System.out.println("E para finalizar, qual será o saldo incial da conta:");
        String accountInitialBalance = scanner.nextLine();

        String outputString = String.format(
                "Olá %1$s, obrigado por criar uma conta em nosso banco, sua agência é %2$s, conta %3$s e seu saldo %4$s já está disponível para saque",
                clientFullName, accountAgency, accountNumber, accountInitialBalance
        );
        System.out.println(outputString);
    }
}
