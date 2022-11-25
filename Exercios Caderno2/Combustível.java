import java.util.Scanner;
public class Combustível {
	public static void main (String[]args) {
		double s, c, g;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite a distância percorrida pelo seu carro,"
				+ " sabendo que ela será contabilizada em km: ");
		s=in.nextDouble();
		System.out.println("Agora digite o total de combustível gasto,"
				+ " sabendo que ele será contabilizado por litro: ");
		c=in.nextDouble();
		g=s/c;
		System.out.println("O consumo médio do seu automóvel em km/l é igual a: " + g);
		in.close();
		
	}

}
