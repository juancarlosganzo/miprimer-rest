package mx.com.laboratorio.miprimerrest.mimodulo;

public class ContribuyenteDTO {
	
	private int IdContribuyente;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private String rfc;

	public int getIdContribuyente() {
		return IdContribuyente;
	}

	public void setIdContribuyente(int idContribuyente) {
		IdContribuyente = idContribuyente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	
	

}
