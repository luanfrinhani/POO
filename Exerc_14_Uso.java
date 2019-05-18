package exerc14;
import java.util.Scanner;
public class Uso {
	public static void main(String args[]) {
		try {
			Cliente vetor[] = new Cliente[50];
			Scanner s = new Scanner(System.in);
			String nome = "", ende = "", cel = "", email = "";
			double renda;
			int i = 0;
			while(i<50) {
				System.out.println("Entre com o nome do cliente: ");
				 nome = s.nextLine();
				System.out.println("\nEntre com o email: ");
				email = s.nextLine();
				System.out.println("\nEntre com o endereço: ");
				ende = s.nextLine();
				System.out.println("\nEntre com o celular: ");
				cel = s.nextLine();
				System.out.println("\nEntre com a renda: ");
				renda = s.nextDouble();
				Cliente C1 = new Cliente(nome,email,cel,ende,renda);
				vetor[i] = C1;
				System.out.println("" + vetor[i]);
				i++;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
	
