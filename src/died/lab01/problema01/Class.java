package died.lab01.problema01;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		punto p1 = new punto(1.0f,1.0f);
		punto p2 = new punto(2.0f,2.0f);
		
		Recta r1 = new Recta(p1, p2);
		
		System.out.println(r1.pendiente());
		
		punto p3 = new punto(3.0f,3.0f);
		
		Recta r2 = new Recta(p2,p3);
		
		System.out.println(r1.equals(r2));
		
	}

}
