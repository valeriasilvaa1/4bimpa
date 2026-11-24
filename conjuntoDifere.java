package vetores;

import java.util.Scanner;

public class conjuntoDifere {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int a[], b[], c[], i, n=0, j, con=0;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite os números de A: ");
			a[i]=in.nextInt();
		}
		
		for(j=0; j<TAM; j++) {
			System.out.println("Digite os números de B: ");
			b[j]=in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			con=0;
			for(j=0; j<TAM; j++) {
				if(a[i]==b[j]) {
					con++;
				}
			}
			if(con==0) {
				c[n]=a[i];
				n++;
				
			}
			for(i=0; i<n; i++) {
				System.out.println("C["+i+ "] ="+ c[i]);
			}
		}
	}

}
