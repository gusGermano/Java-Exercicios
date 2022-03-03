import java.util.Scanner;

public class Salario2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int numAulas;
		float desconto, horaAula, salario;

		System.out.println("Digite o valor da hora-aula em minutos: ");
		horaAula = in.nextFloat();

		System.out.println("Digite o número de aulas dadas: ");
		numAulas = in.nextInt();

		System.out.println("Digite o percentual de desconto do INSS");
		desconto = in.nextFloat();

		salario = numAulas * horaAula;
		salario = salario - (salario / 100 * desconto);

		System.out.println("salario liquido é RS" + (salario) + "");
	}
}
