
public class A1 {
	public static void main(String [] argv)
			throws Exception {
		try {
			System.out.print(1);
			m();
		}
		catch( MyExc3 u ) {
			System.out.print(2);
			throw( new Exception() );
		}
		finally {
			System.out.print(3);
			throw( new MyExc3() );
		}
	}
	static void m()
			throws Exception {
		try {
			throw( new MyExc3() );
		}
		catch( Exception b ) {
			System.out.print(4);
			throw( new MyExc2() );
		}
	}
}

