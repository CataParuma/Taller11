
public class Persona {
	
	private String nombre=" ";
	private char sexo='H';
	private int edad=0, dni, peso=0, altura=0;
	
	public Persona() {

		sexo='H';
		nombre=" ";
		edad=0;
		generaDNI();
		peso=0;
		altura=0;
	}

	public Persona(String nombre, char sexo, int edad) {
		
		this.nombre = nombre;
		comprobarSexo(sexo);
		this.edad = edad;
		generaDNI();
		peso=0;
		altura=0;
	}
	
	public Persona(String nombre, char sexo, int edad, int peso, int altura) {
		
		this.nombre = nombre;
		comprobarSexo(sexo);
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		
		int calcular = peso/(altura*altura);
		
		if (calcular<20) {
			return -1;
			
		} else if (calcular>=20 || calcular<=25) {
			return 0;
		
		} else {
			return 1;
		}
	}
	
	public boolean esMayorDeEdad() {
		
		boolean detEdad;
		
		if (edad>=18) {
			detEdad=true;
		} else {
			detEdad=false;
		}
		
		return detEdad;
	}
	
	private void comprobarSexo(char sexo) {
		
		if (sexo!='M') {
			this.sexo='H';
		}
	}
	
	public void generaDNI() {
		
		dni = (int) (10000 + Math.random()*90000);
	}
	
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}
