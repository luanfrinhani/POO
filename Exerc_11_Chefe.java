package com.DataPasta;

public class Chefe extends Funcionario{
	private String dep;
	
	public Chefe(String nome, String id, DataCalendario dataNasc, DataCalendario dataAdm, double salario, String dep) throws Exception{
		super(nome,id,dataNasc,dataAdm,salario);
		this.setDep(dep);
	}
	public Chefe(String nome, String id, String dataNasc, String dataAdm, double salario, String dep) throws Exception{
		super(nome,id,dataNasc,dataAdm,salario);
		this.setDep(dep);
	}
	public Chefe(String nome, String id, int diaNasc,int mesNasc, int anoNasc,int diaAdm,int mesAdm,int anoAdm, double salario, String dep) throws Exception{
		super(nome,id,diaNasc,mesNasc,anoNasc,diaAdm,mesAdm,anoAdm,salario);
		this.setDep(dep);
	}
	public String getDep() {
		return this.dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String toString() {
		return super.toString() + "Departamento: " + this.getDep(); 
	}
}
