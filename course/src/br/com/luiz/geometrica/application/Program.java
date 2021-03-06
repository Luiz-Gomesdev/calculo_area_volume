package br.com.luiz.geometrica.application;

import java.util.Locale;

import br.com.luiz.geometrica.entities.Cilindro;
import br.com.luiz.geometrica.entities.Circulo;
import br.com.luiz.geometrica.entities.Cubo;
import br.com.luiz.geometrica.entities.Figura2D;
import br.com.luiz.geometrica.entities.Figura3D;
import br.com.luiz.geometrica.entities.FiguraGeometrica;
import br.com.luiz.geometrica.entities.Piramide;
import br.com.luiz.geometrica.entities.Quadrado;
import br.com.luiz.geometrica.entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Quadrado q1 = new Quadrado();
		q1.setLado(2);
		q1.setNome("Quadrado");
		
		Circulo c1 = new Circulo();
		c1.setRaio(2);
		c1.setNome("Circulo");
		
		Triangulo t1 = new Triangulo();
		t1.setAltura(2);
		t1.setBase(3);
		t1.setNome("Triangulo");
		
		Cubo cub1 = new Cubo();
		cub1.setLado(3);
		cub1.setNome("Cubo");
		
		Cilindro ci1 = new Cilindro();
		ci1.setAltura(3);
		ci1.setRaio(2);
		ci1.setNome("Cilindro");
		
		Piramide pir1 = new Piramide();
		pir1.setAltura(3);
		pir1.setApotema(4);
		pir1.setArestaBase(2);
		pir1.setNumPoliBase(4);
		pir1.setBase(2);
		pir1.setNome("Piramide");
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = q1;
		figuras[1] = c1;
		figuras[2] = t1;
		figuras[3] = cub1;
		figuras[4] = ci1;
		figuras[5] = pir1;
		
		for (FiguraGeometrica figura : figuras) {
			System.out.println("--------------------");
			System.out.println(figura.getNome());
			
			if (figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figura; 
				System.out.println("?rea= " + String.format("%.2f", f2d.calcularArea()) + " m?");
			}
			
			if (figura instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figura; 
				System.out.println("?rea= " + String.format("%.2f", f3d.calcularArea()) + " m?");
				System.out.println("Volume= " + String.format("%.2f", f3d.calcularVolume()) + " m?");
			}
		}
		
		
	}

}
