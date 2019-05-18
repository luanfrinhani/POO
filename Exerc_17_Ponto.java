package exerc17;

public class Ponto {
	private Coordenada x,y;

	public Ponto(double _x,double _y) throws Exception{
		this.x = new Coordenada(_x);
		this.y = new Coordenada(_y);
		this.setPonto(this.x,this.y);
	}
	public Ponto() throws Exception{
		this.x = new Coordenada();
		this.y = new Coordenada();
		this.setPonto(this.x,this.y);
	}
	public Coordenada getX() {
		return this.x;
	}
	public Coordenada getY() {
		return this.y;
	}
	public void setPonto(Coordenada c1, Coordenada c2) {
		this.x = c1;
		this.y = c2;
	}
	public boolean equals(Object obj) {
		Ponto aux = (Ponto)obj;
		if (this.getX() == aux.getX() && this.getY() == aux.getY()) {
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
		s.append(")");
		return s.toString();
	}
	
}
