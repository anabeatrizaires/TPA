import java.util.Scanner;
public class AreaCircunferencia {
	public static void main(String[] args) {
		double c, a;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite a medida do raio de um circulo:");
		c=in.nextDouble();
		a=3.14*c*c;
		System.out.println("A área do círculo é igual a:" + a);
		in.close();
		
		
		
	}

}
