import java.util.Scanner;
public class DataNascimento {
	public static void main (String[]args) {
		int anoNascimento, anoAtual, idade;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento:");
		anoNascimento=in.nextInt();
		System.out.println("Digite o Ano Atual");
		anoAtual=in.nextInt();
		idade=anoAtual-anoNascimento;
		System.out.println("Você possui: " + idade + " anos de idade");
		in.close();
				
	}
	

}
