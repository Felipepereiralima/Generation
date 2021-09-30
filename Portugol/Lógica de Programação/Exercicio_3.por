/*Programa: Laço condicional lógica - Exercicio 3
 *Autor: Felipe Lima
 *Data: 24/09/2021*/
programa{
	inclua biblioteca Matematica --> mat
	funcao inicio(){
		inteiro numero1, numero2, numero3, numero4, quadrado1, quadrado2, quadrado3, quadrado4 
		escreva("Qual é o primeiro número? ")
		leia(numero1)
		escreva("Qual é o segundo número? ")
		leia(numero2)
		escreva("Qual é o terceiro número? ")
		leia(numero3)
		escreva("Qual é o quarto número? ")
		leia(numero4)
		quadrado1 = mat.potencia(numero1, 2)
		quadrado2 = mat.potencia(numero2, 2)
		quadrado3 = mat.potencia(numero3, 2)
		quadrado4 = mat.potencia(numero4, 2)
		limpa()
		se (quadrado3 >= 1000) {
			escreva("O quadrado do número 3 é: ", quadrado3)
		}
		senao {
			escreva("O quadrado do primeiro número é: ", quadrado1)
			escreva("\nO quadrado do segundo número é: ", quadrado2)
			escreva("\nO quadrado do terceiro número é: ", quadrado3)
			escreva("\nO quadrado do quarto número é: ", quadrado4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */