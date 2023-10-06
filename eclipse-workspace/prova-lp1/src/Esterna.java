
public class Esterna {
	private int x;
	
	
	public class Interna {
		private int y;
		public void metodoInterno() {
			System.out.println(" x = " + x);
			System.out.println(" y = " + y);
		}
		
	}
	
	public void metodoEsterno() {
		System.out.println("x = " + x);
	}
	
	public void creaInterno() {
		Interna inter = new Interna();
		inter.metodoInterno();
	}

}
