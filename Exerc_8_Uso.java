package contaBancaria;
import java.util.Scanner;
public class Uso {
	public static void main (String args[]) throws Exception{
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		String nome = "";
		Scanner scanner = new Scanner(System.in);
		int op=-1;
		double saldo1 = 0.0,juros = 0.0;
		System.out.println("Entre com a nome do primeiro corretista: ");
		nome = scanner.nextLine();
		System.out.println("Entre com o saldo: ");
		saldo1 = scanner.nextDouble();
		conta1.setConta(nome,saldo1);
		/*System.out.println("Entre com a nome do segundo corretista: ");
		nome = scanner.nextLine();
		System.out.println("Entre com o saldo: ");
		saldo1 = scanner.nextDouble();
		conta2.setConta(nome,saldo1);*/
		while(op!=0) {
			System.out.println("Entre com a opcao: \n1 - Corrigir o saldo da conta 1\n2 - Corrigir o saldo da conta 2\n3 - Mudar a taxa de juros\n0 - Sair\n");
			op=scanner.nextInt();
			if (op == 1) {
				Conta.corrigeSaldo(conta1);
				System.out.println(""+conta1);
			}
			if (op == 2) {
				Conta.corrigeSaldo(conta2);
				System.out.println(""+conta2);
			}
			if (op == 3) {
				System.out.println("Entre com o novo saldo: ");
				juros = scanner.nextDouble();
				Conta.setJuros(juros);
			}
		}
	}
}
