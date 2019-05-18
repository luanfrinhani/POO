package exerc17;

public class Circulo {
	private Coordenada x,y;
	private double r,esp;
	private boolean p;

	
	public Circulo(double _x,double _y,double _r,double _esp,boolean _p) throws Exception{
		this.x = new Coordenada(_x);
		this.y = new Coordenada(_y);
		this.setCirculo(this.x,this.y,_r,_esp,_p);
	}
	public Circulo() throws Exception{
		this(0,0,0,0,false);
	}
	public Coordenada getX() {
		return this.x;
	}
	public Coordenada getY() {
		return this.y;
	}
	public double getRaio() {
		return this.r;
	}
	public double getEsp() {
		return this.esp;
	}
	public boolean getP() {
		return this.p;
	}
	public void setCirculo(Coordenada c1,Coordenada c2,double _r,double _esp,boolean _p) throws Exception{
		if (r > 0) {
			this.x = c1;
			this.y = c2;
			this.r = _r;
			this.esp = _esp;
			this.p = _p;
		}
		else {
			throw new Exception("Erro");
		}
	}
	public double perimetro() {
		return (2*Math.PI*this.getRaio());
	}
	public double area() {
		return (Math.PI*(Math.pow(this.getRaio(),2)));
	}
	public boolean equals(Object obj) {
		Circulo aux = (Circulo)obj;
		if (this.getX() == aux.getX() && this.getY() == aux.getY() && this.getRaio() == aux.getRaio()) {
			return true;
		}
		return false;
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("(");
		s.append(this.getX());
		s.append(",");
		s.append(this.getY());
		s.append(") - ");
		s.append(this.getRaio());
		s.append(" - Espessura: ");
		s.append(this.getEsp());
		s.append(" - Preenchido: ");
		s.append(this.getP());
		return s.toString();
	}
}
