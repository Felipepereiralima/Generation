/*Programa: Laço de repetição - Exercicio 1 Enquanto
 *Autor: Felipe Lima
 *Data: 27/09/2021*/
programa {
	
	funcao inicio() {
		inteiro numero = 1, soma = 0, contador = 0, media = 0
		enquanto (numero > 0){
			escreva("Digite um número: ")
			leia(numero)
			soma+= numero
			contador = contador + 1
			se (numero < 0) {
				soma = soma - numero
				contador = contador - 1
				media = soma / contador
			}
		}
		escreva("A soma total é de ", soma)
		escreva("\nA média é de ", media)
		escreva("\nO total de valores lidos é de ", contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 52; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */