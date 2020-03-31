package died.lab01.problema02;

public class Temperatura {
	private double grados;
	private Escala escala;

	public Temperatura() {
		// TODO Auto-generated constructor stub
		this.grados = 0.0;
		this.escala = escala.CELCIUS;
	}
	
	public Temperatura(double grados,Escala escala) {
		this.grados = grados;
		this.escala = escala;
	}
	
	public String toString() {
		int aux = (int) this.grados;
		String result = aux+"";
		if(this.escala == escala.CELCIUS) {
			result = result + "C°";
		} else {
			result += "F°";
		}
		
		return result;
	}
	
	public double asCelcius() {
		if(this.escala == escala.FAHRENHEIT) {
			return (this.grados - 32) * (0.5555555555555555555555);
		} else {
			return this.grados;
		}
	}
	
	public double asFahrenheit() {
		if(this.escala == escala.CELCIUS) {
			return (this.grados * 1.8) + 32;
		} else {
			return this.grados;
		}
	}
	
	public void aumentar (Temperatura temperatura) {
		if (temperatura.grados > 0) {
			if (this.escala == temperatura.escala) {
				this.grados += temperatura.grados;
			} else {
				if(this.escala == Escala.CELCIUS) {
					this.grados += temperatura.asCelcius();
				} else {
					this.grados += temperatura.asFahrenheit();
				}
			
			}
		}
	}
	
	public void disminuir (Temperatura temperatura) {
		if (temperatura.grados > 0) {
			if (this.escala == temperatura.escala) {
				this.grados -= temperatura.grados;
			} else {
				if(this.escala == Escala.CELCIUS) {
					this.grados -= temperatura.asCelcius();
				} else {
					this.grados -= temperatura.asFahrenheit();
				}
			
			}
		}
	}
}
