package br.univille.estd.arranjos;


/**
 * Lista de Exercícios
 * Alterem este arquivo
 */
public class Arranjos {
	
	/**   
	 * Retorne o valor 0
	 * @return
	 */
	public static int exercicio00() {
		return 0;
	}
	
	/**
	 * Crie um arranjo de inteiros de 3 posicoes, com valores zeros
	 * e retorne por parametro
	 * @return
	 */
	public static int[] exercicio01() {
		int vetor[] = new int [3];
		return vetor ;
	}
	
	private static void vetor(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Crie um arranjo de Strings de 3 posicoes com os valores "aa","bb" e "cc"
	 * e retorne por parametro
	 */
	public static String[] exercicio02() {
		String vetor [] = {"aa","bb","cc"};
		return vetor;
	}
	
	/**
	 * Retorne o tamanho do vetor
	 */
	
	
	public static int exercicio03(int[] vetor) {
		return vetor.length;
	}
	
	
	
	/**
	 * Retorne o elemento da posicao 4
	 */
	
	
	public static int exercicio04(int[] vetor) {
		return vetor[4];

	}
	
	/**
	 * Modifique todas as posicoes do vetor para o valor -1
	 * Retorne o vetor modificado
	 */
	
	
	public static int[] exercicio05(int[] vetor) {
		for (int i =0; i < vetor.length;i++) {
			vetor [i]= -1;
			
		}
		return vetor;
	}
		
	
	
	/**
	 * Some os valores contidos no arranjo e retorne o total
	 */
	
	
	public static int exercicio06(int[] vetor) {
		int total  = 0;
		for (int i : vetor) {
			total += i;
			
		}
		return total;
	}
	
	
	
	/**
	 * Conte os numeros impares contidos no arranjo e retorne o total
	 */
	
	
	public static int exercicio07(int[] vetor) {
		int total  = 0;
		for (int i : vetor) {
			if(i%2 == 1) {
				total +=1;
			}
	
		}
			
		return total;
	}
	
	
	
	/**
	 * Copie os valores do vetor A para o Vetor B. Retorne o vetor modificado B
	 * Os vetores A e B sempre terao o mesmo tamanho
	 */



	public static int[] exercicio08(int[] vetorA, int[] vetorB) {
		for (int i =0; i < vetorA.length;i++) {
			vetorB[i]  = vetorA[i];
			
		}
		return vetorB;
	}
	
	
	
	
	/**
	 * Retorne um vetor com os elementos na ordem inversa do vetor recebido por parametro
	 * Exemplo: Vetor recebido  3, 5, 6
	 * Retorno: Vetor retornado 6, 5, 3
	 */
	
	
	
	public static int[] exercicio09(int[] vetor) {
		for (int i =0, j = vetor.length-1; i < vetor.length /2; i++, j--) {
			int aux =vetor [i];
			vetor[i] = vetor [j];
			vetor [j] =aux ;
		}
		return vetor ;
	}
	
	
	
	
	
	/**
	 * Pesquise no vetor recebido por parametro, a posicao do elemento recebido por parametro.
	 * Retorne a posicao.
	 * Exemplo: Vetor recebido  3, 5, 6
	 *          Elemento 5
	 * Retorno: A posicao do elemento 5 é 1
	 * Se o elemento nao existir no vetor retorne -1
	 */
	
	
	
	
	
	public static int exercicio10(int[] vetor, int elemento) {
		int posicao = -1;
		for(int i= 0; i< vetor.length; i++) {
			if (vetor [i] == elemento) {
				posicao = i ;
				break;
				
			}
			
		
			
		}
		return posicao; 
	}

}
