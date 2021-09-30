programa {
	/*Programa: Programa Sequencial - Exercicio 8
	 *Autor: Felipe Lima
	 *Data: 23/09/2021*/
	funcao inicio(){
		real custoFabrica, custoConsumidor, imposto, taxaDistribuidor
		imposto = 0.45
		taxaDistribuidor = 0.28
		escreva("Qual o custo de fábrica em R$? ")
		leia(custoFabrica)
		custoConsumidor = (custoFabrica + (custoFabrica*taxaDistribuidor) + (custoFabrica*imposto))
		escreva("O custo do consumidor é R$ ", custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */