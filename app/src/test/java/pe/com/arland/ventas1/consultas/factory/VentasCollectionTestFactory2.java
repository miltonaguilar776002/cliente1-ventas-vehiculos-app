package pe.com.arland.ventas1.consultas.factory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import pe.com.arland.cliente1.registro.entity.FacturaEntity;
import pe.com.arland.ventas1.repository.mongodb.ComprobanteRepositoryImpl;

class VentasCollectionTestFactory2 {

  
	///ComprobanteRepositoryImpl repository = new ComprobanteRepositoryImpl();
	///FacturaEntity factura = repository.getFacturaByKey(serieComprobante, numeroComprobante)
	
	
    @TestFactory
    Iterable<DynamicTest> dynamicTestsFromIterable() {
        return Arrays.asList(
                dynamicTest("3rd dynamic test", () -> assertTrue(true)),
                dynamicTest("4th dynamic test", () -> assertEquals(4, 2* 2))
                );
    }

    @TestFactory
    Iterator<DynamicTest> dynamicTestsFromIterator() {
        return Arrays.asList(
                dynamicTest("5th dynamic test", () -> assertTrue(true)),
                dynamicTest("6th dynamic test", () -> assertEquals(4, 2* 2)),
                dynamicTest("7th dynamic test", () -> lanzarTest(8, 9)),
                dynamicTest("7th dynamic test", () -> lanzarTest(10, 9))
        		).iterator();
     }

    void lanzarTest(Integer a, Integer b){
    	Integer resultado = a + b ;
    	System.out.println("Este es un test Lanzado " + resultado.toString() );
    }
}
