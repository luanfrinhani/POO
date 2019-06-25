package prova;
/**
 * Usada para organizar o lembrete do evento
 * <p>
 * Implementa a interface Comparable, pois implementa o método
 * compareTo que é usado na coleção List. Também poderia ser usado
 * pelo método sort (com um argumento) da classe Collections
 * <p>
 * Classe que agrega a classe itemAgenda
 * <p>
 * @author Luan S. F..
 * @version 1.0 (junho-2019)
 */
public class Lembrete extends ItemAgenda implements Comparable<Lembrete> {
	/**minutos indica os minutos para que seja lembrado*/
	public int minutos;
	/**
     * construtor para inicializar valores nos campos
     *
     * @param registro String para apresentar o registro do item
     * @param descricao String para adicionar a descricao do evento
     * @param periodo o periodo de tempo a qual ocorre o certo item
     * @param min minutos para que ocorra o lembrete
     */
	public Lembrete(String registro, String descricao, Periodo periodo, int min) throws Exception {
		super(registro, descricao, periodo);
		this.setMinutos(min);
	}
	/**
     * construtor para inicializar valores nos campos
     *
     * @param registro String para apresentar o registro do item
     * @param descricao String para adicionar a descricao do evento
     * @param dataIn data inicial
     * @param dataFim data final
     * @param horarioIn horario incial
     * @param horarioFim horarioFinal
     * @param min minutos para que ocorra o lembrete
     */
	public Lembrete(String registro, String descricao, DataCalendario dataIn, DataCalendario dataFim,Horario horarioIn, Horario horarioFim, int min) throws Exception {
		super(registro, descricao, dataIn, dataFim, horarioIn, horarioFim);
		this.setMinutos(min);
	}
	/**
	 * pega o valor dos minutos
	 * 
	 * @return retorna o valor dos minutos
	 */
	public int getMinutos() {
		return this.minutos;
	}
	/**
	 * modifica os minutos do lembrete
	 *
	 * @param min inteiro para ser utilizado nos minutos
	 */
	public void setMinutos(int min) throws Exception {
		if (min >= 0) {
			this.minutos = min;
		}
		else {
			throw new Exception("\nValor menor ou igual a zero\n");
		}
	}
	/**
	 * método que compara se dois lembretes sao iguais
	 * 
	 * @param lembrete 
	 * 
	 * @return retorna 1 se o lembrete 1 for maior
	 * @return retorna -1 se o lembrete 2 for maior
	 * @return retorna 0 se forem iguais
	 */
	public int compareTo(Lembrete lembrete) {
		if (this.getMinutos() < lembrete.getMinutos()) return -1;
		else if (this.getMinutos() > lembrete.getMinutos()) return 1;
		else return 0;
	}
	/**
	 * Sobreposição do método toString para retornar o toString da classe super, e o local do evento
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(super.toString());
		s.append("\nO lembrete ira acionar em: ");
		s.append(this.getMinutos());
		s.append(" minutos\n");
		return s.toString();
	}

}

