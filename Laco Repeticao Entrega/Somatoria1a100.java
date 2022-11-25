import java.util.Scanner;
public class Somatoria1a100 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int i=2, soma=1;
		System.out.println("Programa somatória de 1 a 100:");
		while (i<=100) {
			soma=soma+i;
			i++;
		}
		System.out.println("A somatória de 1 a 100 é: " + soma);
		in.close();
	}
}
