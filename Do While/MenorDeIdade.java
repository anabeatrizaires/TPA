import java.util.*;
public class MenorDeIdade {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int i=1, anoA, anoN, idade, res;
		do {
			System.out.println("Digite o ano atual:");
			anoA =  in.nextInt();
			System.out.println("Digite o ano de nascimento:");
			anoN =  in.nextInt();
			idade= anoA-anoN;
			if (idade>=18 ) {
				System.out.println(idade + " anos: MAIOR de idade!");
			}else {
				System.out.println(idade + " anos: MENOR de idade!");
			}
			System.out.println("Deseja continuar com a execução do programa? Digite 1-para SIM  ou  2-para NÃO");
			res = in.nextInt();
			i++;
		} while (res==1);
		System.out.println("Programa Finalizado!");
		in.close();
		
	}

}
