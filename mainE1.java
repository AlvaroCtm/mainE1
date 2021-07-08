package numero;

import java.util.Scanner;

public class mainE1 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("ingrese su Sueldo:... ");
		int A = numero.nextInt();
		int B = numero.nextInt();
		
		
		if(A<300) {
			System.out.println("Su bonificacion + 40 ");
			
		}else {
			System.out.println("Su bonificacion + 0 ");
		}
			
	

	}

}
