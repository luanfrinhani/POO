package exerc_19;

public class Ponto3D extends Ponto{
	
	private double z;
	
	public Ponto3D(double x,double y,double _z) throws Exception{
		super(x,y);
		this.setZ(_z);
	}
	public double getZ() {
		return this.z;
	}
	public void setZ(double _z) throws Exception{
		if(super.isLimite(_z)) 	
			this.z = _z;
		else
			throw new Exception ("Valor de x fora dos limites");
	}
	public Ponto clonar() throws Exception {
		return new Ponto3D(super.getX(), super.getY(),this.getZ());
	}
	public Ponto criaSwap() throws Exception {
		return new Ponto3D(super.getY(), super.getX(),this.getZ());
	}
	public boolean temEixoComum(Ponto3D _ponto){
		return super.getX() == _ponto.getX() || super.getY() == _ponto.getY() || this.getZ() == _ponto.getZ();
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("(");
		s.append(super.getX());
		s.append(",");
		s.append(super.getY());
		s.append(",");
		s.append(this.getZ());
		s.append(")");
		return s.toString();
	}

}
