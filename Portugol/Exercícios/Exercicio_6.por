programa
{
	/*Programa: Programa Sequencial - Exercicio 6
	 *Autor: Felipe Lima
	 *Data: 23/09/2021*/
	inclua biblioteca Matematica --> mat
	funcao inicio(){
		real x1, y1, x2, y2, p1, p2, distancia, raiz
		escreva("Qual é o x1? ")
		leia(x1)
		escreva("Qual é o y1? ")
		leia(y1)
		escreva("Qual é o x2? ")
		leia(x2)
		escreva("Qual é o y2? ")
		leia(y2)
		escreva("P1(",x1," , ",y1,")")
		escreva("\nP2(",x2," , ",y2,")\n")
		distancia = mat.potencia((x2 - x1), 2) + mat.potencia((y2 - y1), 2)
		raiz = mat.raiz(distancia, 2)
		escreva("A distância entre os dois pontos é ", raiz)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 597; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */