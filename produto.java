import java.util.Scanner;

public class produto {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		float preco, precoVenda, margemLucro;
		char resposta;
		int i;

		do {
			System.out.println("Digite o pre�o do produto:");
			preco = in.nextFloat();

			System.out.println("Digite a margem de lucro:");
			margemLucro = in.nextFloat();

			precoVenda = preco + preco / 100 * margemLucro;

			System.out.println("O valor do pre�o de venda �: " + (precoVenda) + "");

			System.out.println("Deseja continuar a execu��o? (S/N)");
			resposta = in.next().charAt(0);

		} while (resposta == 's' || resposta == 'S');
	}
}
