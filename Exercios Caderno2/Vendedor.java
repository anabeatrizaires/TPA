import java.util.Scanner;
public class Vendedor {
	public static void main(String[]args) {
		String v;
		double sFixo, vendsMes, c, sTotal;
		
		Scanner in=new Scanner(System.in);
		System.out.println ("Digite o nome do Vendedor:");
		v=in.next();
		System.out.println ("Agora digite o salário fixo do Vendedor:");
		sFixo=in.nextDouble();
		System.out.println ("Por fim digite o total de vendas do mês desse vendedor:");
		vendsMes=in.nextDouble();
		c=0.15*vendsMes;
		sTotal=sFixo+c;
		System.out.println ("Sabendo que a comissão do vendedor " + v + " é de 15%,");
		System.out.println ("o salário fixo é: " + sFixo + "0R$  e o");
		System.out.println ("salário final é: " + sTotal + "0R$");
		in.close();
						
	}

}
