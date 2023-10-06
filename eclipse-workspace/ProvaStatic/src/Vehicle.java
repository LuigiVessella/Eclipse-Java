public class Vehicle {
	static String producer, model;
	Vehicle(String p, String m) {
		producer = p;
		model = m;
	}
	public static String id() {
		return producer + " ";
	}
}