programa
{
	/*Programa: Programa Sequencial - Exercicio 7
	 *Autor: Felipe Lima
	 *Data: 23/09/2021*/
	funcao inicio(){
		inteiro a, b, c, d, f, g, x, y
		escreva("Digite o valor de a: ")
		leia(a)

		escreva("Digite o valor de b: ")
		leia(b)

		escreva("Digite o valor de c: ")
		leia(c)

		escreva("Digite o valor de d: ")
		leia(d)

		escreva("Digite o valor de f: ")
		leia(f)

		escreva("Digite o valor de g: ")
		leia(g)

		x = ((c*g) - (b*f)) / ((a*g)- (b*d))
		y = ((a*f) - (c*d)) / ((a*g) - (b*d))

		escreva("O valor de x = " + x)
		escreva("O valor de y = " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */