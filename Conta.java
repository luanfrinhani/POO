package contaBancaria;

public class Conta {
	private String nomeCorretista;
	private double saldo;
	static final public double Default_taxaJuros = 0.1;
	static public double taxa_Juros = Default_taxaJuros;
	//Construtores da classe
	public Conta(String nome,double saldo) throws Exception {
		this.setConta(nome,saldo);
	}
	public Conta() throws Exception{
		this("Padrao",0);
	}
	//Métodos de interface gets
	public double getSaldo() {
		return this.saldo;
	}
	public String getNome() {
		return this.nomeCorretista;
	}
	
	public double getTaxa() {
		return Conta.taxa_Juros;
	}
	//Métodos de interface sets
	public void setConta(String nome,double saldo) throws Exception{
		if (saldo>=0) {
			this.nomeCorretista = nome;
			this.saldo = saldo;
		}
		else {
			throw new Exception("Erro");
		}
	}
	
	public static void setJuros(double taxaJuros) {
		Conta.taxa_Juros = taxaJuros;
	}
	//Método para converter em uma string com formatação "nome;saldo;TaxaDejuros
	public String toString () {
		StringBuilder dados = new StringBuilder();
		dados.append(getNome());
		dados.append(";");
		dados.append(getSaldo());
		dados.append(";");
		dados.append(getTaxa());
		return dados.toString();
	}
	//Método para verificar se dois objetos são iguais
	public boolean equals(Object Objeto) {
		Conta aux = (Conta)Objeto;
		if (this.getNome() == aux.getNome() && this.getSaldo() == aux.getSaldo()) {
			return true;
		}
		else {
			return false;
		}
	}
	//Método que modifica o valor do saldo em relação ao juros estabelecido
	public static void corrigeSaldo(Conta P) {
		double saldo = P.saldo;
		P.saldo =saldo*taxa_Juros+ saldo;
	}
}
