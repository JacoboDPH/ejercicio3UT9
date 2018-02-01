package ejercicio3objetosyclases;

import java.security.PublicKey;

import javax.imageio.ImageTypeSpecifier;
import javax.lang.model.type.PrimitiveType;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.xml.sax.DocumentHandler;

public class Personas {

	// Atributos

	private String nombre;
	private byte edad;
	private char sexo;
	private double altura;
	private double peso;

	// Métodos getter y setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Métodos especificos



	public void calcularIMC() {

		
    	 if (imc() >= 26) {

			System.out.println(nombre + " ponte a dieta, tienes SOBREPESO con un IMC de " + imc());

		} else if (imc() <= 19) {

			System.out.println(nombre + " hay que comer más gofio, tienes un IMC de " + imc());

		} else 	if (imc() >= 20 || imc() <= 25) {

			System.out.println(nombre + " enorabuena, su IMC "
					+ "" + imc()+ " es saludable");

		} 

	
	}

	public boolean mayorEdad() {

		boolean mayoriaEdad = false;

		if (edad >= 18) {

			mayoriaEdad = true;

			System.out.println("Es mayor de edad");
		}
		
		else {
			
			System.out.println("Es menor de edad");
			
		}

		return mayoriaEdad;

	}


	public int imc(){
		
		double IMC = peso / (altura * altura) * 10000; 
		
		return (int)IMC;
		  
		
		}
	
	public void determinaSexo(char genero) {
		
		if (genero == 'h' || genero == 'H' ) {
			
			System.out.println("Es hombre");
			
			
		} else if (genero == 'm' || genero == 'M' ) {
			
			System.out.println("Es mujer");
			
		} else {
			
			System.out.println("No se reconoce el sexo");
			
		}
	
		
	}
	

}
