package exerc14;

public class Contato {
	private String nome;
	private Email email;
	
	public Contato(String nome, String em) throws Exception{
		this.setNome(nome);
		this.email = new Email(em);
	}
	public Contato() throws Exception{
		this("",null);
	}
	public String getNome() {
		return this.nome;
	}
	public Email getEmail() {
		return this.email;
	}
	public void setNome(String nome) throws Exception{
		if (this.nome != "") {
			this.nome = nome;
		}
		else {
			throw new Exception("Invalido");
		}
	}
	public boolean equals(Object ob) {
		Contato aux = (Contato)ob;
		if (this.nome == aux.nome && this.email == aux.email) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return "Nome: " + this.getNome() + "Email: " + this.email; 
	}
	
}
