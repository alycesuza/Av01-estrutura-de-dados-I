package atividades.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		//Recebendo os dados
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra para verificarmos se é um palindromo:");
		String palavra = scan.next();
		String palindromo = "";
		String[] separado = palavra.split("");

		//Verificando se é Palindromo	
		for (int i = palavra.length() - 1; i >= 0; i--) {
			palindromo += separado[i];
		}

		if (palindromo.equals(palavra)) {
			System.out.print("É um palindromo!\n");
		} else {
			System.out.print("Não é um palindromo!\n");

		}

		scan.close();
	}
}
