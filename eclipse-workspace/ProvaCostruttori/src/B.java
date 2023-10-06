
public class B extends A {

	B() {
		super("xxx");
		z = 4;
	}
	String g(Object s) {
		System.out.println("funzione g di B");
		return "C:" + s;
	}
}
