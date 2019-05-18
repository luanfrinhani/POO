package com.DataPasta;

public class Pessoa extends DataCalendario {
	private String nome,identidade;
	private DataCalendario data;
	
	public Pessoa(String nome, String id,DataCalendario data) throws Exception {
		this.nome = nome;
		this.identidade = id;
		this.data = data;
	}
	public Pessoa(String nome,String id,String data) throws Exception{
		this.setNome(nome);
		this.setId(id);
		this.setDataNasc(new DataCalendario(data));
	}
	public Pessoa(String nome, String id, int dia, int mes, int ano) throws Exception{
		this.setNome(nome);
		this.setId(id);
		this.setDataNasc(new DataCalendario(dia,mes,ano));
	}
	public String getNome() {
		return this.nome;
	}
	public String getIdentidade() {
		return this.identidade;
	}
	public DataCalendario getData() {
		return this.data;
	}	
	/*public void setPessoa(String nome, String id, DataCalendario data) throws Exception{
		if (isPessoaValida(nome,id,data) == true) {
			this.nome = nome;
			this.identidade = id;
			this.data = data;
		}
		else {
			throw new Exception();
		}
	}*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setId(String id) {
		this.identidade = id;
	}
	public void setDataNasc(DataCalendario data) {
		this.data = data;
	}
	/*public static boolean isPessoaValida(String nome, String id, DataCalendario data) throws Exception{
		if (nome == "" || id == "" || isDataValida(data.getDia(),data.getMes(),data.getAno()) == false) {
			return false;
		}
		else {
			return true;
		}
	}*/
	public String toString() {
		StringBuilder dado = new StringBuilder();
		dado.append("Nome: ");
		dado.append(this.getNome());
		dado.append("; Identidade: ");
		dado.append(this.getIdentidade());
		dado.append("; Data de Nascimento: ");
		dado.append(this.getData());
		return dado.toString();
	}
}
