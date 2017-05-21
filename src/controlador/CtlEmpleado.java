
package controlador;

import modelo.Empleado;


public class CtlEmpleado {
    String empleado;
      
    public Empleado[] registrarEmpleado (Empleado [] arrayEmpleado, String nombre,String cedula,String cargo,String direccion,String telefono,String correo){
        Empleado empleado= new Empleado(cedula, nombre, cargo, direccion, telefono, correo);
        for (int j = 0; j < arrayEmpleado.length; j++) {
            if (arrayEmpleado[j]==null){
                arrayEmpleado[j]=empleado;
                break;
                    
 
            }
            
        }
        return arrayEmpleado;
    }
    
    public static void imprimirEmpleado (Empleado[] arrayEmpleado){
        System.out.println("empieza");
            for (int i = 0; i < arrayEmpleado.length; i++) {
               
                if(arrayEmpleado[i] == null){
                    break;
                }
                System.out.println("Nombre empleado "+ arrayEmpleado[i].getNombre()
        + " , cédula empleado " + arrayEmpleado[i].getCedula()+ " , cargo empleado "+ arrayEmpleado[i].getCargo()
        + " , dirección empleado "+arrayEmpleado[i].getDireccion()+ " , telefono empleado "+ arrayEmpleado[i].getTelefono()
        + " , correo empleado "+ arrayEmpleado[i].getCorreo());
            }
        
    }
}
//* public Avion[] registrarAvion(Avion[] arrayAvion, String matricula, int puestos, String tipoAvion) {
//        Avion avion = new Avion(matricula, puestos, tipoAvion);
//        for (int i = 0; i < arrayAvion.length; i++) {
//            if (arrayAvion[i] == null) {
//                arrayAvion[i] = avion;
//                break;
//            }
//        }
//        return arrayAvion;
