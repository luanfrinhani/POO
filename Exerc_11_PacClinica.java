package com.DataPasta;

public class PacClinica extends Pessoa{
	private String Plano;
	
	public PacClinica(String nome, String id, DataCalendario data, String Plano) throws Exception{
		super(nome,id,data);
		this.setPlano(Plano);
	}
	public PacClinica(String nome, String id, String data, String Plano) throws Exception{
		super(nome,id,data);
		this.setPlano(Plano);
	}
	public PacClinica(String nome, String id, int dia, int mes, int ano, String Plano) throws Exception{
		super(nome,id,dia,mes,ano);
		this.setPlano(Plano);
	}
	public String getPlano() {
		return this.Plano;
	}
	public void setPlano(String Plano) {
		this.Plano = Plano;
	}
	public String toString() {
		return super.toString() + "Plano de Saude: " + this.getPlano();
	}
}
