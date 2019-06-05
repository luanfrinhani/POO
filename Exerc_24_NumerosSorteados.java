package exerc_24;
import java.io.Serializable;
import java.util.*;
/**
 * Usada como objeto de teste para compor as classes que encapsulam as coleções
 * TreeSet.
 * <p>
 * Oferece métodos de sortear numeros aleatorios sem repedições.
 * 
 * @author Luan S. F.
 * @version 1.0 (junho - 2019)
 */
public class NumerosSorteados implements Serializable{
	
	private Set<Integer> num;
	
	/** Quantidade de Numeros Sorteados*/
	
	private static final int default_quant = 4;
	
	/** Limite inferio*/
	
	private static final int default_LimInf = 1;
	
	/** Limite Superior*/
	
	private static final int default_limSup = 99;
	
	private static int quant = NumerosSorteados.default_quant,limInf = NumerosSorteados.default_LimInf,limSup = NumerosSorteados.default_limSup;
	
	/**
	 * construtor para inicializar valores vazios
	 *
	 * @param setQuant Modifica quantidade de numeros sorteados
	 * @param setLimIn Modifica limite inferior dos numeros sorteados
	 * @param setLimSup Modifica limite superior dos numeros sorteados
	 * @param fazSorteio Método para gerar os numeros aleatorios
	 */
	
	public NumerosSorteados(int _quant, int _limInf, int _limSup) {
		this.setQuant(_quant);
		this.setLimIn(_limInf);
		this.setLimSup(_limSup);
		this.fazSorteio();
	}
	
	/**
	 * construtor para inicializar valores vazios
	 *
	 * @param setQuant Modifica quantidade de numeros sorteados com o valor padrao
	 * @param setLimIn Modifica limite inferior dos numeros sorteados
	 * @param setLimSup Modifica limite superior dos numeros sorteados
	 * @param fazSorteio Método para gerar os numeros aleatorios
	 */
	
	public NumerosSorteados(int _limInf, int _limSup) {
		this.setQuant(NumerosSorteados.quant);
		this.setLimIn(_limInf);
		this.setLimSup(_limSup);
		this.fazSorteio();
	}
	
	/**
	 * construtor para inicializar valores vazios
	 *
	 * @param setQuant Modifica quantidade de numeros sorteados
	 * @param setLimIn Modifica limite inferior dos numeros sorteados com o valor padrao
	 * @param setLimSup Modifica limite superior dos numeros sorteados com o valor padrao
	 * @param fazSorteio Método para gerar os numeros aleatorios
	 */
	
	public NumerosSorteados(int _quant) {
		this.setQuant(_quant);
		this.setLimIn(NumerosSorteados.limInf);
		this.setLimSup(NumerosSorteados.limSup);
		this.fazSorteio();
	}
	
	/**
	 * construtor para inicializar valores vazios
	 *
	 * @param setQuant Modifica quantidade de numeros sorteados com o valor padrao
	 * @param setLimIn Modifica limite inferior dos numeros sorteados com o valor padrao
	 * @param setLimSup Modifica limite superior dos numeros sorteados com o valor padrao
	 * @param fazSorteio Método para gerar os numeros aleatorios
	 */
	
	
	public NumerosSorteados() {
		this.setQuant(NumerosSorteados.quant);
		this.setLimIn(NumerosSorteados.limInf);
		this.setLimSup(NumerosSorteados.limSup);
		this.fazSorteio();
	}
	
	/**
	 * Pega a quantidade de numeros
	 * 
	 * @return quantidade de numeros a serem sorteados
	 */
	
	public int getQuant() {
		return NumerosSorteados.quant;
	}
	
	/**
	 * Pega o limite inferior dos numeros sorteados
	 * 
	 * @return limite inferior
	 */
	
	public int getLimIn() {
		return NumerosSorteados.limInf;
	}
	
	/**
	 * Pega o limite superior dos numeros sorteados
	 * 
	 * @return limite superior
	 */
	
	public int getLimSup() {
		return NumerosSorteados.limSup;
	}
	
	/**
	 * Pega a arvore dos numeros sorteados
	 * 
	 * @return numeros sorteados
	 */
	
	public Set getNumSort() {
		return this.num;
	}

	/**
	 * modificar a quantidade de numeros a serem sorteados
	 * @param _quant quantidade de valores a serem sorteados
	 */
	
	public void setQuant(int _quant) {
		NumerosSorteados.quant = _quant;
	}
	
	/**
	 * modificar o limite inferior
	 * @param _limInf limite inferior dos numeros sorteados
	 */
	
	public void setLimIn(int _limInf) {
		NumerosSorteados.limInf = _limInf;
	}
	
	/**
	 * modificar o limite superior
	 * @param _limInf superior inferior dos numeros sorteados
	 */
	
	public void setLimSup(int _limSup) {
		NumerosSorteados.limSup= _limSup;
	}

	/**
	 * Método para produzir numeros aleatorios utilizando o Random e a classe 
	 * TreeSet, pois ela tem que verificar se há
	 * elementnos repetidos no conjunto através do critério determinado por
	 * compareTo nela mesmo ja construida. Com isso tem a adição dos valores
	 * inteiros na variavel sorteioVal
	 * 
	 */
	
	public void fazSorteio() {
		int i = 0;
		int x;
		Random gerador = new Random();
		this.num = new TreeSet<Integer>();
		while (i < NumerosSorteados.quant) {
			x = gerador.nextInt(NumerosSorteados.limSup - NumerosSorteados.limInf + 1) + NumerosSorteados.limInf;
			if (this.num.contains(x)) {
				continue;
			}
			else {
				this.num.add(x);
				i++;
			}
		}
	}
}
