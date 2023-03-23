package netstudio.oop.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		//Possiamo ottenere una specifica data utilizzando il metodo statico of
		LocalDate localDate = LocalDate.of(2016, 1, 1);
		
//		formattazione di una data tramite il metodo format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.ITALY);
		System.out.println(localDate.format(formatter));
		
		
		System.out.println(LocalDate.now());
		
		
		//mercoledì
		findDay(8, 05 ,2015);

	}
	
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	LocalDate localDate = LocalDate.of(year, month, day);
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee").withLocale(Locale.ITALIAN);
    	System.out.println(localDate.format(formatter));
    	
        return "";
    }


}
