package com.DataPasta;
import java.util.Scanner;
public class Uso {
	public static DataCalendario dataArg;

	//@SuppressWarnings({"resource","unused"})
	public static void main(String args[]) throws Exception {
		DataCalendario Date = new DataCalendario();
		DataCalendario Date2 = new DataCalendario();
		DataCalendario dataArg2 = new DataCalendario();
		Uso.dataArg= new DataCalendario(20,10,1997);
		Scanner scanner = new Scanner(System.in);
		String Data ="",Data2="",DataArg = "";
		int i = 0,inc = 0,compare=0;
		while(i!=3) {
			try {
				System.out.println("Entre com a primeira data: ");
				Data = scanner.nextLine();
				Date.setData(Data);
				System.out.println("Entre com a segunda data: ");
				Data2 = scanner.nextLine();
				Date2.setData(Data2);
				System.out.println("\nData1: "+Date);
				System.out.println("\nData2: "+Date2);
				System.out.println("\nAs datas sao iguais? "+Data.equals(Data2));
				break;
			}
			catch(Exception e){
				i++;
				System.out.println(e);
			}
		}
	   if (i==3) {
		   Date.setData();
		   System.out.println(Date);
	   }
	   System.out.println("Entre com a data de comparacao: ");
	   DataArg = scanner.nextLine();
	   dataArg2.setData(DataArg);
	   compare=DataCalendario.compareTo(dataArg2);
	   System.out.println(""+compare);
	   /*Date.incrementa();
	   System.out.println("Entre com os dias a serem incrementados: ");
	   inc = scanner.nextInt();
	   System.out.println(Data);
	   Date.incrementa(inc);
	   System.out.println(Data);*/
	}
}
