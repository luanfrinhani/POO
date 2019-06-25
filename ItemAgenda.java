package prova;
/**
 * Usada para organizar itens de uma agenda, utiliza a classe periodo como agregacao
 * <p>
 * @author Luan S. F.
 * @version 1.0 (junho - 2019)
 */
public abstract class ItemAgenda {
	/** Registro da agenda*/
	private String registro;
	/** Descricao do item da agenda */
	private String descricao;
	/** periodo de tempo que sera realizado */
	private Periodo periodo;
	/**
     * construtor para inicializar valores nos campos
     *
     * @param registro String para apresentar o registro do item
     * @param descricao do item da agente
     * @param periodo o periodo de tempo a qual ocorre o certo item
     */
	public ItemAgenda(String registro, String descricao, Periodo periodo) {
		this.setDescricao(descricao);
		this.setPeriodo(periodo);
		this.setRegistroItem(registro);
	}
	/**
     * construtor para inicializar valores nos campos
     *
     * @param registro String para apresentar o registro do item
     * @param descricao do item da agente
     * @param di dia inicial
     * @param df dia final
     * @param hi hora inicial
     * @param hf hora final
     */
	public ItemAgenda(String registro, String descricao, DataCalendario di, DataCalendario df, Horario hi, Horario hf) {
		this.setDescricao(descricao);
		this.setPeriodo(new Periodo (di, df, hi, hf));
		this.setRegistroItem(registro);
	}
	/**
	 * pega o valor do registro
	 * 
	 * @return valor do registro
	 */
	public String getRegistro() {
		return this.registro;
	}
	/**
	 * pega o valor da descricao
	 * 
	 * @return valor da descricao
	 */
	public String getDescricao() {
		return this.descricao;
	}
	/**
	 * pega o valor do periodo
	 * 
	 * @return valor do periodo
	 */
	public Periodo getPeriodo() {
		return this.periodo;
	}
	/**
	 * modifica o registro do item
	 *
	 * @param registro String que representa o registro do item
	 */
	public void setRegistroItem(String registro) {
		this.registro = registro;
	}	
	/**
	 * modifica a descricao do item
	 *
	 * @param descricao String que representa a descricao do item
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * modifica o periodo do item
	 *
	 * @param periodo que representa o periodo do item
	 */
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	/**
	 * Sobreposição do método toString para retornar a descricao, o registro e o periodo do item da agenda
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("\nRegistro do Item: ");
		s.append(this.getRegistro());
		s.append("\nDescricao: ");
		s.append(this.getDescricao());
		s.append("\nPeriodo: ");
		s.append(this.getPeriodo());
		return s.toString();
	}
	
}
