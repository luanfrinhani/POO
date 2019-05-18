package exerc17;

public class Retangulo extends Quadrado{
	public Retangulo(double x, double y, double c,double l,double esp, boolean p) throws Exception{
		super(x,y,c,l,esp,p);
	}
	public Retangulo() throws Exception{
		super();
	}
	@Override
	public boolean equals(Object obj) {
		Retangulo aux = (Retangulo)obj;
		if (super.getX() == aux.getX() && super.getY() == aux.getY() && super.getComp() == aux.getComp() && super.getLarg() == aux.getLarg() && super.getEsp() == aux.getEsp() && super.getP() == aux.getP()) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(super.toString());
		return s.toString();
	}
}
