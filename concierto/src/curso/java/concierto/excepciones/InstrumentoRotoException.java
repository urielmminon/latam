/**
 * 
 */
package curso.java.concierto.excepciones;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import curso.java.diatres.Utilidades;

/**
 * @author javierdiaz
 * @version 1.0
 * @since 1.8
 */
public class InstrumentoRotoException extends Exception
{
	
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -9195339744713752851L;

	public void avisarAlPublico()
	{
		GregorianCalendar fecha= new GregorianCalendar();
		System.out.println(Utilidades.dameFecha(
				fecha.get(Calendar.DAY_OF_MONTH), 
				fecha.get(Calendar.MONTH)+1, 
				fecha.get(Calendar.YEAR), 
				Locale.getDefault()));
		System.out.println("SEÑORES SE HA ACABADO EL CONCIERTO, EN LA PUERTA LES DEVUELVEN EL DINERO");
		
	}

}
