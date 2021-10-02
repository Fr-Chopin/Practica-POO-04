import derivadas.*;

public class Principal {

	public static void main(String[] args) {
//		Mono jimmy = new Mono(3, "herbívoro", "marron cafe", 2);
//		
//		jimmy.trepar();
//		System.out.println("La edad es: " + jimmy.getEdad() + " años");
//		System.out.println("Tipo de alimentación: " + jimmy.getTipoAlimentacion());
//		System.out.println("El color es: " + jimmy.getColor());
//		System.out.println("Cantidad de patas: " + jimmy.getCantidadPatas());
//		
//		Perro boby = new Perro(6, "omnívoro", 4);
//		
//		boby.ladrar();
//		System.out.println("La edad es: " + boby.getEdad() + " años");
//		System.out.println("Tipo de alimentación: " + boby.getTipoAlimentacion());
//		System.out.println("Cantidad de patas: " + boby.getCantidadPatas());
		
		Pez nemo = new Pez(1, "naranja", 1.3);
		
		nemo.nadar();
		System.out.println("La edad es: " + nemo.getEdad() + " año");
		System.out.println("El color es: " + nemo.getColor());
		System.out.println("El peso es: " + nemo.getPeso() + "kg");

	}

}
