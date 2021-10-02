package derivadas;

import base.Animal;

public class Pez extends Animal {
	private double peso;
	
	public Pez(int edad, String color, double peso) {
		super.edad = edad;
		super.color = color;
		this.peso = peso;
	}
	
	public int getEdad() {
		return edad;
	}
	public String getColor() {
		return color;
	}
	public double getPeso() {
		return peso;
	}
	
	
	public void nadar() {
		System.out.println("El pez está nadando");
	}
}
