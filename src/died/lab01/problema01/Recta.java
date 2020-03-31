package died.lab01.problema01;

public class Recta {
	
	public punto p1;
	public punto p2;
	public boolean identidad;

	public Recta() {
		// TODO Auto-generated constructor stub
		this.identidad = true;
	}
	
	public Recta(punto p1, punto p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.identidad = false;
	}
	
	public float pendiente() {
		if (this.identidad) {
			return 1.0f;
		} else {
			float x1 = this.p1.getX();
			float x2 = this.p2.getX();
			float y1 = this.p1.getY();
			float y2 = this.p2.getY();
		
		
			float m = (y2 - y1)/(x2 - x1);
		
			return m;
		}
	}
	
	public boolean paralelas (Recta otraRecta) {
		float pend1 = this.pendiente();
		float pend2 = otraRecta.pendiente();
		
		if (pend1 == pend2) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals (Object otraRecta) {
		if (otraRecta instanceof Recta) {
			Recta aux = new Recta(this.p1, ((Recta) otraRecta).p2);
			if ((this.pendiente() == aux.pendiente()) && (((Recta) otraRecta).pendiente() == aux.pendiente())) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}
	
	

}
