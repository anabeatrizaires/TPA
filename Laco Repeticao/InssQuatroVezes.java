import java.util.Scanner;
public class InssQuatroVezes {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		int i=1;
		double s, d1, d2;
		while (i<=4) {
			System.out.println("Digite seu salário:");
			s=in.nextDouble();
			if (s<2000.00) {
				d1=8.5/100*s;
				System.out.println("O desconto para o INSS em cima do seu salário é: " + d1 + " R$");
			} else if (s>=2000.00) {
				d2=0.11*s;
				System.out.println("O desconto para o INSS em cima do seu salário é: " + d2 + " R$");
				
			} 
			i=i+1;
		} 
		in.close();
			
	}

}
