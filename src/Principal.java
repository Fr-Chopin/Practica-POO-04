import derivadas.*;

public class Principal {

	public static void main(String[] args) {
//		Mono jimmy = new Mono(3, "herb�voro", "marron cafe", 2);
//		
//		jimmy.trepar();
//		System.out.println("La edad es: " + jimmy.getEdad() + " a�os");
//		System.out.println("Tipo de alimentaci�n: " + jimmy.getTipoAlimentacion());
//		System.out.println("El color es: " + jimmy.getColor());
//		System.out.println("Cantidad de patas: " + jimmy.getCantidadPatas());
//		
//		Perro boby = new Perro(6, "omn�voro", 4);
//		
//		boby.ladrar();
//		System.out.println("La edad es: " + boby.getEdad() + " a�os");
//		System.out.println("Tipo de alimentaci�n: " + boby.getTipoAlimentacion());
//		System.out.println("Cantidad de patas: " + boby.getCantidadPatas());
		
		Pez nemo = new Pez(1, "naranja", 1.3);
		
		nemo.nadar();
		System.out.println("La edad es: " + nemo.getEdad() + " a�o");
		System.out.println("El color es: " + nemo.getColor());
		System.out.println("El peso es: " + nemo.getPeso() + "kg");

	}

}
