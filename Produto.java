import java.util.Scanner;

public class Produto {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		float preco, precoVenda, margemLucro;
		char resposta;
		int i;

		do {
			System.out.println("Digite o preço do produto:");
			preco = in.nextFloat();

			System.out.println("Digite a margem de lucro:");
			margemLucro = in.nextFloat();

			precoVenda = preco + preco / 100 * margemLucro;

			System.out.println("O valor do preço de venda é: " + (precoVenda) + "");

			System.out.println("Deseja continuar a execução? (S/N)");
			resposta = in.next().charAt(0);

		} while (resposta == 's' || resposta == 'S');
	}
}
