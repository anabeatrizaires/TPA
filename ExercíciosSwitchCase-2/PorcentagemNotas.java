import java.util.Scanner;
public class PorcentagemNotas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,aMb,aB,aR,aI,pMb,pB,pR,pI,p;
		System.out.println("Digite o número de alunos da sua sala:");
		a = in.nextInt();
		System.out.println("Digite a quantidade de alunos com a nota MB:");
		aMb = in.nextInt();
		System.out.println("Digite a quantidade de alunos com a nota B:");
		aB = in.nextInt();
		System.out.println("Digite a quantidade de alunos com a nota R:");
		aR = in.nextInt();
		System.out.println("Digite a quantidade de alunos com a nota I:");
		aI = in.nextInt(); 
		pMb = aMb*100/a;
		pB = aB*100/a;
		pR = aR*100/a;
		pI = aI*100/a;
		System.out.println("Digite qual nota você quer saber a porcentagem (1-MB; 2-B; 3-R; 4-I)");
		p = in.nextInt();
		if (p==1){
			System.out.println("A porcentegem é"+ pMb);		
		} else if (p==2) {
			System.out.println("A porcentegem é"+ pB);
			
		} else if (p==3) {
			System.out.println("A porcentegem é"+ pR);
		
		} else {
			System.out.println("A porcentegem é"+ pI);
		
		}
		in.close();
	}
}
