package netstudio.oop.override;

public class ResponsabileDiProgetto extends Dipendente {
	

	  private int bonus;

	  public int stipendio(){
	    int stipendioBase=(getOreLavorativeMensili() * getRetribuzioneOraria());
	    return stipendioBase + bonus;
	  }

}
