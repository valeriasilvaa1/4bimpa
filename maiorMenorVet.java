package vetores;

import java.util.Scanner;

public class maiorMenorVet {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[], b[], c[],i;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0;i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+"o valor para o vetor A: ");
			a[i]=in.nextInt();
		}
		
		for(i=0;i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+"o valor para o vetor B: ");
			b[i]=in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			if(a[i]>b[i]) {
				c[i]=1;
			}else if(a[i]==b[i]) {
				c[i]=0;
			}else {
				c[i]=-1;
			}
		}
		
		System.out.println("Vetor B: ");
		for(i=0; i<TAM; i++) {
			System.out.println(c[i]);
		}

	}

}
