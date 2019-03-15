package br.com.ucb.modelo;

import com.sun.xml.internal.ws.util.StringUtils;

public class UrnaEletronica {

	private static final String NICOLAS_MADURO = "11";
	private static final String JUAN_GUAIDO = "23";
	private int voto;
	private int contadorNicolas = 0;
	private int contadorJuan = 0;

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public void votarMaduro() {
		this.contadorNicolas++;
	}
	
	public void votarJuan() {
		this.contadorJuan++;
	}
	
}
