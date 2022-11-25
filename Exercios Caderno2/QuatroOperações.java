import java.util.Scanner;
public class QuatroOperações {
	public static void main (String[]args) {
		int x, y, a, s, m, d;
		
		Scanner in=new Scanner(System.in);
		System.out.println ("Digite um número inteiro:");
		x=in.nextInt();
		System.out.println ("Digite outro número inteiro:");
		y=in.nextInt();
		a=x+y;
		s=x-y;
		m=x*y;
		d=x/y;
		System.out.println("Adição: " + a);
		System.out.println("Subtração: " + s);
		System.out.println("Multiplicação: " + m);
		System.out.println("Divisão: " + d);
		in.close();
	}

}
