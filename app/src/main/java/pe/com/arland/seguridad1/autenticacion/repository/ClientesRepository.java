package pe.com.arland.seguridad1.autenticacion.repository;

import pe.com.arland.cliente1.registro.entity.ClienteEntity;

public interface ClientesRepository {
	ClienteEntity getClienteByPersonId(String TipoDocumento , String NumeroDocumento);
}
