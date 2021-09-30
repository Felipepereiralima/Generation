/*Programa: Vetores e Matrizes - Exercicio 4
 *Autor: Felipe Lima
 *Data: 29/09/2021*/
programa {
	
	funcao inicio() {
		inteiro matriz[3][3], linha, coluna, soma = 0, diagonal = 0
		para (linha = 0; linha < 3; linha++) {
			para (coluna = 0; coluna < 3; coluna++) {
				escreva("Posição: [ " , linha+1 , " ][ " , coluna+1 , " ]: " )
				leia(matriz[linha][coluna])	
				soma+=matriz[linha][coluna]
				diagonal=matriz[0][0]+matriz[1][1]+matriz[2][2]				
			}
		}
		limpa()
		escreva("\nA soma total da matriz é de ", soma)
		escreva("\nA soma da diagonal é ", diagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 477; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */