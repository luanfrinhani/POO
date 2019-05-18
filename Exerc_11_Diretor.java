package com.DataPasta;

public class Diretor extends Chefe{
	private DataCalendario DataProm;

	public Diretor(String nome, String identidade, DataCalendario dtNasc, DataCalendario _dtAdmissao, double _salario, String _depto, DataCalendario _dtPromocao) throws Exception{
		super(nome, identidade, dtNasc, _dtAdmissao, _salario, _depto);
		this.setDtPromocao(DataProm);
	}
	public Diretor(String _nome, String _identidade, String _dtNascStr, String _dtAdmStr, double _salario, String _depto, String _dtPromoStr) throws Exception {
		super(_nome, _identidade, _dtNascStr, _dtAdmStr, _salario, _depto);
		this.setDtPromocao(new DataCalendario(_dtPromoStr));
	}
	public Diretor(String _nome, String _identidade, int _diaNasc, int _mesNasc, int _anoNasc, int _diaAdm, int _mesAdm, int _anoAdm, double _salario, String _depto, int _diaPromo, int _mesPromo, int _anoPromo) throws Exception {
		super(_nome, _identidade, _diaNasc, _mesNasc, _anoNasc, _diaAdm, _mesAdm, _anoAdm, _salario, _depto);
		this.DataProm = new DataCalendario(_diaPromo, _mesPromo, _anoPromo);
	}
	public DataCalendario getDtPromocao() {
		return this.DataProm;
	}
	public void setDtPromocao(DataCalendario _dtPromocao) {
		this.DataProm = _dtPromocao;
	}
	@Override
	public String toString() {
		return super.toString() + ", promocao=" + this.getDtPromocao();
	}
}
