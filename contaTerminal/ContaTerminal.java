//TODO: conhecer e importar a classe Scanner

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //TODO: permitir o funcionamento da classe Scanner
        Scanner leitorScanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: exibir as mensagens para o nosso usuário
        //TODO: obter pela classe Scanner os valores digitados no Terminal
        System.out.println("Digite o seu nome:");
        String nome = leitorScanner.nextLine();
        System.out.println("Digite o número da sua agência:");
        String numeroAgencia = leitorScanner.nextLine();
        System.out.println("Digite o número da sua conta:");
        int numeroConta = leitorScanner.nextInt();
        System.out.println("Digite o valor que deseja depositar:");
        double saldoDepositado = leitorScanner.nextDouble();

        //TODO: exibir a mensagem da conta criada
        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldoDepositado + " já está disponível para saque.");
    }
}