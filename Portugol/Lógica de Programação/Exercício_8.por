/*Programa: Laço condicional lógica - Exercicio 8
 *Autor: Felipe Lima
 *Data: 24/09/2021*/
programa{
	
	funcao inicio(){
	inteiro N
	escreva("Qual o valor da variavel? ")
	leia(N)
	se (N > 100) {
		escreva("O valor da variável é " + N + ".")
	}
	senao se (N < 100) {
		N = 0
		escreva("O valor da variável é " + N + ".")
	}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */