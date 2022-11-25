import java.util.*;
public class NumeroPrimo {
	public static void main (String[]args) {
		int n=0, i, res=0;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um número e descubra se é PRIMO:");
		n=in.nextInt();
		for (i=1; i<=n; i++) {
			if (n % i == 0) {
				res++;
			}
		}
		
		if (res == 2) {
			System.out.println("NÚMERO PRIMO");
		} else {
			System.out.println("NÃO é primo");
		}

		in.close();
	}

}
