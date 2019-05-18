package exerc14;

public class Cliente {
	private String cel;
	private String ende;
	private double renda;
	private Contato pessoa;
	static final public double Default_Renda = 2000.0;
	static public double RendaMin = Default_Renda;
	public Cliente(String nome, String email, String cel, String ende, double renda) throws Exception{
		this.setCel(cel);
		this.setEnde(ende);
		this.setRenda(renda);
		this.pessoa = new Contato(nome,email);
	}
	public Cliente() throws Exception{
		this("","","","",0);
	}
	public double getRendaMin() {
		return this.RendaMin;
	}
	public String getCel() {
		return this.cel;
	}
	public String getEnde() {
		return this.ende;
	}
	public double getRenda() {
		return this.renda;
	}
	public void setRendaMin(double rendaM) {
		this.RendaMin = rendaM;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public void setEnde(String ende) {
		this.ende = ende;
	}
	public void setRenda(double renda) throws Exception{
		if (renda>RendaMin) {
			this.renda = renda;
		}
		else {
			throw new Exception("Renda Invalida");
		}
	}
	public String categoriaCliente(Cliente C) {
		if (C.renda > 2000) {
			return "Top";
		}
		else {
			return "Usual";
		}
	}
	public static String categoriaClienteS(Cliente C) {
		if (C.renda>2000) {
			return "Top";
		}
		else {
			return "Usual";
		}
	}
	public String toString() {
		return "Nome: " + pessoa.getNome() + "\n" + pessoa.getEmail() + "\nCelular: " + getCel() + "\nEndereco: " + getEnde() + "\nRenda: " + getRenda();
	}
}
