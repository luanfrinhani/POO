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

public class Evento extends ItemAgenda implements Comparable<Evento> {
	/** String local para o local do evento*/
	private String local;
	/**
     * construtor para inicializar valores nos campos
     *
     * @param registro String para apresentar o registro do item
     * @param descricao String para adicionar a descricao do evento
     * @param periodo o periodo de tempo a qual ocorre o certo item
     * @param local String que mostra o local do evento
     */
	public Evento(String registro, String descricao, Periodo periodo, String local) {
		super(registro, descricao, periodo);
		this.setLocal(local);
	}
	/**
     * construtor para inicializar valores nos campos
     *
     * @param registro String para apresentar o registro do item
     * @param descricao do item da agente
     * @param dataIn DataCalendario a data de inicio do evento
     * @param dataFim DataCalendario data de termino do evento
     * @param horarioIn Horario horario inicial do evento
     * @param horarioFim Horario horario final do evento
     * @param local String local do evento
     */
	public Evento(String registro, String descricao, DataCalendario dataIn, DataCalendario dataFim, Horario horarioIn, Horario horarioFim, String local) {
		super(registro, descricao, dataIn, dataFim, horarioIn, horarioFim);
		this.setLocal(local);
	}
	/**
	 * pega o valor do local
	 * 
	 * @return valor do local
	 */
	public String getLocal() {
		return this.local;
	}
	/**
	 * modifica o local do evento
	 *
	 * @param registro String que representa o local do evento
	 */
	public void setLocal(String local) {
		this.local = local;
	}
	/**
	 * método que compara se dois eventos sao iguais, utiliza o compareTo da classe Comparable
	 * 
	 * @param evento do tipo Evento
	 * 
	 * @return retorna os valores associados ao compareTo do Comparable
	 */
	public int compareTo(Evento evento) {
		return this.getLocal().compareTo(evento.getLocal());
	}
	/**
	 * Sobreposição do método toString para retornar o toString da classe super, e o local do evento
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(super.toString());
		s.append("\nLocal do Evento: ");
		s.append(this.getLocal()+"\n");
		return s.toString();
	}
	
}

