import java.util.Scanner;
public class RodizioCarro {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int pCarro;
		System.out.println("Digite o último número da placa do seu carro:");
		pCarro= in.nextInt();
		switch (pCarro) {
			case 1: 
			case 2:
				System.out.println("Você não deve circular com seu veículo na segunda");
				break;
			case 3: 
			case 4:
				System.out.println("Você não deve circular com seu veículo na terça");
				break;
			case 5: 
			case 6:
				System.out.println("Você não deve circular com seu veículo na quarta");
				break;
			case 7: 
			case 8:
				System.out.println("Você não deve circular com seu veículo na quinta");
				break;
			case 9: 
			case 0:
				System.out.println("Você não deve circular com seu veículo na sexta");
				break;
			default: 
				System.out.println("Número de placa inválido");
		in.close();
		
		}
	}
	

}
