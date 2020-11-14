package pe.com.arland.cliente1.registro.entity;

import java.util.ArrayList;

public abstract class PersonaBase {
	private String nombrePrincipal;
	private String nombresSecundarios;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String tipoDocumento;
	private String numeroDocumento;
    private String correoElectronico;	
	
	private ArrayList<DireccionEntity> direcciones;
	private ArrayList<TelefonoEntity> telefonos;
	public String getNombrePrincipal() {
		return nombrePrincipal;
	}
	public void setNombrePrincipal(String nombrePrincipal) {
		this.nombrePrincipal = nombrePrincipal;
	}
	public String getNombresSecundarios() {
		return nombresSecundarios;
	}
	public void setNombresSecundarios(String nombresSecundarios) {
		this.nombresSecundarios = nombresSecundarios;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public ArrayList<DireccionEntity> getDirecciones() {
		return direcciones;
	}
	public void setDirecciones(ArrayList<DireccionEntity> direcciones) {
		this.direcciones = direcciones;
	}
	public ArrayList<TelefonoEntity> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(ArrayList<TelefonoEntity> telefonos) {
		this.telefonos = telefonos;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public PersonaBase(String nombrePrincipal, String nombresSecundarios, String apellidoPaterno, String apellidoMaterno,
			String tipoDocumento, String numeroDocumento, ArrayList<DireccionEntity> direcciones,
			ArrayList<TelefonoEntity> telefonos, String correoElectronico) {
		super();
		this.nombrePrincipal = nombrePrincipal;
		this.nombresSecundarios = nombresSecundarios;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.direcciones = direcciones;
		this.telefonos = telefonos;
		this.correoElectronico = correoElectronico;
	}
	
	
	
}
