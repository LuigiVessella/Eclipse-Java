public class Saluti {
	
	private String saluto;

	public Saluti(String saluto) {
		this.saluto = saluto;
	}
	
	public void saluta (String chi) {
		System.out.println(saluto + " " + chi);
	}
}