package br.com.ucb.modelo;

import com.sun.xml.internal.ws.util.StringUtils;

public class UrnaEletronica {

	private static final int NICOLAS_MADURO = 11;
	private static final int JUAN_GUAIDO = 23;
	private int voto;

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	// public void votar() {
	// if (this.voto != null) {
	// this.voto = this.voto;
	// }
	// this.voto = null;
	// }

	public String registrarVotos() {

		if (this.voto != null) {
			if (this.voto == 11) {

			}
		}

	}

}
