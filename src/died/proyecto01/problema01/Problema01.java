/**
 * 
 */
package died.proyecto01.problema01;

import java.util.Random;

/**
 * @author Usuario
 *
 */
public class Problema01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] nrosApostados = {4,35,-1}; //new byte[3];
		float[] montoApostado = {3.5f,6.0f,0.0f};
		
		Random r = new Random();
		int nroSorteado = r.nextInt(37);
		
		//si apuesto un nro y gano cobro 36
		//si apuesto dos nros y gano cobro 18
		//si apuesto tres nros y gano cobro 12
		//si sale 0, pierdo
		
		int cuantoAposto = 0;
		
		for (int i = 0; i < montoApostado.length; i++) {
			if (montoApostado[i]>0) cuantoAposto++;
		}
		
		int acerto = 0;
		
		for (int i=0; i < nrosApostados.length; i++) {
			if(nrosApostados[i] == nroSorteado) {
				break;
			} else {
				acerto++;
			}
			
		}
		
		System.out.println("el nro sorteado fue: " +nroSorteado);
		System.out.println("indice donde se acerto: " +acerto);
		
		float premio = 0.0f;
		
		if(acerto < 3) {
			switch(cuantoAposto) {
				case 1:
					premio = montoApostado[acerto]*36;
					break;
				case 2:
					premio = montoApostado[acerto]*18;
					break;
				case 3:
					premio = montoApostado[acerto]*12;
					break;
			}
		}
		
		if(nroSorteado == 0 || acerto >= 3) {
			System.out.println("La casa gana");
		} else {
			System.out.println("Uté ganó $" +premio);
		}
	}

}
