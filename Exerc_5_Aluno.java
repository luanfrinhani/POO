package alunoExerc;

public class Aluno {
	private String nome; 
	private double nota1, nota2, media, pontos;
	static final public double Default_Nota = 10.0,Default_Aprovacao = 7.0;
	static public double NotaMaxima = Aluno.Default_Nota,minimoAprovacao = Default_Aprovacao;
	
	public static double getMinimoAprovacao() {
		return Aluno.minimoAprovacao;
	}
	public static double getNotaMaxima() {
		return Aluno.NotaMaxima;
	}
	public String getNome() {
		return this.nome;
	}
	public double getNota1() {
		return this.nota1;
	}
	public double getNota2() {
		return this.nota2;
	}
	public double getMedia() {
		return this.media;
	}
	public double getPontos() {
		return this.pontos;
	}
	public void setPontos(double pontos) {
		this.pontos=pontos;
		this.calculaMedia(Aluno.NotaMaxima);
	}
	public void setNotas(double nota1, double nota2,double pontos)throws Exception {
    	this.pontos = pontos;
    	if(isNotaValida(nota1) == true && isNotaValida(nota2) == true) {
          	this.nota1 = nota1;
          	this.nota2 = nota2;
          	this.calculaMedia(Aluno.NotaMaxima);
    	}
    	else
          	throw new Exception("nota invalida");
   	}
	public void setNotas(double nota1,double nota2) throws Exception{
		this.setNotas(nota1,nota2,0);
	}
	public double calculaMedia() {
		this.media = (this.getNota1() + this.getNota2() + this.getPontos())/2;
		return this.media;
	}
	public double calculaMedia(double notaMaxima) {
		this.calculaMedia();
		if (this.media>notaMaxima) {
			this.media=notaMaxima;
		}
		return this.media;
	}
	public boolean equals(Object objeto) {
    	Aluno aux = (Aluno)objeto;
    	if (this.getNome().equals(aux.getNome()) &&
                	this.getNota1() == aux.getNota1() &&
                	this.getNota2() == aux.getNota2() &&
                	this.getPontos() == aux.getPontos())
          	return true;
    	return false;
	} 

	
	public static void setNotaMaxima(double MaximaNota) {
		Aluno.NotaMaxima = MaximaNota;
	}
	//Metodo que verifica se uma nota ultrapassou o limite, não sera estatico pois esse método verifica se uma nota especifica 
	//Ultrapassou a media, ou seja, verifica um objeto especifico
	public boolean isNotaValida(double Nota) {
		if (Nota>Aluno.NotaMaxima || Nota<0) {
			return false;
		}
		else {
			return true;
		}
	}
	public String toString() {
		return this.getNome() + ";" + this.getNota1() + ";" + this.getNota2() + ";" + this.getPontos() + ";" + this.getMedia();
	}
	static public boolean isAprovado(double media) {
		if (media>=Aluno.minimoAprovacao) {
			return true;
		}
		return false;
	}
}
