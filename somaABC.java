package vetores;
import java.util.Scanner;
public class somaABC {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int TAM=10;
		int a[],b[],c[],i;
		a= new int [TAM];
		b= new int [TAM];
		c= new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor de A");
			a[i] = leia.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor de B");
			b[i] = leia.nextInt();
			
			c[i] = a[i] + b[i];
		}
		
		System.out.print("\nA = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}	
		System.out.print(" ]");
		
		System.out.print("\nB = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.print(" ]");
			
		System.out.print("\nC = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print(" ]");	
		
		leia.close();
	}

}
