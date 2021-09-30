/*Programa: Laço condicional lógica - Exercicio 2
 *Autor: Felipe Lima
 *Data: 24/09/2021*/
programa{
	
	funcao inicio(){
		inteiro codigo
		real horasTrab, horasExtras = 0.0, salarioExtra, salario
		escreva("Código: ")
		leia(codigo)
		escreva("Horas trabalhadas: ")
		leia(horasTrab)

		se(horasTrab > 50) {
			horasExtras = horasTrab - 50
			escreva(horasExtras)
		}
		salarioExtra = horasExtras * 20
		salario = (horasTrab - horasExtras) * 10
		escreva("\n\nTotal de Horas Trabalhadas: ", horasTrab)
		escreva("\nTotal de Horas Extras: ", horasExtras)
		escreva("\nSalário base: R$", salario)
		escreva("\nSalário extra: R$", salarioExtra)
		escreva("\nSalário: R$", salario + salarioExtra) 
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