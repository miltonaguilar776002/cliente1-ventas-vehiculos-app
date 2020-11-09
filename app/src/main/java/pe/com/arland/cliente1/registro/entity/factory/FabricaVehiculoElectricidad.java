package pe.com.arland.cliente1.registro.entity.factory;
import pe.com.arland.cliente1.registro.entity.VehiculoAutomovilBase;
import pe.com.arland.cliente1.registro.entity.AutomovilElectricidadEntity;
import pe.com.arland.cliente1.registro.entity.VehiculoScooterBase;
import pe.com.arland.cliente1.registro.entity.ScooterElectricidadEntity;

public class FabricaVehiculoElectricidad implements IFabricaVehiculo 
{ 
  public VehiculoAutomovilBase creaAutomovil(String modelo, String 
    color, int potencia, double espacio) 
  { 
    return new AutomovilElectricidadEntity(modelo, color, 
      potencia, espacio); 
  } 
 
  public VehiculoScooterBase creaScooter(String modelo, String 
    color, int potencia) 
  { 
    return new ScooterElectricidadEntity(modelo, color, 
      potencia); 
  } 
} 
 
