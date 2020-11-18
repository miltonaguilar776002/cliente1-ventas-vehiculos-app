package pe.com.arland.cliente1.registro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.ClientesRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.UsuariosAplicacionRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.service.impl.AutenticacionServiceImpl;

class AutenticationServicesTest {

	@Test
	void test() {
     	AutenticacionServiceImpl serviceAuth = new AutenticacionServiceImpl() ;
     	serviceAuth.setClienteDAO(new ClientesRepositoryImpl() );
     	serviceAuth.setUsuarioDAO(new UsuariosAplicacionRepositoryImpl());
     	
     	ClienteEntity cliente = serviceAuth.recuperarCliente("01", "2010092874");
     	
     	//USR2001,USR2002,USR2003
     	UsuarioAplicacionEntity usuario  = serviceAuth.validarUsuarioAplicacionporCodUsuario("USR2002", "");
    	
     	assertAll ("Nombre del grupo : Verificar Explicitamente a un valor",
     			() -> assertEquals(cliente.getNombrePrincipal(),"Juan"),
     			() -> assertEquals(cliente.getApellidoPaterno(),"Fabian")
     			);
     	/*
     	assertAll ("Nomgre del grupo : por los valores del Cliente y persona ",
     			() -> assertEquals(cliente.getNombrePrincipal(),"Juan"),
     			() -> assertEquals(cliente.getApellidoPaterno(),"Fabian")
     			);
		*/
	}

}
