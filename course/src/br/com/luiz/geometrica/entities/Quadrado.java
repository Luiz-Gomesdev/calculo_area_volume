package br.com.luiz.geometrica.entities;

public class Quadrado extends Figura2D {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
//		return lado * lado;
		return Math.pow(lado, 2);
	}
	
	

}
