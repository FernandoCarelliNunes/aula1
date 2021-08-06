package aula1;

public class primeiraAula {

	static int maiorIdadeGlobal = 30; /*variavel globol é acessivel a todos e seu valor é 
	compartilhado*/
	
	public static void main(String[] args) {
		
		
		int maiorIdade = 18; /*variavel local, porque pertence somente a esse metodo*/
		
		System.out.println("Valor da variavel local : " + maiorIdade);
		metodo2();
		
	}
	
	public static void metodo2() {
		
		System.out.println("Valor da variavel global é" + maiorIdadeGlobal);
	}
}