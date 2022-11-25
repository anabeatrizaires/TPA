
public class MultiplosDeDez {
	public static void main (String[]args) {
		int i, res;
		for(i=1; i<=100; i++) {
			res=i%10;
			if(res == 0) {
				System.out.println(i + ": MÚLTIPLO DE 10");
			}else {
				System.out.println(i);
			}
		}
			
	}

}
