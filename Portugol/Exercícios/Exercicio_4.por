programa {
	/*Programa: Programa Sequencial - Exercicio 4
	 *Autor: Felipe Lima
	 *Data: 23/09/2021*/
	inclua biblioteca Matematica --> mat
	funcao inicio() {
		real A, B, C, D, R, S
		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Digite o valor de B: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)
		R = mat.potencia((A + B), 2)
		escreva("\nO resultado da expressão R é ",R)
		S = mat.potencia((B + C), 2)
		escreva("\nO resultado da expressão S é ", S)
		D = (R + S)/2
		escreva("\nO resultado da expressão D é ", D)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 545; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */