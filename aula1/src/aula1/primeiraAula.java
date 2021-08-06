package aula1;

public class primeiraAula {

	public static void main(String[] args) {

		int nota1 = 80;
		int nota2 = 80;
		int nota3 = 80;
		int nota4 = 80;

		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

		/*operacoes logicas aninhadas, sao operacoes dentro de operacoes */
		
		if(mediaAluno >= 50) {
			if(mediaAluno >= 70) {
				System.out.println("Aluno aprovado Direto\n");
				System.out.println(mediaAluno);
				
			}else {
				System.out.println("Aluno esta em Recuperação\n");
				System.out.println(mediaAluno);
			}
		}else {
			System.out.println("Aluno Reprovado\n");
			System.out.println(mediaAluno);
		}
	
	}
}