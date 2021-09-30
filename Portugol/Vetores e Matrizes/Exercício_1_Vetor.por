/*Programa: Vetores e Matrizes - Exercicio 1
 *Autor: Felipe Lima
 *Data: 29/09/2021*/

programa{
	
	funcao inicio(){
		inteiro vetor[5], contador, maior = 0
		para (contador = 0; contador < 5; contador++) {
			escreva("Digite a pontuação ", contador+1, "ª:")
			leia(vetor[contador])
			se (vetor[contador] > 0){
				maior = vetor[contador]
			}
		}
		escreva("A maior pontuação é: ", maior)			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 50; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */