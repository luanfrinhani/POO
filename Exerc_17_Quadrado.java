package exerc17;

public class Quadrado {
	private Coordenada x,y;
	private double comp,larg,esp;
	private boolean p;
	
	public Quadrado(double _x, double _y, double _comp, double _larg,double _esp,boolean _p) throws Exception{
		this.x = new Coordenada(_x);
		this.y = new Coordenada(_y);
		this.setQuadrado(this.x,this.y,_comp,_larg,_esp,_p);
	}
	public Quadrado() throws Exception{
		this(0,0,0,0,0,false);
	}
	public Coordenada getX() {
		return this.x;
	}
	public Coordenada getY() {
		return this.y;
	}
	public double getComp() {
		return this.comp;
	}
	public double getLarg() {
		return this.larg;
	}
	public double getEsp() {
		return this.esp;
	}
	public boolean getP() {
		return this.p;
	}
	public void setQuadrado(Coordenada c1,Coordenada c2, double c,double l,double esp,boolean p) throws Exception{
		if (c > 0 && l > 0) {
			this.x = c1;
			this.y = c2;
			this.comp = c;
			this.larg = l;
			this.esp = esp;
			this.p = p;
		}
		else {
			throw new Exception("Erro");
		}
	}
	public double perimetro() {
		return (this.getComp()*2 + this.getLarg()*2);
	}
	public double area() {
		return (this.getComp()*this.getLarg());
	}
	public boolean equals(Object obj) {
		Quadrado aux = (Quadrado)obj;
		if (this.getX() == aux.getX() && this.getY() == aux.getY() && this.getComp() == aux.getLarg() && this.getLarg() == aux.getLarg()) {
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
		s.append("Largura: ");
		s.append(this.getLarg());
		s.append("\tComprimento: ");
		s.append(this.getComp());
		return s.toString();
	}
}
