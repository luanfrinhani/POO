package prova;
/**
 * Usada para organizar a horario, com o objetivo de receber e modificar varios tipos de horarios dada pelo
 * usuario
 * <p>
 * @author Luan S. F.
 * @version 1.0 (junho - 2019)
 */
public class Horario {
	/** hora do horario referente */
	private int h;
	/** minutos do horario referente */
	private int m;
	/** segundos do horario referente */
	private int s;
	/**
     * construtor para inicializar valores nos campos
     *
     * @param hora da hora do horario
     * @param minuto do horario
     * @param segundo do horario
     * 
     * @throws Exception para hora, minuto ou segundo invalido
     */
	public Horario(int hora, int min, int seg) throws Exception {
		this.setHorario(hora, min, seg);
	}
	/**
     * construtor para inicializar valores nos campos
     *
     * @param horario do tipo String
     * 
     * @throws Exception para o horario invalido
     */
	public Horario(String horario) throws Exception {
		this.setHorario(horario);
	}
	/**
	 * pega o valor da hora
	 * 
	 * @return valor da hora
	 */
	public int getHora() {
		return this.h;
	}
	/**
	 * pega o valor do minuto
	 * 
	 * @return valor do minuto
	 */
	public int getMinutos() {
		return this.m;
	}	/**
	 * pega o valor do segundo
	 * 
	 * @return valor do segundo
	 */
	public int getSegundos() {
		return this.s;
	}
	/**
	 * modifica o horario em questao e utiliza o metodo isHorarioValida para auxilio
	 *
	 * @param h inteiro que representa a hora 
	 * @param m inteiro que representa o minuto
	 * @param s inteiro que representa o segundo
	 * 
	 * @throws Exception para a verificação dos this utilizados
	 */
	public void setHorario(int h, int m, int s) throws Exception {
		if (Horario.isHorarioValida(h, m, s)) {
			this.h = h;
			this.m = m;
			this.s = s;
		}
		else {
			throw new Exception("\nHora invalida\n");
		}
	}
	/**
	 * modifica o horario em questao
	 *
	 * @param horario string que representa o horario
	 * 
	 * @throws Exception para a verificação dos this utilizados
	 */
	public void setHorario(String horario) throws Exception {
		int h = horario.indexOf(":");
		String hora = horario.substring(0, h);
		int m = horario.indexOf(":", h+1);
		String min = horario.substring(h+1, m);
		String seg = horario.substring(m+1);
		h = Integer.parseInt(hora);
		m = Integer.parseInt(min);
		int s = Integer.parseInt(seg);
		this.setHorario(h, m, s);
	}
	/**
	 * método que compara se dois horarios são iguals
	 * 
	 * @param h1 do tipo horario
	 * @param h2 do tipo horario
	 * 
	 * @return retorna 1 caso a h1 seja maior 
	 * @return retorna -1 caso a h2 seja maior
	 * @return retorna 0 caso os horarios sejam iguais
	 */
	public static int compareTo(Horario h1, Horario h2) {
		if (h1.getHora() > h2.getHora()) return 1;   //se h1 for menor retorna -1
		else {
			if (h1.getHora() < h2.getHora()) return -1;
			else {
				if (h1.getMinutos() > h2.getMinutos()) return 1;
				else {
					if (h1.getMinutos() < h2.getMinutos()) return -1;
					else {
						if (h1.getSegundos() > h2.getSegundos()) return 1;
						else {
							if (h1.getSegundos() < h2.getSegundos()) return -1;
							else {
								return 0;
							}
						}
					}
				}
			}
		}
	}
	/**
	 * método que verifica se um horario e valido
	 * 
	 * @param h tipo inteiro
	 * @param m tipo inteiro
	 * @param s tipo inteiro
	 * 
	 * @return retorna true se o horario for valido
	 * @return retorna false se o horario for invalido
	 */
	public static boolean isHorarioValida(int h, int m, int s) {
		if (h >= 0 && m >= 0 && s >= 0 && h < 24 && m < 60 && s < 60) {
			return true;
		}
		return false;
	}
	/**
	 * Sobreposição do método toString para retornar o horario
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (this.getHora() > 9 && this.getMinutos() > 9 && this.getSegundos() > 9) {
			s.append(this.getHora() + ":" + this.getMinutos() + ":" + this.getSegundos());
		}
		else if (this.getHora() > 9 && this.getMinutos() > 9) {
			s.append(this.getHora() + ":" + this.getMinutos() + ":0" + this.getSegundos());
		}
		else if (this.getHora() > 9 && this.getSegundos() > 9) {
			s.append(this.getHora() + ":0" + this.getMinutos() + ":" + this.getSegundos());
		}
		else if (this.getMinutos() > 9 && this.getSegundos() > 9) {
			s.append("0" + this.getHora() + ":" + this.getMinutos() + ":" + this.getSegundos());
		}
		else if (this.getHora() > 9) {
			s.append(this.getHora() + ":0" + this.getMinutos() + ":0" + this.getSegundos());
		}
		else if (this.getMinutos() > 9) {
			s.append("0" + this.getHora() + ":" + this.getMinutos() + ":0" + this.getSegundos());
		}
		else if (this.getSegundos() > 9) {
			s.append("0" + this.getHora() + ":0" + this.getMinutos() + ":" + this.getSegundos());
		}
		else {
			s.append("0" + this.getHora() + ":0" + this.getMinutos() + ":0" + this.getSegundos());
		}
		return s.toString();
	}
	
}

