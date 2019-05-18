package com.DataPasta;

public class Funcionario extends Pessoa{
	private DataCalendario dataAdm;
	private double salario;
	
	public Funcionario(String nome, String id, DataCalendario dataNasc, DataCalendario dataAdm, double salario) throws Exception{
		super(nome,id,dataNasc);
		this.setDataAdm(dataAdm);
		this.setSalario(salario);
	}
	public Funcionario(String nome, String id, String dataNasc, String dataAdm, double salario) throws Exception{
		super(nome,id,dataNasc);
		this.setDataAdm(new DataCalendario(dataAdm));
		this.setSalario(salario);
	}
	public Funcionario(String nome, String id, int diaNasc,int mesNasc, int anoNasc,int diaAdm,int mesAdm,int anoAdm, double salario) throws Exception{
		super(nome,id,diaNasc,mesNasc,anoNasc);
		this.setDataAdm(new DataCalendario(diaAdm,mesAdm,anoAdm));
		this.setSalario(salario);
	}
	public DataCalendario getDataAdm() {
		return this.dataAdm;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setDataAdm(DataCalendario dataAdm) {
		this.dataAdm = dataAdm;
	}
	public void reajuste(double taxa) {
		this.salario = this.salario + this.salario*taxa;
	}
	public double MaxEmprest() {
		return this.getSalario();
	}
	public String toString() {
		return super.toString()
		+ ", Data de Admissao=" + this.getDataAdm() 
		+ ", salario=" + this.getSalario();
	}	
	
}
