package vetores;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=5;
		int a[],b,i,j;
		a = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("adicione o "+i+" valor");
			a[i] = in.nextInt();
			
			for(j=1;j<=10;j++) {
				b = a[i]*j;
				System.out.println(a[i]+" X "+j+" = "+b);
			}
		}

	}

}
