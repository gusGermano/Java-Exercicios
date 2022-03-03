import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		double horaAula, numAulas, salario;

		System.out.println("Digite o valor da hora-aula em minutos: ");
		horaAula = in.nextDouble();

		System.out.println("Digite o número de aulas dadas: ");
		numAulas = in.nextDouble();

		salario = numAulas * horaAula;

		if (salario < 1212.01) {

			salario = salario * 0.075;
			System.out.println("\nO salario líquido com desconto INSS (7.5%) " + "= " + salario);

		} else if (salario <= 2427.35 && salario > 1212.01) {

			salario = salario * 0.09;
			System.out.println("\nO salario líquido com desconto INSS (9%) " + "= " + salario);

		} else if (salario <= 3641.01 && salario > 2427.35) {

			salario = salario * 0.12;
			System.out.println("\nO salario líquido com desconto INSS (12%) " + "= " + salario);

		} else if (salario <= 7067.22 && salario > 3641.01) {

			salario = salario * 0.14;
			System.out.println("\nO salario líquido com desconto INSS (14%) " + "= " + salario);

		} else if (salario <= 12136.80 && salario > 7067.22) {

			salario = salario * 0.145;
			System.out.println("\nO salario líquido com desconto INSS (14.5%) " + "= " + salario);

		} else if (salario <= 24273.58 && salario > 12136.80) {

			salario = salario * 0.165;
			System.out.println("\nO salario líquido com desconto INSS (16.5%) " + "= " + salario);

		} else if (salario <= 47333.46 && salario > 24273.58) {

			salario = salario * 0.19;
			System.out.println("\nO salario líquido com desconto INSS (19%) " + "= " + salario);

		} else if (salario > 47333.46) {

			salario = salario * 0.22;
			System.out.println("\nO salario líquido com desconto INSS (22%) " + "= " + salario);

		}

	}
}
