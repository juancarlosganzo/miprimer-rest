package mx.com.laboratorio.miprimerrest.percistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contribuyente") 
public class Contribuyente {

	@Id
	@Column(name="IdContribuyente")
	private int idContribuyente;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Apellido1")
	private String apellido1;
	
	@Column(name="Apellido2")
	private String apellido2;
	
	@Column(name="RFC")
	private String rfc;

	public int getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(int idContribuyente) {
		this.idContribuyente = idContribuyente;
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
