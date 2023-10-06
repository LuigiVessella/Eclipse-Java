class Car extends Vehicle {
	Car(String p, String m) {super(p,m);}
	public static String id() {
		return producer + " " + model + " ";
	}
}