package vetores;

import java.util.Scanner;

public class pares {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],i, n;
		a = new int [TAM];

		for(i=0; i<TAM; i++) {
			System.out.println("Digite um número: ");
			a[i]=in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("\nNúmero: "+a[i]);
			System.out.println("Pares de 0 até "+a[i]);

			
			for(n=0; n<=a[i];n++) {
				if(n%2==0) {
					System.out.println(n);
				}
			}
		}
	}

}
