
public class A {
	String c;
	long z;
	A(String i) {
		System.out.println("costruttore A");
		z = 1;
		c = g(i);
	}
	String g(Object s) {
		System.out.println("sono qui");
		return "D:" + s;
		
	}
}
