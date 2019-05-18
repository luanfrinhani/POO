package exercicioPonto;

public class Ponto {
	private double x,y;
	private double distOri;
	private static final double Default_LimSup = 500,Default_LimIn = 0;
	private static double LimiteSup = Default_LimSup, LimiteInf = Default_LimIn;
	
	public Ponto(double x,double y) throws Exception{
		this.setPonto(x,y);
	}
	public Ponto(String P) throws Exception{
		double coordx,coordy;	
		int aux1;
		aux1 = P.indexOf(1);
		coordx = Double.parseDouble(P.substring(aux1,aux1+1));
		aux1 = P.indexOf(3);
		coordy = Double.parseDouble(P.substring(aux1,aux1+1));
		this.setPonto(coordx,coordy);
	}
	public Ponto() throws Exception{
		this(0,0);
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double getLimSup() {
		return Ponto.LimiteSup;
	}
	public double getLimInf() {
		return Ponto.LimiteInf;
	}
	public static void setLimSup(double Limite_Sup) {
		Ponto.LimiteSup = Limite_Sup;
	}
	public static void setLimInf(double Limite_Inf) {
		Ponto.LimiteInf = Limite_Inf;
	}
	public void setPonto(double x,double y) throws Exception {
			this.setX(x);
			this.setY(y);
	}
	public void setX(double x) throws Exception{
		if (x>=Ponto.LimiteInf && x<=Ponto.LimiteSup) {
			this.x=x;
		}
		else {
			throw new Exception("Erro");
		}
	}
	public void setY(double y) throws Exception{
		if (y>=Ponto.LimiteInf && y<=Ponto.LimiteSup) {
			this.y=y;
		}
		else {
			throw new Exception("Erro");
		}
	}
	public boolean equals(Object Objeto) {
		Ponto P = (Ponto)Objeto;
		if (this.getX() == P.getX() && this.getY() == P.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static Ponto clonar(Ponto P) throws Exception{
		Ponto ponto = new Ponto();
		ponto.x = P.x;
		ponto.y = P.y;
		return ponto;
	}
	public static Ponto criaSwap(Ponto P) throws Exception{
		Ponto ponto = new Ponto();
		ponto.x = P.y;
		ponto.y = P.x;
		return ponto;
	}
	public boolean temEixoComum(Ponto P) {
		if (Math.abs(P.getX()) == Math.abs(this.getX()) || Math.abs(P.getY()) == Math.abs(this.getY())) {
			return true;
		}
		else {
			return false;
		}
	}
	public double distancia(Ponto P) {
		double dist = 0.0;
		dist = Math.sqrt(Math.pow((P.getX() - this.getX()),2) + Math.pow((P.getY() - this.getY()),2));
		return dist;
	}
	public double distancia(double x1,double y1) throws Exception{
		double dist = 0.0;
		Ponto P = new Ponto(x1,y1);
		dist = Math.sqrt(Math.pow((P.getX() - this.getX()),2) + Math.pow((P.getY() - this.getY()),2));
		return dist;
	}
	public static double distancia(double x1,double y1,double x2,double y2) throws Exception{
		double dist = 0.0;
		Ponto P = new Ponto(x1,y1);
		Ponto P2 = new Ponto(x2,y2);
		dist = Math.sqrt(Math.pow((P.getX() - P2.getX()),2) + Math.pow((P.getY() - P2.getY()),2));
		return dist;
	}
	public static double distancia(Ponto P,Ponto P2) {
		double dist = 0.0;
		dist = Math.sqrt(Math.pow((P.getX() - P2.getX()),2) + Math.pow((P.getY() - P2.getY()),2));
		return dist;
	}
	public void distanciaDaOrigem() {
		double dist = 0.0;
		dist = Math.sqrt(Math.pow(this.getX(),2) + Math.pow(this.getY(),2));
		this.distOri = dist;
	}
	public int compareTo(Ponto P) throws Exception{
		if (P.distOri > this.distOri) {
			return 1;
		}
		if (P.distOri< this.distOri) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("(");
		s.append(this.getX());
		s.append(",");
		s.append(this.getY());
		s.append(")");
		return s.toString();
	}
}
