import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia: ");
        String numAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                          numAgencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);

    }
}
