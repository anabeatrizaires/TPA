import java.util.Scanner;
public class TrocaValores {
	public static void main(String[]args) {
		int a, b, c;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		a=in.nextInt();
		System.out.println("Digite outro número inteiro:");
		b=in.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Aqui estão os valores invertidos: " + a + " e " + b);
		in.close();
						
	}

}
