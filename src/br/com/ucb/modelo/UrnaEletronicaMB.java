package br.com.ucb.modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "urnaEletronicaMB")
@RequestScoped
public class UrnaEletronicaMB {

	private UrnaEletronica urnaEletronica;

	public UrnaEletronicaMB() {
		this.urnaEletronica = new UrnaEletronica();
	}

	public String registraVotos() {
		switch (this.urnaEletronica.getVoto()) {
		case 11:
			this.urnaEletronica.votarMaduro();
			System.out.println("Votou no maduro.");
			break;
		case 23:
			this.urnaEletronica.votarJuan();
			System.out.println("Votou no juan.");
			break;
		}
		return "voto-registrado";
	}
	
	public String calculaResultado() {
		
		this.urnaEletronica.votarMaduro();
		
		return "resultado";
	}
}
