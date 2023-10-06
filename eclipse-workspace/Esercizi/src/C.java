
public class C {
	String k;
	double x;
	
	static String q(Object n) {
		return "in C:" + n;
	}
	
	C(String r){
		x++;
		k = q(r);
	}
}
