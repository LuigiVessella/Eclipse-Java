import java.util.Scanner;

public class Sqrt {
	
	public static double sqrt(double x) {
		if(x < 0)
			throw new IllegalArgumentException("sqrt: " + x);
		
		return Math.sqrt(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		double x;
		do {
			System.out.println("Scrivi un intero (0 per finire): ");
			x = tastiera.nextInt();
			if(x != 0) {
				System.out.println("la radice e': " + sqrt(x));
			}
		}while(x != 0);
		System.out.println("terminato");
		tastiera.close();
	}

}
