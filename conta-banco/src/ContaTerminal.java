import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da agencia!");
        agencia = sc.next();

        System.out.println("Por favor, digite o numero da conta!");
        numero = sc.nextInt();

        System.out.println("Por favor, digite seu nome!");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponivel para saque.");
    }
}
