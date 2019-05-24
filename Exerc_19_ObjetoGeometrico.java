package exerc_19;

public interface ObjetoGeometrico {
	Ponto centro() throws Exception;
	double calculaArea();
	double calculaPerimetro();
	ObjetoGeometrico clona() throws Exception;
}
