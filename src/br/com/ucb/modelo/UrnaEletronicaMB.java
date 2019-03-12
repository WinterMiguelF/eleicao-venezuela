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

}
