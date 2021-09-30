programa
{
	/*Programa: Programa Sequencial - Exercicio 5
	 *Autor: Felipe Lima
	 *Data: 23/09/2021*/
	funcao inicio() {
		real nota1, nota2, nota3, media
		escreva("Qual é a nota 1? ")
		leia(nota1)
		escreva("Qual é a nota 2? ")
		leia(nota2)
		escreva("Qual é a nota 3? ")
		leia(nota3)
		media = ((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5)
		escreva("A média ponderada é " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 60; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */