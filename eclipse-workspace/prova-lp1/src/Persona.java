
public class Persona {
	private int eta;
	private String nome;
	static final int numero = 1;
	
	private int[]array = null;
	
	
	public Persona() {
		
	}
	
	public Persona(int eta, String nome) {
		super();
		this.eta = eta;
		this.nome = nome;
		
	}
	
	public void f(int a) {System.out.println("sono nel primo");}
	
	public int f(float b) {
		System.out.println("sono nel secondo");
		return 0;
	}
	public float f(String c) {
		System.out.println("sono nel terzo");
		return 0;
	}
	
	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
