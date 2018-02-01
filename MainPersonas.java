package ejercicio3objetosyclases;

import java.util.Scanner;

public class MainPersonas {

/*static Personas personaA = new Personas();
	static Personas personaB = new Personas();
	static Personas personaC = new Personas();
*/	
	static Scanner teclado = new Scanner(System.in);
	
	static Byte selector;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Personas person [] = new Personas[3];
	
	
		for (int i = 0; i < 1; i++) {
		
		imprime("\nRellena la ficha "+(i+1)+"\n");	
			
		person [i] = new Personas();
		
		estableceDatos(person[i]);

		}
		
		selector = 1;
		
		byte opcion;
		
		do {
			
			imprime("\nMenu - Ahora se encuentra seleccionado la persona "+(selector)+"\n");
			imprime("1 - Calcula el IMC de la persona seleccionada");
			imprime("2 - Para saber si es mayor de edad");
			imprime("3 - Comprueba sexo");
			imprime("4 - Selecciona otra persona [elegie entre 1 y 3]");
			imprime("5 - Devuelve toda la información");

			imprime("\nElige una opción");

			opcion = teclado.nextByte();
			
			switch (opcion) {
			case 1:
				
				person[selector - 1].calcularIMC();
						
		
				break;
				
			case 2:
				
			person[selector - 1].mayorEdad();
				
				break;
				
			case 3:
				
				person[selector -1].determinaSexo(person[selector -1].getSexo());
				
				break;
				
			case 4:
				
				imprime("Elije una nueva persona");
				
				selector = teclado.nextByte();
				
				imprime("Ahoa está "+person[selector -1].getNombre()+" seleccionado/a ");
				
				break;
				
			case 5:
				
				// no funciona
				
				imprime(person[selector -1].toString());
				
				break;
				
			default:
				break;
			}
			
			
			
		} while (opcion!=0);
		
		
	}
	public static void imprime(String mensaje) {

		System.out.println(mensaje);

	}
	
	
	public static Personas estableceDatos(Personas personaDatos) {
		
	
		imprime("Define el nombre:");
		
		personaDatos.setNombre(teclado.next());
		
		imprime("Define edad:");
		
		personaDatos.setEdad(teclado.nextByte());
		
		imprime("Define sexo con las teclas H (hombre) o M (mujer):");
		
		personaDatos.setSexo(teclado.next().charAt(0));
		
				
		imprime("Define altura");
		
		personaDatos.setAltura(teclado.nextDouble());
		
		imprime("Define peso");
		
		personaDatos.setPeso(teclado.nextDouble());
	
		return personaDatos;
		
		
		
	}

}
