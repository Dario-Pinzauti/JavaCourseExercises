package netstudio.oop.override;

public class Dipendente {

	  private String nome;
	  private String cognome;
	  private int oreLavorativeMensili;
	  private int retribuzioneOraria;

	  public int getOreLavorativeMensili(){
	    return oreLavorativeMensili;
	  }
	    
	  public int getRetribuzioneOraria(){
	    return retribuzioneOraria;
	  }

	  public int stipendio(){
	    return oreLavorativeMensili * retribuzioneOraria;
	  }  

}
