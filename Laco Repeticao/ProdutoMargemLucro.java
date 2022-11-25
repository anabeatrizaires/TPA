import java.util.Scanner;
public class ProdutoMargemLucro {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		int i=1;
		double p, m, pV;
		String res;
		do {
			System.out.println("Digite o preço do produto:");
			p=in.nextDouble();
			System.out.println("Digite a margem de lucro (%):");
			m=in.nextDouble();
			m=(m/100)*p;
			pV=p+m;
			System.out.println("O preço de venda é: " + pV + "R$");
			System.out.println("Deseja continuar com o programa? Digite S=SIM ou N=NÃO?");
			res=in.next();
		} while (res.equalsIgnoreCase("S"));
		System.out.println("FIM DO PROGRAMA :)");
		
		in.close();
	}

}
