import java.util.Scanner;
public class OrdemIdades2 {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int i=2, idade, idadeV, idadeN;
		String nome, nomeV, nomeN;
		System.out.println("Bem-vindo ao programa que lê o nome e a idade de 10 pessoas "
				+ "e ao final mostra que é mais velho e quem é mais novo,");
		System.out.println("Digite o 1º nome:");
		nome=in.next();
		System.out.println("Digite a 1º idade");
		
		idade=in.nextInt();
		nomeV=nome;
		nomeN=nome;
		idadeV=idade;
		idadeN=idade;
		while (i<=10) {
			System.out.println("Digite o " + i + "º nome:");
			nome=in.next();
			System.out.println("Digite a " + i + "º idade");
			idade=in.nextInt();
			if (idade>idadeV) {
			nomeV=nome;
			idadeV=idade;
			} else if (idade<idadeN) {
			nomeN=nome;
			idadeN=idade;
		}
			i=i+1;
		}
		System.out.println("Dentre as pessoas, " + nomeV + " é a mais velha com: " + idadeV + " anos  e");
		System.out.println("Dentre as pessoas, " + nomeN + " é a mais nova com: " + idadeN + " anos");
		in.close();
	}
}
