import java.util.Scanner;
public class SalarioBruto {
	public static void main(String[] args) {
		double s, d; 
		
		Scanner in= new Scanner(System.in);
		System.out.println("Digite seu Sálario Bruto:");
		s=in.nextDouble();
		d=s*6/100;
		System.out.println("O seu desconto de Vale Transporte igual a 6% equivale:" + d);
		in.close();

	}
		

}
