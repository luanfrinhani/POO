package prova;
/**
 * Usada para organizar o evento que ira acontecer
 * 
 * <p>
 * Implementa a interface Comparable, pois implementa o método
 * compareTo que é usado na coleção List. Também poderia ser usado
 * pelo método sort (com um argumento) da classe Collections
 * Classe que agrega a classe itemAgenda
 * <p>
 
 * @author Luan S. F..
 * @version 1.0 (junho-2019)
 */
public class Meta extends ItemAgenda implements Comparable<Meta> {
	/** inteiro prioridade de um evento*/
	private int pri;
	/**
     * construtor para inicializar valores nos campos
     *
     * @param registro String para apresentar o registro do item
     * @param descricao String para adicionar a descricao do evento
     * @param periodo o periodo de tempo a qual ocorre o certo item
     * @param prioridade inteiro que define a prioridade do evento
     */
	public Meta(String registro, String descricao, Periodo periodo, int prioridade) throws Exception {
		super(registro, descricao, periodo);
		this.setPrioridade(prioridade);
	}
	/**
     * construtor para inicializar valores nos campos
     *
     * @param registro String para apresentar o registro do item
     * @param descricao String para adicionar a descricao do evento
     * @param periodo o periodo de tempo a qual ocorre o certo item
     * @param dataIn data de inicio do evento
     * @param dataFim data de termino do evento
     * @param horarioIn horario de inicio do evento
     * @param horarioFim horario de termino do evento
     * @param pri inteiro que define a prioridade do evento
     */
	public Meta(String registro, String descricao, DataCalendario dataIn, DataCalendario dataFim, Horario horarioIn, Horario horarioFim, int pri) throws Exception {
		super(registro, descricao, dataIn, dataFim, horarioIn, horarioFim);
		this.setPrioridade(pri);
	}
	/**
	 * pega o valor da prioridade
	 * 
	 * @return valor da prioridade
	 */
	public int getPrioridade() {
		return this.pri;
	}
	/**
	 * modifica a prioridade do evento
	 *
	 * @param int prioridade do evento
	 */
	public void setPrioridade(int prioridade) throws Exception {
		if (prioridade > 1) {
			this.pri = prioridade;
		}
		else {
			throw new Exception("\nValor menor que zero\n");
		}
	}	
	/**
	 * método que compara se dois eventos possuem prioridades iguais iguais
	 * 
	 * @param meta do tipo Meta
	 * 
	 * @return retorna -1 se a prioridade da meta for menor
	 * @return retorna 1 se for maior
	 * @return retorna 0 se forem iguais
	 */

	public int compareTo(Meta meta) {
		if (this.getPrioridade() < meta.getPrioridade()) return -1;
		else if (this.getPrioridade() > meta.getPrioridade()) return 1;
		else return 0;
	}
	/**
	 * Sobreposição do método toString para retornar o toString da classe super, e a prioridade do evento
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(super.toString());
		s.append("\nPrioridade da meta: ");
		s.append(this.getPrioridade() + "\n");
		return s.toString();
	}
}
