package com.DataPasta;

public class DataCalendario {
	private int dia, mes,ano;
	private String data = "";
	
	//Construtor principal
	
	public DataCalendario(int dia, int mes, int ano) {
			this.setData(dia,mes,ano);
	}
	
	//Construtor default
	
	public DataCalendario() {
		this(1,1,1900);
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAno() {
		return this.ano;
	}

	//setData principal
	public void setData(int dia, int mes, int ano) {
			this.dia=dia;
			this.mes=mes;
			this.ano=ano;
			if (this.isDataValida(dia,mes,ano)==true) {
				data = this.toString(dia,mes,ano);
			}
			
	}
	
	//setData para entrada com apenas mes e ano
	public void setData(int mes,int ano) {
		this.setData(1,mes,ano);
	}
	
	//setData para entrada com dia inteiro, mes por extenso e ano inteiro
	public void setData(int dia,String s,int ano) {
		int m=0;
		if (s=="Janeiro") 	m=1;		
		if (s=="Fevereiro") m=2;
		if (s=="Março") 	m=3;
		if (s=="Abril") 	m=4;
		if (s=="Maio") 		m=5;
		if (s=="Junho") 	m=6;
		if (s=="Julho") 	m=7;
		if (s=="Agosto") 	m=8;
		if (s=="Setembro") 	m=9;
		if (s=="Outubro") 	m=10;	
		if (s=="Novembro") 	m=11;
		if (s=="Dezembro") 	m=12;
		this.setData(dia,m,ano);
	}
	
	//setData para entrada com uma String com a data completa
	public void setData(String s) {
		String dia="",mes="",ano="";
		int dia1,mes1,ano1;
		int tam=s.length();
		if(tam==9) {
			dia=s.substring(0,1);
			dia1=Integer.parseInt(dia);
			mes=s.substring(2,4);
			mes1=Integer.parseInt(mes);
			ano=s.substring(5,9);
			ano1=Integer.parseInt(ano);
			this.setData(dia1,mes1,ano1);
		}
		else if (tam==10) {
			dia=s.substring(0,2);
			dia1=Integer.parseInt(dia);
			mes=s.substring(3,5);
			mes1=Integer.parseInt(mes);
			ano=s.substring(6,10);
			ano1=Integer.parseInt(ano);
			this.setData(dia1,mes1,ano1);
		}
	}
	
	//Método para verificar se a data de entrada é valida
	public boolean isDataValida(int dia, int mes, int ano) {
		if (dia<1 || ano<1582 || mes >12 || mes<1 || dia>31) {
			return false;
		}
		else{
			if (isBissexto(ano) == true) {
				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia<=30)) {
					return true;
				}
				if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia<=31)) {
					return true;
				}
				if (mes == 2 && dia<=29) {
					return true;
				}
				else return false;
			}
			else {
				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia<=30)) {
					return true;
				}
				if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia<=31)) {
					return true;
				}
				if (mes == 2 && dia<=28) {
					return true;
				}
				else return false;
				
			}
		}	
	}
	
	//Método para verificar se o ano é bissexto, é utilizado no método isDataValida
	public boolean isBissexto(int ano) {
		if ((ano%4 == 0) && (ano%100 != 0 || ano%400 == 0)) {
			return true;
		}
		else {
			return false;
		}	
	}
	//Método que converte o mes dado por valores inteiros em uma string com o formato dd/mm/aaaa
	public String toString(int dia, int mes, int ano){
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return dados.toString();
	}
	//Método que vrifica se duas datas são iguais 
	public boolean equals(Object objeto) {
		DataCalendario aux=(DataCalendario)objeto;
		if (this.getDia() == aux.getDia() && this.getMes() == aux.getMes() && this.getAno() == aux.getAno())	return true;
		return false;
	}
	public static void main(String args[]) {
		DataCalendario d = new DataCalendario();
		String Data ="29/02/2020",Data2="31/10/1992";
		d.setData(Data);
		System.out.println("\nData1: "+d.data);
		d.setData(Data2);
		System.out.println("\nData2: "+d.data);
		System.out.println("\nAs datas sao iguais? "+Data.equals(Data2));
		
	}
}
