
public class D {
	private Integer i1 = new Integer(0);
	private Float f1 = new Float(1.5);
	private Integer i4 = new Integer(20);
	void q() {
		m(i1, f1, new Integer(20));
	}
	void m(Integer i2, Object f2, Integer i3) {
		if(i1 == i2) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
		if(f2 == f1) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
		if(i3 == i4) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
	}

}
