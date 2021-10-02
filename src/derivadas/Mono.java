package derivadas;

import base.Animal;

public class Mono extends Animal {
	private int cantidadPatas;
	
	public Mono(int edad, String tipoAlimentacion, String color, int cantidadPatas) {
//		super(edad, tipoAlimentacion, color);
		super.edad = edad;
		super.tipoAlimentacion = tipoAlimentacion;
		super.color = color;
		this.cantidadPatas = cantidadPatas;
	}
	
	public int getEdad() {
		return edad;
	}
	public String getColor() {
		return color;
	}
	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}
	public int getCantidadPatas() {
		return cantidadPatas;
	}
	
	public void trepar() {
		System.out.println("El mono Está trepando");
	}
}
