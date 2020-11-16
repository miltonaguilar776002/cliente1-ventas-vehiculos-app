package pe.com.arland.seguridad1.autenticacion.repository;

import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;

public interface UsuariosAplicacionRepository {
	UsuarioAplicacionEntity getUsuarioAplicacionbByUserClave(String User, String Clave);
	UsuarioAplicacionEntity getUsuarioAplicacionbByCorreoClave(String CorreoElectronico , String Clave);
	
}
