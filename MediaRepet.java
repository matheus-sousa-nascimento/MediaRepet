/*
 * MediaRepet.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class MediaRepet {
	
	public static void main (String[] args) {
		//Matheus de sousa do nascimento
		Scanner entrada = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		
		double n1, n2, media;
		boolean rept =true;
		do{
			
				do{
					System.out.print("Digite a primeira nota: ");
					n1 = entrada.nextDouble();
				}while((n1 < 0) || (n1 >10));
				
				do{
					System.out.print("Digite a segunda nota: ");
					n2 = entrada.nextDouble();
				}while((n2 < 0) || (n2 >10));
				
				media = (n1+ n2)/2;
				System.out.println("A sua media e "+ media);
				
				System.out.println("NOVO CALCULO(S/N): ");
				rept = teclado.nextLine().equalsIgnoreCase("S");
				
				
			
		}while(rept);
	}
}

