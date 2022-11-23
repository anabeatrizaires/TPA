import java.util.Scanner;
public class AlunosFutebol {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int idade;
		System.out.println("Digite a idade do aluno:");
		idade=in.nextInt();
		switch(idade) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("idade inválida");
				break;
			case 6:
				System.out.println("categoria: Dente de Leite");
				break;
			case 7:
				System.out.println("categoria: Júnior");
				break;
			case 8:
				System.out.println("categoria: Júnior Max");
				break;
			case 9:
				System.out.println("categoria: Júnior Master");
				break;
			case 10:
				System.out.println("categoria: Master");
				break;
			default:
				System.out.println("categoria: Master");
			in.close();
				
		}
		
		
	}

}
