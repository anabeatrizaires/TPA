import java.util.Scanner;
public class MetrosKm {
	public static void main (String[]args) {
		double m, km;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Para realizar a conveção de m para km, digite um número:");
		m=in.nextDouble();
		km=m/1000;
		System.out.println(m + " metros equivalem a " + km + " Quilômetros");
		in.close();	
				
	}

}
