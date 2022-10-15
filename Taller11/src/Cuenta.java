
public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular, double cantidad) {
		
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public Cuenta() {
		
		if (cantidad<0) {
			cantidad=0;
		}
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public String toString() {
		return "Cuenta [getCantidad()=" + getCantidad() + "]";
	}

	public void ingresar(double cantidad) {
		
		if (cantidad>0) {
			this.cantidad+=cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		
		if (cantidad>0) {
			this.cantidad-=cantidad;
		}
		
		if (cantidad<0) {
			this.cantidad=0;
		}
	}
}
