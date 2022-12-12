package atividades.exercicio02;

import java.util.Scanner;
import atividades.exercicio02.Verificador;

public class Main {

	public static void main(String[] args) {

		System.out.println("Digite a formula matematica: "); // Interação de leitura da formula inserida no console
		Scanner s1 = new Scanner(System.in); // scanner que filtra "(){}[]"
		String formula = s1.nextLine(); // nextLine para continuar a verificar
		System.out.println("Entrada: " + formula); // formatação de console
		Verificador entrada = new Verificador(formula); // chamando a classe e atribuindo formula a ela

		//chamar o método Verificador
		if (entrada.validarFormacao()) {
			System.out.println("Válido!");
		} else {
			System.out.println("Inválido!");

		}
	}

}
