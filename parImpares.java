package vetores;

import java.util.Scanner;

public class parImpares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		final int TAM = 20;
		int a[],b[],i,v,f=0,pp=0;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite os valores");
			v = in.nextInt();
			
			if(v%2 ==0){
				a[f] = v;
				f++;
				
			}else {
				b[pp] = v;
				pp++;
			}
		}
		for(i=0;i<f;i++) {
			System.out.println("pares "+ a[i]);
		}
		
		for(i=0;i<pp;i++) {
			System.out.println("Impares "+ b[i]);
		}
		
	}

}
