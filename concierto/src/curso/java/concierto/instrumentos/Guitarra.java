package curso.java.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Guitarra extends Instrumento
{
	@Override
	@Value("tlan, tlan tlan en clase")
	public void setSonido(String sonido)
	{
		// TODO Auto-generated method stub
		super.setSonido(sonido);
	}

}
