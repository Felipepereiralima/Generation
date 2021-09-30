/*Programa: Laço de repetição - Exercicio 1 Para
 *Autor: Felipe Lima
 *Data: 27/09/2021*/

programa {

	inclua biblioteca Matematica --> mat
	funcao inicio(){
		inteiro populacao, filhos, somaFilhos = 0, mediaFilhos, contador = 0 
		real salario, somaSalario = 0, mediaSalario, maiorSalario = 0, percentual, somaPessoas = 0
		para (contador = 0; contador <=19; contador++) {
			escreva("Quanto é o salário pessoa? ")
			leia(salario)
			somaSalario = somaSalario + salario
			escreva("Quantos filhos você tem? ")
			leia(filhos)
			somaFilhos = somaFilhos + filhos	
			se (salario > maiorSalario) {
				maiorSalario = salario
			}
			se (salario <= 100) {
				somaPessoas++
			}
		}
		mediaSalario = somaSalario/contador
		escreva("A média do salário é de R$ ", mediaSalario)
		mediaFilhos = somaFilhos/contador
		escreva("\nA média de filhos por pessoa é ", mediaFilhos)
		escreva("\nO maior salário é de R$ ", maiorSalario)
		percentual = (somaPessoas/contador)*100
		escreva("\nO percentual de pessoas com o salário abaixo de R$ 100 é de ", percentual,"%.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 48; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */