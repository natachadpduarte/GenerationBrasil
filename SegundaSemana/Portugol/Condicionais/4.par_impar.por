/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem 
indicando se este número é par ou ímpar, e se é positivo ou negativo.*/

programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um número: ")
		leia(numero)

		se(numero%2==0 e numero < 0){
			escreva("Este número é par e negativo") } 
			
			senao se 
			(numero%2==0 e numero >= 0){
			escreva("Este número é par e positivo") }
			
			senao se 
			(numero%2!=0 e numero < 0){
			escreva("Este número é impar e negativo") }

			senao se 
			(numero%2!=0 e numero >= 0){
			escreva("Este número é impar e positivo") }
		 
		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */