package vetores;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],b[],i;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+"o valor para o vetor A: ");
			a[i]=in.nextInt();
		}
		
		for(i=0; i <TAM; i++) {
			if(a[i]%2==0) {
				b[i]=1;
			}else {
				b[i]=0;
			}
		}
		
		System.out.println("Vetor B: ");
		for(i=0; i<TAM; i++) {
			System.out.println(b[i]);
		}

	}

}
