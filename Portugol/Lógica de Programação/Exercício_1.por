
/*Programa: Laço condicional lógica - Exercicio 1
 *Autor: Felipe Lima
 *Data: 24/09/2021*/

programa
{
	
	funcao inicio(){
	real peso, multa, excesso
	escreva("Quantos quilos de tomate você comprou? ")
	leia(peso)
	multa = (peso - 50) * 4.00
	excesso = (peso - 50)
	se (peso > 50) {
		escreva("Você comprou " + excesso + " Kg de tomate a mais e a multa é de R$ " + multa)
	}
	senao {
		multa = 0
		excesso = 0
		escreva("Você comprou " + peso + "Kg de tomate, e de excesso foi " + excesso + ", e a multa é de R$ " + multa)	 
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */