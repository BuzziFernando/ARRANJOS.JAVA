package br.univille.estd.arranjos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * NAO ALTEREM ESTE ARQUIVO
 *
 */
class TestesArranjos {
	
	@Test
	void exercicio00() {
		int a = Arranjos.exercicio00();
		assertEquals(0, a,"Deve retornar Zero");
	}

	@Test
	void exercicio01() {
		int a[] = Arranjos.exercicio01();
		int b[] = {0,0,0};
		assertArrayEquals(b,a,"Arranjo deve ser {0,0,0}");
	}
	
	@Test
	void exercicio02() {
		String a[] = Arranjos.exercicio02();
		assertNotNull(a, "Arranjo nao pode ser nulo");
		assertEquals("aa",a,"A primeira posicao do arranjo deve conter o valor \"aa\"");
		assertEquals("bb",a,"A segunda posicao do arranjo deve conter o valor \"bb\"");
		assertEquals("cc",a,"A terceira posicao do arranjo deve conter o valor \"cc\"");
	}
	
	@Test
	void exercicio03() {
		int x[] = new int[15]; 
		int a = Arranjos.exercicio03(x);
		assertEquals(x.length, a,"O tamanho do vetor deve ser "+x.length);
		x = new int[1]; 
		a = Arranjos.exercicio03(x);
		assertEquals(x.length, a,"O tamanho do vetor deve ser "+x.length);
		
	}
	
	@Test
	void exercicio04() {
		int x[] = new int[15]; 
		x[4] = 89;
		int a = Arranjos.exercicio04(x);
		assertEquals(x[4], a,"O elemento da posicao 4 deve ser "+x[4]);
		x[4] = -9;
		a = Arranjos.exercicio04(x);
		assertEquals(x[4], a,"O elemento da posicao 4 deve deve ser "+x[4]);
	}
	
	@Test
	void exercicio05() {
		int x[] = new int[10];
		int y[] = Arranjos.exercicio05(x);
		assertEquals(x.length,y.length,"Arranjo retornado com tamanho diferente");
		for(int z : y) {
			assertEquals(-1,z,"Arranjo deve ser todos os elementos -1");	
		}
		x = new int[8];
		y = Arranjos.exercicio05(x);
		assertEquals(x.length,y.length,"Arranjo retornado com tamanho diferente");
		for(int z : y) {
			assertEquals(-1,z,"Arranjo deve ser todos os elementos -1");	
		}
	}
	
	@Test
	void exercicio06() {
		int x[] = {1,1,1,1,1};
		int total = Arranjos.exercicio06(x);
		assertEquals(5,total,"O total esta incorreto");
		int z[] = {0,1,2,2,-1};
		total = Arranjos.exercicio06(x);
		assertEquals(4,total,"O total esta incorreto");
		int y[] = {-1,-1,-1,-1};
		total = Arranjos.exercicio06(x);
		assertEquals(-4,total,"O total esta incorreto");
	}
	
	@Test
	void exercicio07() {
		int x[] = {1,1,1,1,1};
		int total = Arranjos.exercicio06(x);
		assertEquals(5,total,"O total esta incorreto");
		int z[] = {0,1,2,2,1};
		total = Arranjos.exercicio06(x);
		assertEquals(2,total,"O total esta incorreto");
		int y[] = {0,4,6,8};
		total = Arranjos.exercicio06(x);
		assertEquals(0,total,"O total esta incorreto");
	}
	
	@Test
	void exercicio08() {
		int x[] = {0,1,2,3,4};
		int y[] = new int[5];
		int z[] = Arranjos.exercicio08(x, y);
		assertNotEquals(x, z, "Nao pode retornar o vetor A");
	}
	
	@Test
	void exercicio09() {
		int x[] = {0,1,2,3,4};
		int y[] = {4, 3, 2, 1, 0};
		int z[] = Arranjos.exercicio09(x);
		assertArrayEquals(y, z, "Deve retornar o vetor com valores invertidos");
	}
	
	@Test
	void exercicio10() {
		int x[] = {0,1,9,3,4};
		int posicao = Arranjos.exercicio10(x, 9);
		assertEquals(2,posicao,"Posicao retornada esta incorreta");
		posicao = Arranjos.exercicio10(x, 3);
		assertEquals(3,posicao,"Posicao retornada esta incorreta");
		posicao = Arranjos.exercicio10(x, -3);
		assertEquals(-1,posicao,"Posicao retornada esta incorreta");
	}

}
