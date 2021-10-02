package derivadas;

import base.Animal;

public class Perro extends Animal {
	private int cantidadPatas;
	
	public Perro(int edad, String tipoAlimentacion, int cantidadPatas) {
		super.edad = edad;
		super.tipoAlimentacion = tipoAlimentacion;
		this.cantidadPatas = cantidadPatas;
	}
	
	public int getEdad() {
		return edad;
	}
	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}
	public int getCantidadPatas() {
		return cantidadPatas;
	}
	
	
	public void ladrar() {
		System.out.println("El perro está ladrando");
	}
}
