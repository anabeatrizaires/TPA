import java.util.Scanner;
public class DiasMesesAnos {
	public static void main(String[]args) {
		int dias, meses, anos;
		
		Scanner in=new Scanner (System.in);
		System.out.println("Digite uma quantidade qualquer de dias:");
		dias=in.nextInt();
		meses=dias/30;
		anos=dias/365;
		System.out.println(dias + " dias equivale a: " + anos + " ano/anos  ou  " + meses + " mês/meses");
		in.close();
		
		
	}

}
