package netstudio.oop.comparable;

public class Mela implements Comparable<Mela>{

	private int grammi;
	private String tipo;
	
	
	
	public Mela(int grammi, String tipo) {
		super();
		this.grammi = grammi;
		this.tipo = tipo;
	}


	//>1 <1 =0
	@Override
	public int compareTo(Mela o) {
		// TODO Auto-generated method stub
		return grammi - o.grammi;
	}


	public int getGrammi() {
		return grammi;
	}


	public void setGrammi(int grammi) {
		this.grammi = grammi;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
