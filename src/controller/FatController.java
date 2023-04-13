package controller;

import br.com.serialexperimentscarina.pilhaint.PilhaInt;

public class FatController {
	
	PilhaInt pilha = new PilhaInt();

	// Usando a pilha como suporte, calcule o fatorial do valor de entrada
	public long fatorial(int valor) {
		long fat = 1;
		
		while (valor > 1) {
			pilha.push(valor);
			valor--;
		}
		
		while (!pilha.isEmpty()) {
			try {
				fat *= pilha.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return fat;
	}

}
