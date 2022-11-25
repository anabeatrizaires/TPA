import java.util.Scanner;
public class DataNascimento {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoNascimento,anoAtual,idade;
		System.out.println("Digite Seu Ano de Nascimento:");
		anoNascimento = in.nextInt();
		System.out.println("Digite o Ano Atual:");
		anoAtual = in.nextInt();
		idade = anoAtual-anoNascimenmto;
		System.out.println("A sua idade é :"+ idade);
		in.close();
		
	}
}
