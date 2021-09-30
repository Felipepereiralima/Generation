/*Programa: Laço condicional lógica - Exercicio 5
 *Autor: Felipe Lima
 *Data: 24/09/2021*/
programa {
	
	funcao inicio() {
		real indice
		escreva("Qual índice de poluição? ")
		leia(indice)
		se (indice <= 0.25 e indice >= 0.05) {
			escreva("Índice aceitável.")
		}
		senao se (indice >= 0.3 e indice <= 0.39) {
			escreva("Indústrias do primeiro grupo param.")
		}
		senao se (indice >= 0.4 e indice <= 0.49) {
			escreva("Indústrias do primeiro e segundo grupo param.")
		}
		senao se (indice >= 0.5) {
			escreva("Todas as indústrias devem param.") 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */