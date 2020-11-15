package pe.com.arland.seguridad1.autenticacion.service.impl;

import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;
import pe.com.arland.seguridad1.autenticacion.service.arlandAutenticacionService;

public class arlandAutenticacionServiceImpl implements arlandAutenticacionService {

	public arlandAutenticacionServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ClienteEntity obtenerClienteReferenciado(UsuarioAplicacionEntity usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteEntity recuperarCliente(String tipoDocumento, String NumeroDocumento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioAplicacionEntity validarUsuarioAplicacionporCodUsuario(String codUsuario, String Clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioAplicacionEntity validarUsuarioAplicacionporCorreoUsuario(String codUsuario, String sdd) {
		// TODO Auto-generated method stub
		return null;
	}

}
