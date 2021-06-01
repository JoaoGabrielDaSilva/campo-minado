package br.com.joao.cm;

import br.com.joao.cm.modelo.Tabuleiro;
import br.com.joao.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		
		new TabuleiroConsole(tabuleiro);
				
	}
}
