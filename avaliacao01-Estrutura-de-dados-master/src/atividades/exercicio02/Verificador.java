package atividades.exercicio02;

import java.util.Stack;

public class Verificador {

	private String formula;

	public Verificador(String formula) {
		this.formula = formula;
	}

	public boolean validarFormacao() {
		Stack analise = new Stack();

		for (int i = 0; i < this.formula.length(); i++) {
			if (this.formula.charAt(i) == '{' || this.formula.charAt(i) == '[' || this.formula.charAt(i) == '(') {
				analise.push(this.formula.charAt(i));
			} else if (this.formula.charAt(i) == ')' || this.formula.charAt(i) == ']'
					|| this.formula.charAt(i) == '}') {
				if (analise.isEmpty()) {
					return false;

				} else if (this.formula.charAt(i) == ')' && analise.peek().equals('(')) {
					analise.pop();

					continue;
				} else if (this.formula.charAt(i) == ']' && analise.peek().equals('[')) {
					analise.pop();

					continue;
				} else if (this.formula.charAt(i) == '}' && analise.peek().equals('{')) {
					analise.pop();

					continue;
				}
				return false;
			}
		}
		if (analise.isEmpty())
			return true;
		return false;
	}

	public String getExpressao() {
		return formula;
	}
}
