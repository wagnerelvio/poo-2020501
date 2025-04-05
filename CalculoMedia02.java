package operadores;

import java.util.Locale;
import java.util.Scanner;


public class CalculoMedia02 {

	

	    public static void main(String[] args) {

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

	        System.out.printf("\nA média das quatro notas é: %.1f\n", media);

	        if (media >= 7.0) {
	            System.out.println("Aluno aprovado!");
	        } else {
	            System.out.println("Aluno em recuperação.");
	        }

	        sc.close();
	    }
	}
