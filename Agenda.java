package prova;
import java.util.*;
/**
 * Encapsula a classe LinkedList facilitando o seu uso e tipificando os objetos para
 * inclusão como instâncias da classe Agenda
 
 * @author Luan S. F.
 * @version 1.0 (junho-2019)
*/

public class Agenda {
	private List<ItemAgenda> itens;
	
	public Agenda() {
		itens = new LinkedList<ItemAgenda>();
	}
	
	public List getItensDaAgenda() {
		return this.itens;
	}
	/**
  	 * Insere uma instância da classe Agenda
  	 *
  	 * @param item objeto a ser incluído da coleção
  	 */

	public void insereItem(ItemAgenda item) {
		this.itens.add(item);
	}
	/**Informa as metas ordenadas por sua prioridade
	 * 
	 * @return retorna as metas que foram ordenadas
	 */
	public List informaMetasPrio() {
		int i;
		List<Meta> metas = new LinkedList<Meta>();
		for (i = 0; i<this.itens.size();i++) {
			if (this.itens.get(i).getClass().toString().equalsIgnoreCase("class codigos.Meta")) {
				metas.add((Meta) this.itens.get(i));
			}
		}
		Collections.sort(metas);
		return metas;
	}
	/**Informa os lembretes conforme os minutos de antecedencia que sao mostrados, para ser lembrados
	 * @return retorna os lembretes ordenados, conforme os seus minutos
	 */
	public List lembretesMinutos() {
		int i;
		List<Lembrete> lembretes_ordenados = new LinkedList<Lembrete>();
		for (i = 0; i < this.itens.size();i++) {
			if (this.itens.get(i).getClass().toString().equalsIgnoreCase("class codigos.Lembrete")) {
				lembretes_ordenados.add((Lembrete) this.itens.get(i));
			}
		}
		Collections.sort(lembretes_ordenados);
		return lembretes_ordenados;
	}
	/**Informa os eventos ordenados por seu local
	 * @return os eventos ordenados
	 */
	public List eventosLocal() {
		int i;
		List<Evento> eventos_ordenados = new LinkedList<Evento>();
		for (i = 0; i < this.itens.size();i++) {
			if (this.itens.get(i).getClass().toString().equalsIgnoreCase("class codigos.Evento")) {
				eventos_ordenados.add((Evento) this.itens.get(i));
			}
		}
		Collections.sort(eventos_ordenados);
		return eventos_ordenados;
	}
	/**Informa todos os itens listados na agenda
	 * 
	 * @return retorna a agenda completa
	 */
	public List todosItens() {
		return this.getItensDaAgenda();
	}
	/**Informa os itens da agenda conforme os intervalos de datas
	 * 
	 * @param _inicial
	 * @param _final
	 * @return retorna os eventos entre as datas informadas
	 */
	public List itensIntervalo(DataCalendario inicio, DataCalendario fim) {
		int i;
		List<ItemAgenda> itensDatas = new LinkedList<ItemAgenda>();
		for (i = 0; i < this.itens.size(); i++) {
			if (DataCalendario.compareTo(this.itens.get(i).getPeriodo().getDataInicio(), inicio) != -1 && 
					DataCalendario.compareTo(this.itens.get(i).getPeriodo().getDataFim(), fim) != 1) {
				itensDatas.add(this.itens.get(i));
			}
		}
		return itensDatas;
	}
	/**
	 * Sobreposição do método toString
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(this.itens);
		return s.toString();
	}
}

