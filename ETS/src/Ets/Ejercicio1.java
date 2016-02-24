package Ets;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("radio: ");
		int radio = teclado.nextInt();
		
		double area = Math.PI * radio * radio;
		
		double peri = 2 * Math.PI * radio ;
		System.out.println("area " + area);
		System.out.println("perimetro " + peri);
		
		teclado.close();

	}

}
