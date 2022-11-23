import java.util.Scanner;
public class SignosZodiaco {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int d, m;
		System.out.println("Digite o dia que você nasceu:");
		d=in.nextInt();
		System.out.println("Digite o número equivalente ao mês que você nasceu:");
		m=in.nextInt();
		if (d>=21 && m==3 || d<=20 && m==4) {
			System.out.println("Áries é seu signo");
			
		} else if (d>=21 && m==4 || d<=20 && m==5) {
			System.out.println("Touro é seu signo");
			
		} else if (d>=21 && m==5 || d<=20 && m==6) {
			System.out.println("Gêmeos é seu signo");
			
		} else if (d>=21 && m==6 || d<=21 && m==7) {
			System.out.println("Câncer é seu signo");
			
		} else if (d>=22 && m==7 || d<=22 && m==8) {
			System.out.println("Leão é seu signo");
			
		} else if (d>=23 && m==8 || d<=22 && m==9) {
			System.out.println("Virgem é seu signo");
			
		} else if (d>=23 && m==9 || d<=22 && m==10) {
			System.out.println("Libra é seu signo");
			
		} else if (d>=23 && m==10 || d<=21 && m==11) {
			System.out.println("Escorpião é seu signo");
			
		} else if (d>=22 && m==11 || d<=21 && m==12) {
			System.out.println("Sagitário é seu signo");
			
		} else if (d>=22 && m==12 || d<=20 && m==1) {
			System.out.println("Capricórnio é seu signo");
			
		} else if (d>=21 && m==1 || d<=19 && m==2) {
			System.out.println("Aquário é seu signo");
			
		} else {
			System.out.println("Peixes é seu signo");			
		in.close();
		}
		
	}

}
