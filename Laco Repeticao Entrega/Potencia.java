import java.util.Scanner;
public class Potencia {
	public static void main(String[]args) {
		Scanner in=new Scanner (System.in);
		int b, e, i=2, res;
		System.out.println("Digite o número (inteiro) BASE de uma potência:");
		b=in.nextInt();
		System.out.println("Digite o número (inteiro) EXPOENTE de uma potência:");
		e=in.nextInt();
		res=b;
		while (i<=e) {
			res=res*b;
			i++;
		}
		System.out.println("O resultado da potência é igual a: " + res);
		in.close();
	}

}



