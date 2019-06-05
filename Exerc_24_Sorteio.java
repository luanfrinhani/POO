package exerc_24;

import java.io.Serializable;

/**
 * Usada como objeto de teste para compor as classes que encapsulam as coleções
 * LinkedList, TreeSet e HashMap
 * @author Luan S. F.
 * @version 1.0 (junho-2019)
 */

public class Sorteio implements Serializable{
	
	/**Data do sorteio*/
	
	private DataCalendario data;
	
	/**Nomeros sorteados*/
	
	private NumerosSorteados num;
	
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param d dia do sorteio
  	 * @param m mes do sorteio
  	 * @param a ano do sorteio
  	 * @param quant quantidade de sorteios
  	 * @param limInf limite inferior do range de valores
  	 * @param limSup limite superior do range de valores
  	 */

	public Sorteio (int d, int m, int a, int quant, int limInf, int limSup) throws Exception {
		this.data = new DataCalendario(d,m,a);
		this.setNumSort(quant, limInf, limSup);
	}
	
	/**
  	 * construtor com os valores da data e a arvore com os valores da árvore
  	 *
  	 * @param d dia do sorteio
  	 * @param m mes do sorteio
  	 * @param a ano do sorteio
  	 * @param numSort numeros sorteados
  	 */
	
	public Sorteio (int d, int m, int a, NumerosSorteados numSort) throws Exception {
		this.data = new DataCalendario(d, m, a);
		this.setNumSort(numSort);
	}
	
	/**
  	 * construtor com os valores da data apenas 
  	 *
  	 * @param d dia do sorteio
  	 * @param m mes do sorteio
  	 * @param a ano do sorteio
  	 */
	
	public Sorteio (int d, int m, int a) throws Exception {
		this.data = new DataCalendario(d, m, a);
		this.setNumSort();
	}
	
	/**
  	 * construtor com a quantidades de numeros a serem sorteados apenas 
  	 *
  	 * @param quant quantidade de sorteios
  	 */
	
	public Sorteio (int quant) throws Exception {
		this.data = new DataCalendario();
		this.setNumSort(quant);
	}
	
	/**
  	 * construtor default que vai inicializar com os valores padroes
  	 */
	
	public Sorteio() throws Exception {
		this.data = new DataCalendario();
		this.setNumSort();
	}
	
	/**
  	 * pega a data
  	 *
  	 * @return data
  	 */
	
	public DataCalendario getData() {
		return this.data;
	}
	
	/**
  	 * Modifica o valor do numero sorteado
  	 * @param _quant quantidade de numeros sorteados
  	 * @param _limIn limite inferior dos numeros
  	 * @param _limSup limite superios dos numeros
  	 */
	
	public void setNumSort(int _quant, int _limIn, int _limSup) {
		this.num = new NumerosSorteados(_quant, _limIn, _limSup);
	}
	
	/**
  	 * Sobrecarregamento do set para modificar o numero sorteado
  	 * @param numSort a arvore de numeros sorteados
  	 */
	
	public void setNumSort(NumerosSorteados numSort) {
		this.num = numSort;
	}
	
	/**
  	 * Sobrecarregamento do set para modificar o numero sorteado
  	 * @param _quant quantidade de numeros sorteados
  	 */
	
	public void setNumSort(int quant) {
		this.num = new NumerosSorteados(quant);
	}
	
	/**
  	 * Sobrecarregamento do set para modificar o numero sorteado com valor default
  	 * 
  	 */
	
	public void setNumSort() {
		this.num = new NumerosSorteados();
	}
	
	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return retorna String com todos os valores dos campos
	 */
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("\nData: ");
		s.append(this.data.toString());
		s.append("\nNumeros Sorteados: ");
		s.append(this.num.getNumSort());
		return s.toString();
	}
	
}
