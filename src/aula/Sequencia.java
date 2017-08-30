package aula;

public class Sequencia {
	int lista[];
	int posicao;
	Sequencia(int quant){
		if (quant<5){
			lista = new int[5];
		}else{
			lista = new int[quant];
		}
		posicao = 0;
	}

	public boolean add(int nro){
		if(posicao >= lista.length){
			return false;
		}else{
			lista[posicao] = nro;
			posicao++;
			return true;
		}

	}

	public void resize(int quant){
		if (quant<5){
			quant =5;
		}
		int aux[] = new int[quant];
		for (int i = 0; i < lista.length; i++) {
			aux[i] = lista[i];
		}
		lista = aux;
	}
	public void imprimir(){
		for (int i = 0; i < lista.length; i++) {
			System.out.print("\nindice: "+i+"Valor:"+this.lista[i]);
		}
	}
}
