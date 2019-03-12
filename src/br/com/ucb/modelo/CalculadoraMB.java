package br.com.ucb.modelo;

import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean(name="calculadoraMB")
@RequestScoped
public class CalculadoraMB {
	
	private Calculadora calculadora;
	
	public CalculadoraMB() {
		this.calculadora = new Calculadora();
	}
	
	public String registrarVoto() {
		return "";
	}

}
