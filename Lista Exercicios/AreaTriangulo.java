import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String[] args) {
		double base, altura, area;
		
		Scanner in=new Scanner (System.in);
		System.out.println("Digite a medida da base de um triângulo:");
		base=in.nextDouble();
		System.out.println("Digite a altura desse triângulo");
		altura=in.nextDouble();
		area=base*altura/2;
		System.out.println("A área desse triângulo é: " + area);
		in.close();
		
		
	}

}
