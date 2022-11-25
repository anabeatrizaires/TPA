import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		int n, i, a=0, c=1, res;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite um número e obtenha a sequência de Fibonacci (segundo o enésimo termo)");
		n=in.nextInt();
		System.out.println("Sequência de Fibonacci: ");
		System.out.println("1");
		for (i=1; i<n; i++) {
			res=c+a;
			a=c;
			c=res;
			System.out.println(res);
		}
		in.close();
	}

}
