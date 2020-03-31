package died.lab01.problema01;

public class punto {
	public float x;
	
	public float y;

	public punto(float x, float y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public void setX(float nuevoValor) {
		this.x = nuevoValor;
	}
	
	public void setY(float nuevoValor) {
		this.y = nuevoValor;
	}
	
	public boolean equals(Object otroPunto) {
		if (otroPunto instanceof punto) {
			if ((this.x == ((punto) otroPunto).getX()) && (this.y == ((punto) otroPunto).getY())) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}

}
