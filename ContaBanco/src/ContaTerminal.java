import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //criação do Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Seja bem-vindo ao banco: \nDigite seu nome: ");
        String nome = sc.nextLine(); //nome do usuario
        System.out.print("por favor digite o nome de sua agencia: ");
        String agencia = sc.nextLine(); // nome da agencia
        System.out.print("por favor digite o numero da conta: ");
        int conta = sc.nextInt(); //numero da conta
        System.out.print("por favor digite o seu Saldo: ");
        double saldo = sc.nextDouble(); // saldo

        System.out.print(concatenarDados(nome, agencia, conta, saldo)); //utilizaçao do metodo
        sc.close(); //fechamento do scanner


    }
    // metodo de concatenar dados, vai imprimir o texto com todos os dados inseridos
    public static String concatenarDados(String nome, String agencia, int conta, double saldo) {
        String dadosConcatenados = "Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo;
        return dadosConcatenados;

    }
}