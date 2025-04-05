package operadores;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author wagne
 * @since 17/04/2022
 *
 */
public class TarefaCalculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, nota4, media;

		System.out.printf("Digite a nota 1, com uma casa decimal :  ");
		nota1 = sc.nextDouble();

		System.out.printf("Digite a nota 2, com uma casa decimal :  ");
		nota2 = sc.nextDouble();

		System.out.printf("Digite a nota 3, com uma casa decimal :  ");
		nota3 = sc.nextDouble();

		System.out.printf("Digite a nota 4, com uma casa decimal :  ");
		nota4 = sc.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("\n A m�dia das quatro notas � igual a : %.1f\n", media);

	}

}
