
public class Test {

	public static void main(String[] args) {
		B beta = new B();
		A alfa = beta;
		System.out.println( alfa . f ( alfa , (short)500, 1));
		System.out.println(beta.f ( alfa , (short)500, 1));
		System.out.println(beta.f (beta, (short)500, 1));
		System.out.println(beta.f (beta, (byte)1, 1));
		
		int s = 1;
		char a = 'a';
		short h = 1;
		byte p = 9;
		
		
		}
	

}
