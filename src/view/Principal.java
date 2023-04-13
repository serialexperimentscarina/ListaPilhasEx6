package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		FatController fat = new FatController();
		String input;
		int valor = 0;
		
		// Peça ao usuário um valor inteiro de 0 a 10 (Caso o usuário digite um valor fora
		// desses limites, pedir novamente, até que o valor atenda à solicitação)
		do {
			input = JOptionPane.showInputDialog("Digite um valor entre 0 e 10: ");
			if (input != null) {
				try {
					valor = Integer.parseInt(input);
				} catch (NumberFormatException e) {
					valor = 11;
				} finally {
					if (valor < 0 || valor > 10) {
						JOptionPane.showMessageDialog(null, "Entrada inválida, tente novamente.");
					} else {
						// Exibe em console o valor do fatorial
						JOptionPane.showMessageDialog(null, "Fatorial de " + valor + ": " + fat.fatorial(valor));
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "Encerrando.");
				break;
			}
		} while (valor < 0 || valor > 10);
		
	}

}
