/*Programa: Laço de repetição - Exercicio 2 Faça Enquanto
 *Autor: Felipe Lima
 *Data: 27/09/2021*/

programa {
	
	funcao inicio() {
		inteiro numero, soma = 0
		escreva("Digite um número: ")
		leia(numero)
		faca{
			soma = soma + numero
			numero = numero -1
		} enquanto(numero > 0)
			escreva(soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 99; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */