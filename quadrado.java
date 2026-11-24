package vetores;

import java.util.Scanner;

public class quadrado {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i;
		a= new int[TAM];
		b= new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+" valor de A: ");
			a[i]=leia.nextInt();
			
			b[i]=a[i]*a[i];
		}
		
		System.out.print("A[] = [");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ]");
		
		System.out.print("B[] = [");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print(" ]");
	}
}
