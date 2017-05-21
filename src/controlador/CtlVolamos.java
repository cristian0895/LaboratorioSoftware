
package controlador;

import modelo.Avion;
import modelo.Cliente;
import modelo.Empleado;


public class CtlVolamos {
    
    Avion[] avion;
    Empleado[] arrayEmpleado;
    Cliente[] arrayCliente;
    public CtlVolamos() {
        avion = new Avion[10];
       arrayEmpleado = new Empleado[10];
        arrayCliente = new Cliente[10];
    }

    public Cliente[] getClientes() {
        return arrayCliente;
    }

    public void setClientes(Cliente[] clientes) {
        this.arrayCliente = clientes;
    }
        
     
        
        
    public Empleado[] getEmpleado() {
        return arrayEmpleado;
    }

    public void setEmpleados(Empleado[] empleado) {
        this.arrayEmpleado = empleado;
    }

    public Avion[] getAvion() {
        return avion;
    }

    public void setAvion(Avion[] avion) {
        this.avion = avion;
    }
    
    
    
    
    
}
