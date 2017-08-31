package aula;

import javax.swing.JOptionPane;

public class Principal {
	static Sequencia sequencia;

	public static void main(String[] args) {
		String menu;
		do {
			menu = JOptionPane.showInputDialog(
					"1 - Criar sequência\n" +
					"2 - Adicionar valor\n" +
					"3 - Imprimir"
			);
			if (menu != null) {
				switch (menu) {
					case "1": {
						criar();
						break;
					}
					case "2": {
						add();
						break;
					}
					case "3": {
						imprimir();
						break;
					}
				}
			}
		} while (menu != null);
	}

	public static void criar() {
		/* pedir para o usuário fornecer a quantidade de elementos da sequência */
		String men;
		men = JOptionPane.showInputDialog("Quantidade de elementos ");
		/* checar se o usuário não clicou no botão Cancelar da janela */
		if(men != null){
		    /* verifica se já existe uma sequência, neste caso deverá ser chamado o método resize*/
		    if (sequencia !=null){
		        sequencia.resize(Integer.parseInt(men));
            }else{
		    /* caso a sequência não existe, então será necessário criar um objeto do tipo Sequencia */
		        sequencia = new Sequencia(Integer.parseInt(men));
            }
        }

	}

	public static void add() {


		if(sequencia!=null){
		    /* se o objeto sequencia existir, então deverá pedir para o usuário fornecer o número a ser adicionado */
		    String men = JOptionPane.showInputDialog("DIGITE O NUMERO A SER ADICIONADO");
        }else{
		    /* se o objeto sequencia não existir, então deverá exibir uma mensagem para o  usuário */
            JOptionPane.showMessageDialog(null,"Primeiro é necessário criar	a sequência usando a opção 1");
        }

	}

	public static void imprimir() {

		if (sequencia != null) {
			sequencia.imprimir();
		}else{
		    /* se o objeto sequencia não existir, então deverá exibir uma mensagem para o usuário */
			JOptionPane.showMessageDialog(null,"Primeiro é necessário criar	a sequência usando a opção 1");
		}
	}
}
