 /*Programa: Vetores e Matrizes - Exercício 2
 *Autor: Felipe Lima
 *Data: 29/09/2021*/
programa{
	inclua biblioteca Util
	funcao inicio(){
		inteiro numero[10], contador, maior = 0, conta = 0
		real media, soma = 0.0
		para (contador = 0 ; contador < 10; contador++) {
			numero[contador] = Util.sorteia(1, 6)
			escreva("O número do dado é ", numero[contador], "\n")
			soma = soma + numero[contador]
			se (numero[contador] >= maior){
				maior = numero[contador]
			}	
		}
		para(contador = 0; contador <10; contador++) {
			se(numero[contador] == maior) {
				conta++		
			}
		}
		media = soma/contador
		escreva("\nA média dos números somados é ", media,".")
		escreva("\nO maior número foi ", maior, ", ele repetiu ", conta, ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 578; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */