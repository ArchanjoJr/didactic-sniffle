package aula;

import javax.swing.JOptionPane;

public class Principal {
	static Sequencia sequencia;

	public static void main(String[] args) {
		String menu;
		do {
			menu = JOptionPane.showInputDialog("1 - Criar sequência\n" + "2 - Adicionar valor\n" + "3 - Imprimir");
			if (menu != null) {
				switch (menu) {
				case "1":
					criar();
					break;
				case "2":
					add();
					break;
				case "3":
					imprimir();
					break;
				}
			}
		} while (menu != null);
	}

	public static void criar() {
		/* pedir para o usuário fornecer a quantidade de elementos da sequência */
		/* checar se o usuário não clicou no botão Cancelar da janela */
		/*
		 * verifica se já existe uma sequência, neste caso deverá ser chamado o método
		 * resize
		 */
		/*
		 * caso a sequência não existe, então será necessário criar um objeto do tipo
		 * Sequencia
		 */
	}

	public static void add() {
		/*
		 * se o objeto sequencia não existir, então deverá exibir uma mensagem para o
		 * usuário
		 */
		/*
		 * se o objeto sequencia existir, então deverá pedir para o usuário fornecer o
		 * número a ser adicionado
		 */
	}

public static void imprimir(){
/* se o objeto sequencia não existir, então deverá exibir uma mensagem para o usuário */
}
