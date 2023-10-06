
public class NestedNullPointer {
	
	public static void bar() {
		Object o = null;
		System.out.println(o.toString());
	}
	
	public static void foo() {
		bar();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo();
	}

}
