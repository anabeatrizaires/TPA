import java.util.*;
public class FaixaEtaria15 {
	public static void main (String[]args) {
		int i;
		double pa, pb, pc, pd, pe,  id, a =0, b=0, c=0, d=0, e=0;
		Scanner in = new Scanner (System.in);
		for (i=1; i<= 15; i++) {
			System.out.println("Digite a: " + i + "º idade...");
			id=in.nextInt();
			if (id<=15) {
				a++;
			} else if (id<=30) {
				b++;
			}else if (id<=45) {
				c++;
			}else if (id<=60) {
				d++;
			}else {
				e++;
			}
		}
		pa=(a/15)*100;
		pb=(b/15)*100;
		pc=(c/15)*100;
		pd=(d/15)*100;
		pe=(e/15)*100;

		System.out.println("Há " + a + " pessoas na 1º faixa etária, equivalente a: " + pa + " %");
		System.out.println("Há " + b + " pessoas na 2º faixa etária, equivalente a: " + pb + " %");
		System.out.println("Há " + c + " pessoas na 3º faixa etária, equivalente a: " + pc + " %");
		System.out.println("Há " + d + " pessoas na 4º faixa etária, equivalente a: " + pd + " %");
		System.out.println("Há " + e + " pessoas na 5º faixa etária, equivalente a: " + pe + " %");
	}
	
}
