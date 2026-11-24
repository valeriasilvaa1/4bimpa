package vetores;

import java.util.Scanner;

public class potencia {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 11;
		int a[],i,j;
		long resul = 1;
		
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("insira o valor");
			a[i] = in.nextInt();
			
			for(j=0;j<a[i];j++) {
				resul = resul * 2;
			}		
			
			System.out.println("res: "+ resul);
			resul = 1;
		}
			
			
	}
		
}


