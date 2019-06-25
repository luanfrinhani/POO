package prova;

public class Lembrete extends ItemAgenda implements Comparable<Lembrete> {
	public int minutos;
	
	public Lembrete(String registro, String descricao, Periodo periodo, int min) throws Exception {
		super(registro, descricao, periodo);
		this.setMinutos(min);
	}
	public Lembrete(String registro, String descricao, DataCalendario dataIn, DataCalendario dataFim,Horario horarioIn, Horario horarioFim, int min) throws Exception {
		super(registro, descricao, dataIn, dataFim, horarioIn, horarioFim);
		this.setMinutos(min);
	}
	
	public int getMinutos() {
		return this.minutos;
	}
	public void setMinutos(int min) throws Exception {
		if (min >= 0) {
			this.minutos = min;
		}
		else {
			throw new Exception("\nValor menor ou igual a zero\n");
		}
	}

	public int compareTo(Lembrete lembrete) {
		if (this.getMinutos() < lembrete.getMinutos()) return -1;
		else if (this.getMinutos() > lembrete.getMinutos()) return 1;
		else return 0;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(super.toString());
		s.append("\nO lembrete ira acionar em: ");
		s.append(this.getMinutos());
		s.append(" minutos\n");
		return s.toString();
	}

}

