package prova;
/**
 * Usada para organizar um periodo de tempo que certo evento ira acontecer, utiliza as classes 
 * Horario e DataCalendario com agragacao
 *
 * <p>
 *
 * @author Luan S. F.
 * @version 1.0 (junho - 2019)
 */

public class Periodo {
	/** Horario inicial do periodo */
	private Horario horarioInicio;
	/** Horario de termino do periodo */
	private Horario horarioFinal;
	/** Data de inicio do periodo */
	private DataCalendario dataInicio;
	/** Data de termino do periodo */
	private DataCalendario dataFinal;
	/**
     * construtor para inicializar valores nos campos
     *
     * @param dataInicio data de inicio do periodo
     * @param dataFim data de termino do periodo
     * @param horarioIn horario de inicio
     * @param horarioFim horario de termino
     */
	public Periodo(DataCalendario dataInicio, DataCalendario dataFinal, Horario horarioInicio, Horario horarioFinal) {
		this.setDataInicio(dataInicio);
		this.setDataFim(dataFinal);
		this.setHorarioInicio(horarioInicio);
		this.setHorarioFim(horarioFinal);
	}
	/**
     * construtor para inicializar valores nos campos
     *
     * @param di dia da data inicial
     * @param mi mes da data inicial
     * @param ai ano da data inicial
     * @param df dia da data final
     * @param mf mes da data final
     * @param af ano da data final
     * @param hori hora do horario inicial
     * @param mini minuto do horario inical 
     * @param segui segundo do horario inicial
     * @param hf hora do horario final 
     * @param minf minuto do horario final 
     * @param seguif segundo do horario final 
     * @throws Exception para datas e horarios invalidos 
     */
	public Periodo(int di, int mi, int ai, int df, int mf, int af, int hori, int mini, int segui, int hf, int minf, int seguif) throws Exception {
		this.setDataInicio(new DataCalendario(di, mi, ai));
		this.setDataFim(new DataCalendario(df, mf, af));
		this.setHorarioInicio(new Horario(hori, mini, segui));
		this.setHorarioFim(new Horario(hf, minf, seguif));
	}
	/**
	 * pega o valor da data inicial do periodo
	 * 
	 * @return valor da data inicial
	 */
	public DataCalendario getDataInicio() {
		return this.dataInicio;
	}
	/**
	 * pega o valor da data final do periodo
	 * 
	 * @return valor da data final
	 */
	public DataCalendario getDataFim() {
		return this.dataFinal;
	}
	/**
	 * pega o valor do horario inicial do periodo
	 * 
	 * @return valor do horario inicial do periodo
	 */
	public Horario getHorarioInicio() {
		return this.horarioInicio;
	}
	/**
	 * pega o valor do horario final do periodo
	 * 
	 * @return valor do horario final
	 */
	public Horario getHorarioFim() {
		return this.horarioFinal;
	}
	/**
	 * modifica a data inicial em questao 
	 *
	 * @param dataInicio que representa a data inicial do periodo
	 * @throws Exception para a verificação dos this utilizados
	 */
	public void setDataInicio(DataCalendario dataInicio) {
		this.dataInicio = dataInicio;
	}
	/**
	 * modifica a data final em questao 
	 *
	 * @param dataFinal que representa a data final do periodo
	 * @throws Exception para a verificação dos this utilizados
	 */
	public void setDataFim(DataCalendario dataFinal) {
		this.dataFinal = dataFinal;
	}
	/**
	 * modifica o horario inicial em questao 
	 *
	 * @param horarioInicial que representa o horario inicial do periodo
	 * @throws Exception para a verificação dos this utilizados
	 */
	public void setHorarioInicio(Horario horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	/**
	 * modifica o horario final em questao 
	 *
	 * @param horarioFinal que representa o horario final do periodo
	 * @throws Exception para a verificação dos this utilizados
	 */
	public void setHorarioFim(Horario horarioFinal) {
		this.horarioFinal = horarioFinal;
	}
	/**
	 * Sobreposição do método toString para retornar a data de inicio e fim assim como o horario do periodo
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Data  de inicio: ");
		s.append(this.dataInicio.toString());
		s.append("\nData do fim: " );
		s.append(this.dataFinal.toString());
		s.append("\nHorario de inicio: ");
		s.append(this.horarioInicio);
		s.append("\nHorario do fim: ");
		s.append(this.horarioFinal);
		return s.toString();
	}
	
}
