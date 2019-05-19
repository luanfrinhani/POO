package exerc_15;
import java.util.Date;
import java.util.*;
public class Data extends Date{
	
	
	public void setMonth(String m) {
		int _m = 0;
		if (m.equals("Janeiro") || m.equals("janeiro")) {
			_m = 1;
		}
		if (m.equals("Fevereiro") || m.equals("fevereiro")) {
			_m = 2;
		}
		if (m.equals("Marco") || m.equals("marco")) {
			_m = 3;
		}
		if (m.equals("Abril") || m.equals("abril")) {
			_m = 4;
		}
		if (m.equals("Maio") || m.equals("maio")) {
			_m = 5;
		}
		if (m.equals("Junho") || m.equals("junho")) {
			_m = 6;
		}
		if (m.equals("Julho") || m.equals("julho")) {
			_m = 7;
		}
		if (m.equals("Agosto") || m.equals("agosto")) {
			_m = 8;
		}
		if (m.equals("Setembro") || m.equals("setembro")) {
			_m = 9;
		}
		if (m.equals("Outubro") || m.equals("outubro")) {
			_m = 10;
		}
		if (m.equals("Novembro") || m.equals("novembro")) {
			_m = 11;
		}
		if (m.equals("Dezembro") || m.equals("dezembro")) {
			_m = 12;
		}
		super.setMonth(_m);
	}
	public int getMounth() {
		return super.getMonth()+1;
	}
	public long retornaDias(Date data1, Date data2) {
		long d1 = data1.getTime(), d2 = data2.getTime();
		long dias = d1 - d2;
		dias = dias/1000;
		dias = dias/60;
		dias = dias/24;
		return dias;
	}
	public Date incrementa(int dias) {
		long d1 = this.getTime();
		d1 = d1/1000;
		d1 = d1/60;
		d1 = d1/24;
		d1 = d1 + dias;
		Date date = new Date(d1);
		return date;
	}
}
