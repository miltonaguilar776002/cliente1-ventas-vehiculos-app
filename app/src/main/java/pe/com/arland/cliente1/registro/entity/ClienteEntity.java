package pe.com.arland.cliente1.registro.entity;

import java.util.ArrayList;
import java.util.Date;

public class ClienteEntity  extends PersonaBase {
	
	private String idCliente;
	private String tipoCliente;
	private Date fechaRegistro;
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	public ClienteEntity(String nombrePrincipal, String nombresSecundarios, String apellidoPaterno,
			String apellidoMaterno, String tipoDocumento, String numeroDocumento,
			ArrayList<DireccionEntity> direcciones, ArrayList<TelefonoEntity> telefonos, String idCliente,
			String tipoCliente, Date fechaRegistro ,  String correoElectronico) {
		super(nombrePrincipal, nombresSecundarios, apellidoPaterno, apellidoMaterno, tipoDocumento, numeroDocumento,
				direcciones, telefonos , correoElectronico);
		this.idCliente = idCliente;
		this.tipoCliente = tipoCliente;
		this.fechaRegistro = fechaRegistro;
	}
	
	

}
