package mx.com.laboratorio.miprimerrest.util;

public class ValidacionUtil {
	
	public static boolean esCadenaVacia(String cadena) {
		boolean estaVacia = false;
		if (cadena == null || cadena.trim().isEmpty()) {
			estaVacia = true;
		}
		return estaVacia;
	}
	
	public static boolean validarRfc(String rfc) {
		rfc = rfc.toUpperCase().trim();
		return rfc.toUpperCase().matches("[A-Z]{3}[0-9]{6}[A-Z0-9]{3}");
	}
	

}
