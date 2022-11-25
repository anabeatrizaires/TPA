import java.util.*;
public class MediaDezIdades {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		double i=2, idade, idadeV, idadeN, idadePorcent;
		String nome, nomeV, nomeN;
		System.out.println("Bem-vindo ao programa que lê o nome e a idade de 10 pessoas "
				+ "e ao final mostra que é mais velho e quem é mais novo...");
		System.out.println("Digite o 1º nome:");
		nome=in.next();
		System.out.println("Digite a 1º idade");
		
		idade=in.nextDouble();
		nomeV=nome;
		nomeN=nome;
		idadeV=idade;
		idadeN=idade;
		idadePorcent=idade;
		while (i<=10) {
			System.out.println("Digite o " + i + "º nome:");
			nome=in.next();
			System.out.println("Digite a " + i + "º idade");
			idade=in.nextDouble();
			idadePorcent=idadePorcent+idade;
			if (idade>idadeV) {
			nomeV=nome;
			idadeV=idade;
			} else if (idade<idadeN) {
			nomeN=nome;
			idadeN=idade;
		}
			i=i+1;
		}
		idadePorcent=idadePorcent/10;
		System.out.println("A porcentagemm de idade das pessoas é de: " + idadePorcent);
		System.out.println("Dentre as pessoas, " + nomeV + " º a mais velha com: " + idadeV + " anos  e");
		System.out.println("Dentre as pessoas, " + nomeN + " º a mais nova com: " + idadeN + " anos");
		in.close();
		
	}

}
