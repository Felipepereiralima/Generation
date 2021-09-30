/*Programa: Laço condicional lógica - Exercicio 7
 *Autor: Felipe Lima
 *Data: 24/09/2021*/
programa{
	
	funcao inicio(){
		inteiro a, b, area
		escreva("Informe a altura: ")
		leia(a)
		escreva("Informe a base: ")
		leia(b)
		se (a > 0 e b > 0){
			area = (b * a) / 2
			escreva("A área do triângulo é: " + area)	
		}
		senao {
			escreva("Medida inválida.")
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