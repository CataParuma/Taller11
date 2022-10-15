import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite su nombre:");
		String nombre = sc.next();
		
		System.out.println("Digite su edad:");
		int edad = sc.nextInt();
		
		System.out.println("Digite su sexo: H o M");
		String sexo = sc.next();
		
		System.out.println("Digite su peso:");
		int peso = sc.nextInt();
		
		System.out.println("Digite su altura:");
		int altura = sc.nextInt();	
		
		Persona p1 = new Persona(nombre, sexo.charAt(0), edad, peso, altura);
		Persona p2 = new Persona(nombre, sexo.charAt(0), edad);
		Persona p3 = new Persona();
		
		p3.setAltura(altura);
		p3.setEdad(edad);
		p3.setNombre(nombre);
		p3.setPeso(peso);
		p3.setSexo('M');
		
		if(p1.calcularIMC()==-1) {
			System.out.println("Esta debajo de su peso ideal");
		} else if (p1.calcularIMC()==0) {
			System.out.println("Esta en su peso ideal");
		} else {
			System.out.println("Tiene sobrepeso");
		}
		
		if(p1.esMayorDeEdad()==true) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona es menor de edad");
		}
	}

}
