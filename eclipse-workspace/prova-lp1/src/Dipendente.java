
public class Dipendente extends Persona {

	private String luogoLavoro;
	private double stipendio;
	
	public Dipendente() {
		
	}
	public Dipendente(int eta, String nome) {
		super(eta, nome);
		// TODO Auto-generated constructor stub
	}

	public String getLuogoLavoro() {
		return luogoLavoro;
	}

	public void setLuogoLavoro(String luogoLavoro) {
		this.luogoLavoro = luogoLavoro;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	

	

}
