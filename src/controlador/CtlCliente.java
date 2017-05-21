package controlador;

import modelo.Cliente;

public class CtlCliente {

    String cliente;

    public Cliente[] registrarCliente(Cliente[] arrayCliente, String nombre, String cedula, String tipoSangre, String genero, String edad, String telefono) {
        Cliente cliente = new Cliente(cedula, nombre, tipoSangre, genero, edad, telefono);
        for (int i = 0; i < arrayCliente.length; i++) {
            if (arrayCliente[i] == null) {
                arrayCliente[i] = cliente;
                break;
            }

        }
        return arrayCliente;
    }

    public static void imprimirCliente(Cliente[] arrayCliente) {
       
        for (int i = 0; i < arrayCliente.length; i++) {

            if (arrayCliente[i] == null) {
                break;
            }
            System.out.println("Nombre cliente " + arrayCliente[i].getNombre()
                    + " , cédula cliente " + arrayCliente[i].getCedula() + " , tipo de sangre cliente " + arrayCliente[i].getTipoSangre()
                    + " , genero cliente " + arrayCliente[i].getGenero() + " , edad cliente " + arrayCliente[i].getEdad()
                    + " , telefono cliente " + arrayCliente[i].getTelefono());

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
