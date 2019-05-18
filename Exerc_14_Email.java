package exerc14;

public class Email {
	private String descEmail;
	
	public Email(String descEmail) throws Exception{
		this.setEmail(descEmail);
	}
	public Email() throws Exception{
		this("");
	}
	public String getEmail() {
		return this.descEmail;
	}
	public void setEmail(String email) throws Exception{
		int p = -1;
		p = email.indexOf("@");
		if (p != -1) {
			this.descEmail = email;
		}
		else {
			throw new Exception("Invalido");
		}
	}
	public String toString() {
		return "Email = " + this.getEmail();
	}
	public boolean equals(Object Objeto) {
		Email aux = (Email)Objeto;
		if (this.getEmail() == aux.getEmail()) {
			return true;
		}
		else {
			return false;
		}
	}
}
