package vetores;

import java.util.Scanner;

public class busca {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[],i, n, cont=0;
		a = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Digite os números: ");
			a[i]=in.nextInt();
		}
		System.out.println("Qual número você procura?: ");
		n=in.nextInt();
		
		for(i=0; i<TAM;i++) {
			if(n==a[i]) {
				cont++;
			}
		}
		if(cont>0) {
			System.out.println("Tem o número "+n);
		}else {
			System.out.println("Não tem o número digitado");
		}

	}

}
