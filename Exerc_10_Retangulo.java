package exercicioPonto;

public class Retangulo{
	private Ponto pe,pd;
	public Retangulo(double Xe, double Ye, double Xd, double Yd) throws Exception{
		Ponto p1 = new Ponto(Xe,Ye);
		Ponto p2 = new Ponto(Xe,Xd);
		this.setRetangulo(p1,p2);
	}
	public Retangulo(Ponto Pe,Ponto Pd) throws Exception{
		this.setRetangulo(Pe,Pd);
	}
	public Retangulo() throws Exception{
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		this.setRetangulo(p1,p2);
	}
	public Ponto getPe() {
		return this.pe;
	}
	public Ponto getPd() {
		return this.pd;
	}
	public void setRetangulo(Ponto _pe,Ponto _pd){
		this.pe = _pe;
		this.pd = _pd;
	}
	public double ladoX(Ponto pe, Ponto pd) {
		return (Math.abs(pe.getX() - pd.getX()));
	}
	public double ladoY(Ponto pe, Ponto pd) {
		return (Math.abs(pe.getY() - pd.getY()));
	}
	public double area() {
		return ((ladoX(this.getPe(),this.getPd()))*ladoY(this.getPe(),this.getPd()));
	}
	public double perimetro() {
		return ((2*ladoX(this.getPe(),this.getPd()) + (2*ladoY(this.getPe(),this.getPd()))));
	}
	public boolean equals(Object obj) {
		Retangulo aux = (Retangulo)obj;
		if (this.getPd().equals(aux) && this.getPe().equals(aux)) {
			return true;
		}
		return false;
	}
	public boolean equalsArea(Object obj) {
		Retangulo aux = (Retangulo)obj;
		if (this.area() == aux.area()) {
			return true;
		}
		return false;
	}
	public int compareTo(Retangulo re) {
		if (re.area() > this.area()) {
			return 1;
		}
		if (re.area() < this.area()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(this.pe.toString());
		s.append(" - ");
		s.append(this.pd.toString());
		return s.toString();
	}
}
