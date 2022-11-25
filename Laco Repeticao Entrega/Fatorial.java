import java.util.Scanner;
public class Fatorial {
	public static void main(String[]args) {
		Scanner in=new Scanner (System.in);
		int n, i=1, res;
		System.out.println("Digite um número inteiro e obtenha seu Fatorial:");
		n=in.nextInt();
		res=n;
		if (n==0) {
			System.out.println("O fatorial de: " + n + " é igual a: 1");
		} else {
			while (i<n){
				res=res*i;
				i++;
			}
			System.out.println("O fatorial de: " + n +  " é igual a: " + res);
		}
		in.close();
	}
}


