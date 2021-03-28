/* Programa para calcular nota dos estudantes
Leonardo Paulo dos Santos 
17/03/2021*/


public class StudentTest
{
	public static void main(String[] args)
	{
		Student aluno1 = new Student("Leonardo", 95.0);
		
		System.out.printf("O grau de %s eh: %s%n", aluno1.getName(), aluno1.getLetterGrade());		
		
	}
}
