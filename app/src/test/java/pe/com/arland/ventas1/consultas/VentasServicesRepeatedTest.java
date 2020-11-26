package pe.com.arland.ventas1.consultas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pe.com.arland.cliente1.registro.entity.FacturaEntity;
import pe.com.arland.ventas1.repository.mongodb.ComprobanteRepositoryImpl;
import pe.com.arland.ventas1.service.impl.VentasServiceImpl;

public class VentasServicesRepeatedTest {

		private static VentasServiceImpl serviceVentas = new VentasServiceImpl() ;
		
		@Tag("Funcional")
		@DisplayName ("CONFIGURACION DEL ENTORNO")
		@BeforeAll
		static void configuracionDelEscenario() {
			System.out.println("****************************************");
			System.out.println("**	ETAPA :CONFIGURACION DEL ENTORNO  **");
			System.out.println("****************************************");
			System.out.println("**  AMBIENTE DE PRUEBA                **");
			System.out.println("****************************************");
			System.out.println("**  REGISTRO DE DATOS DE PRUEBA       **");
			System.out.println("****************************************");
	     	serviceVentas.setComprobanteDAO(new ComprobanteRepositoryImpl() );
	 
		}

		@DisplayName ("CONFIGURACION DE CADA PRUEBA")
		@BeforeEach
		void configuracionCadaPrueba() {
			System.out.println("******************************************************");
			System.out.println("** ETAPA :CONFIGURACION PREVIA ANTES DE CADA PRUEBA **");
			System.out.println("******************************************************");
		}

		// @RepeatedTest(value = 10, name = "{displayName} {currentRepetition}/{totalRepetitions}")	
		@RepeatedTest(value = 10, name = "TEST")	
		//@DisplayName ("TEST DE PRUEBA COMPROBANTE"+ "{currentRepetition}" )
		@DisplayName ("TEST DE PRUEBA COMPROBANTE" )
		//void testVentasConsultaFacturas(TestInfo  test) {
		void testVentasConsultaFacturas(RepetitionInfo  repetitionInfo) {
			//*EJEMPLO REPEATED CLASS 345-348
			System.out.println("******************************************************");
			System.out.println("** ETAPA : PRUEBAS DE FACTURAS **");
			System.out.println("******************************************************");
			// CLASS TEST INFO
			//System.out.println(test.getDisplayName());
			//FacturaEntity factura  = serviceVentas.recuperarFactura("0020", (long) (345));
			// CLASS REPETITION INFO
			System.out.println(repetitionInfo.getCurrentRepetition());
		    System.out.println(repetitionInfo.getTotalRepetitions());
		    Integer currentRepetition = repetitionInfo.getCurrentRepetition();
	     	FacturaEntity factura  = serviceVentas.recuperarFactura("0020", (long) (345+ currentRepetition));
	     	assertTrue(factura.getMontoComprobante()>10000);
		}

		
		@DisplayName ("LIBERACION DE DATOS DE CADA PRUEBA")
		@BeforeEach
		void restauracionDeCadaPrueba() {
			System.out.println("******************************************************");
			System.out.println("** ETAPA :CONFIGURACION PREVIA ANTES DE CADA PRUEBA **");
			System.out.println("******************************************************");
		}

		
		@DisplayName ("RESTAURACION DEL ENTORNO")
		@AfterAll
		static void restauracionDelEscenario() {
			System.out.println("****************************************");
			System.out.println("**	ETAPA :RECONFIGURACION DEL ENTORNO  **");
			System.out.println("****************************************");
			System.out.println("**  ELIMINACION DE DATOS DE PRUEBA  ***");
			System.out.println("****************************************");
		}
	}
