import java.util.Scanner;

public class inverterAlgarismos {
	public static void main(String[] args) {

		int n, invertido = 0, resto;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número:");

		n = in.nextInt();

		while (n > 0) {
			resto = n % 10;
			invertido = invertido * 10 + resto;
			n = n / 10;
		}

		System.out.println("\nNúmero invertido: " + invertido);
	}
}