package vetores;

import java.util.Scanner;

public class numPrimo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],i, n, divisores=0;
		a = new int [TAM];

		for(i=0; i<TAM; i++) {
			System.out.println("Digite o número: ");
			a[i]=in.nextInt();
		}
		
		for(i=0; i<TAM;i++) {
			divisores = 0;
			for(n=1; n<=a[i]; n++) {
				if(a[i]% n==0) {
					divisores++;
				}
			}
			if(a[i]>1 && divisores==2) {
				System.out.println(a[i]+"é primo");
			}else {
				System.out.println(a[i]+"Não é primo");
			}
		}
	}

}
