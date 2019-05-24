package exerc_19;

public class CilindroEscalavel implements Escalavel,ObjetoTridimensional{
	private Ponto3D p;
	private double raio;
	
	public CilindroEscalavel(double x, double y, double z,double r) throws Exception{
		this.p = new Ponto3D(x,y,z);
		this.setRaio(r);
	}
	public double getRaio() {
		return this.raio;
	}
	public Ponto3D getPonto() {
		return this.p;
	}
	public void setRaio(double r) {
		this.raio = r;
	}
	public double altura() {
		return this.p.getZ();
	}
	public Ponto3D centro() throws Exception{
		Ponto3D p = new Ponto3D(this.p.getX(),this.p.getY(),(this.p.getZ())/2);
		return p;
	}
	public double calculaSuperficie() {
		return 2*Math.PI*this.getRaio()*this.p.getZ();
	}
	public double calculaVolume() {
		return Math.PI*Math.pow(this.getRaio(),2)*this.p.getZ();
	}
	public void amplia(double escala) throws Exception{
		this.setRaio(this.raio*escala);
		this.p.setZ(this.p.getZ()*escala);
	}
	public void espelha() throws Exception{
		this.p.setZ(this.p.getZ()*(-1));
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(this.p.toString());
		s.append(" - Raio: ");
		s.append(this.getRaio());
		s.append(" - Altura: ");
		s.append(this.p.getZ());
		return s.toString();
	}
}
