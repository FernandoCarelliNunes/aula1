package aula1;

public class primeiraAula {

	
	public static void main(String[] args) {
	
		/*Concatenacao de variaveis = unir ou juntar dados*/
		
		
		String nome = "Fernando Carelli";
		String cpf = "220.397.278-5";
		String telefone = "(19)98850-4886";
		String endereco ="Rua dos Caningas";
		String saida = "Meu nome �: " + nome + "\nMeu Cpf � : " + cpf + "\nMeu Telefone �:  " 
				+ telefone + "\nMeu Endere�o �:  " + endereco;
		
		System.out.println(saida);
		
		int a = 10;
		int b = 20;
		int result;
		
		calculo(a,b);
	}
	
	
	public static int calculo(int a, int b) {
		System.out.println("Chamada de Construtor");
		
		int result;
		result = a + b;
		int i = result = result;
		return i;
		
		
	}
}