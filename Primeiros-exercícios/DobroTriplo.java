import java.util.Scanner;
public class DobroTriplo {
	public static void main (String[]args) {
		double v1, dob, tri;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite um número qualquer");
		v1=in.nextDouble ();
		dob=v1*2;
		tri=v1*3;
		System.out.println("O DOBRO do seu número é: " + dob + " e o TRIPLO é: " + tri);
		in.close();
		
						
		
	}

}
                             