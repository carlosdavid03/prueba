package actividad_patrones_basicos;

import java.util.ArrayList;
import java.util.List;

/**
 * Simulación de creación y eliminación de clientes
 * @author jrudasc
 */

public class Index {
   
    public static void main(String[] arg) {
        
        List <Cuenta> listacuenta = new ArrayList<>();
        listacuenta.add(new Ahorro(1001,"Cuente Ahorro",250000));      
        listacuenta.add(new Corriente(1101,"Cuenta Corriente",150000));
        listacuenta.add(new Cheque(1201,"Cuenta Cheque",550000));
       
        List <Cuenta> listacuenta1 = new ArrayList<>();
        listacuenta1.add(new Ahorro(1002,"Cuenta Ahorro",550000));
        listacuenta.add(new Corriente(1102,"Cuenta Corriente",350000));
        listacuenta.add(new Cheque(1202,"Cuenta Cheque",50000));
        
        
        Cliente cliente1 = new Cliente("Jorge", "Rudas", 46468465, 0);
        Transaccion transaccion1 = new Transaccion(0001, listacuenta, 1000);
        
        Cliente cliente2 = new Cliente("Lucas", "Arias", 12458796, 0);
        Transaccion transaccion2 = new Transaccion(0002, listacuenta1, 1000);
        
      
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        manejadorCliente.guardar(cliente1);
        manejadorCliente.guardar(transaccion1);
        
        manejadorCliente.guardar(cliente2);
        manejadorCliente.guardar(transaccion2);      
        
        //manejadorCliente.eliminar(cliente1);
    }
}
