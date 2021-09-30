/*Programa: Laço condicional lógica - Exercicio 4
 *Autor: Felipe Lima
 *Data: 24/09/2021*/
programa {
	
	funcao inicio() {
		inteiro numero, resultado
		escreva("Digite um número: ")
		leia(numero)
		resultado = numero % 2
		se (resultado == 0 e numero > 0) {
			escreva("O número ", numero, " é par e positivo.")
		}
		senao se (resultado != 0 e numero > 0){
			escreva("O número ", numero, " é impar e positivo.")
		}
		senao se (resultado == 0 e numero < 0) {
			escreva("O número ", numero, " é par e negativo.")
		}
		senao se (resultado != 0 e numero < 0) {
			escreva("O número ", numero, " é impar e negativo.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */