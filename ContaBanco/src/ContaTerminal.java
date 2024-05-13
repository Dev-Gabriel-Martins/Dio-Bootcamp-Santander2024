import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;
/**
 * @author Gabriel Martins
 * @since 13/05/2024
 */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá "+ nomeCliente +
                ", obrigado por criar uma conta em nosso banco,\n" +
                " sua agência é "+agencia+
                ", conta "+numero+
                " e seu saldo "+saldo+
                " já está disponível para saque");
    }
}