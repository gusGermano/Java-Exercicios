import java.util.Scanner;

public class vetores {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a[], b[], c[], i;

		a = new int[3];
		b = new int[3];
		c = new int[3];

		for (i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero:");
			a[i] = in.nextInt();
		}

		for (i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero:");
			b[i] = in.nextInt();
		}
		for (i = 0; i < 3; i++) {
			c[i] = a[i] + b[i];
		}

		System.out.println("\nVetor C:");
		for (i = 0; i < 3; i++) {
			System.out.print("\n[" + c[i] + "]");
		}
	}
}