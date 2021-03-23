import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> java = new HashSet<Integer>();
		Set<Integer> php = new HashSet<Integer>();
		Set<Integer> sql = new HashSet<Integer>();
		Set<Integer> alunoPorProfessor = new HashSet<>();

		System.out.println("Quantos alunos irão cursar Java? ");
		int numCursoJava = sc.nextInt();

		Integer codAluno;

		for (int i = 0; i < numCursoJava; i++) {

			codAluno = sc.nextInt();
			java.add(codAluno);
			alunoPorProfessor.add(codAluno);

		}

		System.out.println("Quantos alunos irão cursar PHP? ");
		int numCursoPhp = sc.nextInt();

		for (int i = 0; i < numCursoPhp; i++) {

			codAluno = sc.nextInt();
			alunoPorProfessor.add(codAluno);
			php.add(codAluno);

		}

		System.out.println("Quantos alunos irão cursar SQL? ");
		int numCursoSql = sc.nextInt();

		for (int i = 0; i < numCursoSql; i++) {

			codAluno = sc.nextInt();
			alunoPorProfessor.add(codAluno);
			sql.add(codAluno);

		}

		System.out.println("Total de Estudandes:" + alunoPorProfessor.size());

	}

}
