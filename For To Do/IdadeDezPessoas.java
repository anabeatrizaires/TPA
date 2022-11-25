import java.util.*;
public class IdadeDezPessoas {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int i, anoA, anoN, idade, maisNovo, maisVelho;
			System.out.println("Digite o ano atual:");
			anoA= in.nextInt();
			System.out.println("Digite o ano de nascimento do usuário:");
			anoN=in.nextInt();
			idade=anoA-anoN;
			maisVelho=idade;
			maisNovo=idade;
			
			
			System.out.println(idade + " anos");
			for (i=2; i<=10; i++) {
				System.out.println("Digite o ano atual:");
				anoA= in.nextInt();
				System.out.println("Digite o ano de nascimento do usuário:");
				anoN=in.nextInt();
				idade=anoA-anoN;
				System.out.println(idade + " anos");
				
				if(idade>maisVelho) {
					maisVelho=idade;
				}else if(idade<maisNovo) {
					maisNovo=idade;
				}
		}
		System.out.println("O usuário mais velho tem: " + maisVelho + "anos");
		System.out.println("O usuário mais novo tem: " + maisNovo + "anos");
	}

}
