/*Programa: Vetores e Matrizes - Exercicio 3
 *Autor: Felipe Lima
 *Data: 29/09/2021*/
programa {
	
	funcao inicio() {
		inteiro N1[2][2], N2[2][2], M1[2][2], contador, linha, coluna
		para (linha=0; linha <2; linha++){
			para(coluna = 0;coluna < 2; coluna++){
				escreva("Qual o valor de [", linha+1 , "][", coluna + 1, "] da N1? ")
				leia(N1[linha][coluna])		
			}
		}
		para (linha = 0; linha < 2; linha++){
			para(coluna = 0; coluna< 2; coluna++){
				escreva("Qual o valor de [", linha + 1, "][", coluna + 1, "] da N2? ")
				leia(N2[linha][coluna])
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				escreva(M1[linha][coluna])
			}
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