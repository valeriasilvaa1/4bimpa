package vetores;

import java.util.Scanner;

public class somatorio {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int TAM=2;
		int a[], i, b[],j;
		a= new int [TAM];
		b= new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite um número: ");
			a[i]= leia.nextInt();
			
		}
		
		for(i=0; i<TAM; i++) {
			b[i]=0;
			
			for(j=1; j<TAM; j++) {
				b[i]=b[i]+a[j];
			}
		}
		for(i=0; i<TAM; i++) {
			System.out.println("B[ "+ i + "] ="+ b[i]);
			
		}
		
		

	}

}
