public class DataCalendario{
	private int dia, mes,ano;
	//Método isDataValida nao deve ser estatico, pois sempre iremos verificar uma data especifica
	//Método isAnoBissexto tambem nao precisa pelo mesmo motivo do anterior
	//Construtor principal
	
	public DataCalendario(int dia, int mes, int ano) 	throws Exception {
			this.setData(dia,mes,ano);
	}
	
	public DataCalendario(String _dtStr) throws Exception {
		this.setData(_dtStr);
	}
	//Construtor default
	public DataCalendario() 	throws Exception{
		this(1,1,1900);
	}
	//Métodos de Interface get
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAno() {
		return this.ano;
	}
	//Métodos de interface sets
	//setData principal
	//@SuppressWarnings("static-access")
	public void setData(int dia, int mes, int ano) throws Exception {
			if (DataCalendario.isDataValida(dia,mes,ano)==true) {
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
			}
			else {
				throw new Exception("Data Invalida");
			}
			
	}
	
	//setData para entrada com apenas mes e ano
	public void setData(int mes,int ano) throws Exception {
		this.setData(1,mes,ano);
	}
	//setData para entrada com dia inteiro, mes por extenso e ano inteiro
	public void setData(int dia,String s,int ano)	throws Exception {
		int m=0;
		if (s.equals("Janeiro")) 	m=1;		
		if (s.equals("Fevereiro")) m=2;
		if (s.equals("Março")) 	m=3;
		if (s.equals("Abril")) 	m=4;
		if (s.equals("Maio")) 		m=5;
		if (s.equals("Junho")) 	m=6;
		if (s.equals("Julho")) 	m=7;
		if (s.equals("Agosto")) 	m=8;
		if (s.equals("Setembro")) 	m=9;
		if (s.equals("Outubro"))	m=10;	
		if (s.equals("Novembro")) 	m=11;
		if (s.equals("Dezembro")) 	m=12;
		this.setData(dia,m,ano);
	}
	//setData padrao
	public void setData() throws Exception{
		this.setData(1,1,1900);
	}
	//setData para entrada com uma String com a data completa
	public void setData(String s) throws Exception {
		String dia="",mes="",ano="";
		int dia1=0,mes1=0,ano1=0;
		int p1=s.indexOf("/"),p2=s.indexOf("/",p1);
		if (p1 == 2 && p2 == 5) {
			dia = s.substring(0,1);
			dia1 = Integer.parseInt(dia);
			mes = s.substring(3,4);
			mes1 = Integer.parseInt(mes);
			ano = s.substring(6,10);
			ano1 = Integer.parseInt(ano);
			this.setData(dia1,mes1,ano1);
		}
		else if (p1 == 2 && p2 == 4) {
			dia = s.substring(0,1);
			dia1 = Integer.parseInt(dia);
			mes = s.substring(2,3);
			mes1 = Integer.parseInt(mes);
			ano = s.substring(5,9);
			ano1 = Integer.parseInt(ano);
			this.setData(dia1,mes1,ano1);
		}
		else if (p2 == 1 && p2 == 4) {
			dia = s.substring(0);
			dia1 = Integer.parseInt(dia);
			mes = s.substring(2,3);
			mes1 = Integer.parseInt(mes);
			ano = s.substring(5,9);
			ano1 = Integer.parseInt(ano);
			this.setData(dia1,mes1,ano1);
		}
		else if (p2 == 1 && p2 == 5) {
			dia = s.substring(0);
			dia1 = Integer.parseInt(dia);
			mes = s.substring(2,3);
			mes1 = Integer.parseInt(mes);
			ano = s.substring(6,10);
			ano1 = Integer.parseInt(ano);
			this.setData(dia1,mes1,ano1);
		}
		
	}
	//Método static que verifica e cria uma data, caso a data esteja certo
	public static DataCalendario verificaECriaData(int dia,int mes, int ano) throws Exception{
		try {
			DataCalendario data = new DataCalendario(dia,mes,ano);
			return data;
		}
		catch(Exception e) {
			return null;
		}
	}
	//Classe compareTo static para comparar uma data passada como argumento e um objeto criado na classe Uso
	public int compareTo(DataCalendario Data) {
		if (Data.getAno()>this.getAno()){
			return 1;
		}
		else {
			if (Data.getMes()>this.getMes()) {
				return 1;
			}
			else {
				if (Data.getDia()>this.getDia()) {
					return 1;
				}
			}
		}
		if (Data.getDia() == this.getDia() && Data.getMes() == this.getMes() && this.getAno() == this.getAno()) {
			return 0;
		}
		else {
			return -1;
		}
		
	}
	
	
	//Metodo incrementa que adiciona mais 1 dia na data
	public void incrementa() throws Exception {
		try {
			this.setData(getDia()+1,getMes(),getAno());
		}
		catch(Exception dia){
			try {
				this.setData(1,getMes()+1,getAno());
			}
			catch(Exception mes) {
				try {
					this.setData(1,1,getAno()+1);
				}
				catch(Exception ano) {
					this.setData(getDia(),getMes(),getAno());
				}
			}
		}
	}
	//Metodo sobrecarregado incrementa os dias passados por parametro
	public void incrementa(int dias) throws Exception {
		int i=0;
		while(i!=dias) {
			try {
				this.setData(getDia()+1,getMes(),getAno());
			}
			catch(Exception dia){
				try {
					this.setData(1,getMes()+1,getAno());
				}
				catch(Exception mes) {
					try {
						this.setData(1,1,getAno()+1);
					}
					catch(Exception ano) {
						this.setData(getDia(),getMes(),getAno());
					}
				}
			}
			i++;
		}
		}
	//Método para verificar se a data de entrada é valida
	public static boolean isDataValida(int dia, int mes, int ano) {
		if (dia<1 || ano<1582 || mes >12 || mes<1 || dia>31) {
			return false;
		}
		else{
			if (DataCalendario.isBissexto(ano) == true) {
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
	public static boolean isBissexto(int ano) {
		if ((ano%4 == 0) && (ano%100 != 0 || ano%400 == 0)) {
			return true;
		}
		else {
			return false;
		}	
	}
	//Método que converte o mes dado por valores inteiros em uma string com o formato dd/mm/aaaa
	public String toString(){
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
}
