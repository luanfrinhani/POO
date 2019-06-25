package prova;
/**
 * Usada para organizar a data, com o objetivo de receber e modificar varios tipos de datas dada pelo
 * usuario
 *
 * <p>
 *
 * @author Luan S. F.
 * @version 1.0 (junho - 2019)
 */
public class DataCalendario{
	/**dia da data a ser colocada no calendario*/
	private int dia;
	/**mes da data a ser colocada no calendario*/
	private int mes;
	/**ano da data a ser colocada no calendario*/
	private int ano;
	/**
     * construtor para inicializar valores nos campos
     *
     * @param d dia da data
     * @param m mes da data
     * @param a ano da data
     * @throws Exception para dia, mês, ano invalido
     */
	public DataCalendario(int dia, int mes, int ano) 	throws Exception {
			this.setData(dia,mes,ano);
	}
	/**
     * construtor para inicializar valores nos campos
     *
     * @param data do formato string
     * @throws Exception para a string data
     */
	public DataCalendario(String data) throws Exception {
		this.setData(data);
	}
	/**
     * construtor default que inicializa a data com o valor default 01/01/1900
     * 
     * @throws Exception para a verificação dos this utilizados
     */
	public DataCalendario() 	throws Exception{
		this(1,1,1900);
	}
	/**
	 * pega o valor do dia
	 * 
	 * @return valor do dia
	 */
	public int getDia() {
		return this.dia;
	}
	/**
	 * pega o valor do mes
	 * 
	 * @return valor do mes
	 */
	public int getMes() {
		return this.mes;
	}
	/**
	 * pega o valor do ano
	 * 
	 * @return valor do ano
	 */
	public int getAno() {
		return this.ano;
	}
	/**
	 * modifica a data em questao e utiliza o metodo isDataValida para auxilio
	 *
	 * @param dia inteiro que representa o dia do calendario
	 * @param mes inteiro que representa o mes do calendario
	 * @param ano inteiro que representa o ano do calendario
	 * @throws Exception para a verificação dos this utilizados
	 */
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
	
	/**
	 * modifica a data em questao e coloca o valor 1 para o dia como padrao
	 *
	 * @param mes inteiro que representa o mes do calendario
	 * @param ano inteiro que representa o ano do calendario
	 * @throws Exception para a verificação dos this utilizados
	 */
	public void setData(int mes,int ano) throws Exception {
		this.setData(1,mes,ano);
	}
	/**
	 * modifica a data quando se recebe um inteiro, uma string e outro inteiro
	 * @param dia inteiro que representa o dia do calendario
	 * @param mes String que representa o mes do calendario
	 * @param ano inteiro que representa o ano do calendario
	 * @throws Exception para a verificação dos this utilizados
	 */
	
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
	/**
	 * modifica a data para um valor default
	 * @throws Exception para a verificação dos this utilizados
	 */
	public void setData() throws Exception{
		this.setData(1,1,1900);
	}
	/**
	 * modifica a data quando se recebe um inteiro, uma string e outro inteiro
	 * @param data String com a data completa
	 * @throws Exception para a verificação dos this utilizados
	 */
	
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
	/**
	 * método que verifica se a data é valida e cria uma data tipo calendario
	 * 
	 * @param dia numero que representa o dia
	 * @param mes numero que representa o mês
	 * @param ano numero que representa o ano
	 * 
	 * @return retorna a data
	 * @return retorna null caso a data não seja valida
	 */
	public static DataCalendario verificaECriaData(int dia,int mes, int ano) throws Exception{
		try {
			DataCalendario data = new DataCalendario(dia,mes,ano);
			return data;
		}
		catch(Exception e) {
			return null;
		}
	}
	/**
	 * método que compara se duas datas são iguals
	 * 
	 * @param Data1 do tipo DataCalendario
	 * @param Data2 do tipo DataCalendario
	 * 
	 * @return retorna 1 caso a Data1 seja maior 
	 * @return retorna -1 caso a Data2 seja maior
	 * @return retorna 0 caso as datas sejam iguais
	 */
	public static int compareTo(DataCalendario Data1,DataCalendario Data2) {
		if (Data2.getAno()>Data1.getAno()){
			return 1;
		}
		else {
			if (Data2.getMes()>Data1.getMes()) {
				return 1;
			}
			else {
				if (Data2.getDia()>Data1.getDia()) {
					return 1;
				}
			}
		}
		if (Data2.getDia() == Data1.getDia() && Data2.getMes() == Data1.getMes() && Data2.getAno() == Data1.getAno()) {
			return 0;
		}
		else {
			return -1;
		}
		
	}
	
	
	/**
	 * método que incrementa dias a uma data
	 * 
	 */
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
	/**
	 * método sobrecarregado que incrementa uma quantidade de dias estipulada
	 * 
	 * @param dias do tipo inteiro, representa quantos dias serao adicionados
	 * 
	 */
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
	/**
	 * método que verifica se uma data e valida
	 * 
	 * @param dia tipo inteiro
	 * @param mes tipo inteiro
	 * @param ano tipo inteiro
	 * 
	 * @return retorna true se a data for valida
	 * @return retorna false se a data for invalida
	 */
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
	
	/**
	 * método que verifica se um ano e bissexto
	 * 
	 * @param ano do tipo inteiro
	 * @return retorna true se for bissexto
	 * @return retorna false se nao for bissexto
	 */
	public static boolean isBissexto(int ano) {
		if ((ano%4 == 0) && (ano%100 != 0 || ano%400 == 0)) {
			return true;
		}
		else {
			return false;
		}	
	}
	/**
	 * Sobreposição do método toString para retornar a data
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return dados.toString();
	}
	/**
	 * método que verifica se uma data objeto e igual a uma passada por parametro
	 * 
	 * @param objeto do tipo objeto
	 * @return retorna true se forem iguais
	 * @return retorna false se forem diferentes
	 */
	public boolean equals(Object objeto) {
		DataCalendario aux=(DataCalendario)objeto;
		if (this.getDia() == aux.getDia() && this.getMes() == aux.getMes() && this.getAno() == aux.getAno())	return true;
		return false;
	}
}