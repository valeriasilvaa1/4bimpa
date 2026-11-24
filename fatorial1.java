package vetores;

import java.util.Scanner;

public class fatorial1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int TAM=10;
		int a[], i, n, b[],m;
		a= new int [TAM];
		b= new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o número: ");
			a[i]=leia.nextInt();
			
		}
		for(i=0; i<TAM;i++) {
			n=1;
			for(m=1;m<=a[i]; m++) {
				n = m*n;
			}
			b[i]=n;
		}
		for(i=0; i<TAM; i++) {
			System.out.println("fatorial de "+a[i]+ " = "+ b[i]);
		}

	}

}


