package controlador;

import modelo.Avion;

public class CtlAvion {

    String avion;
    int puestos;

    public Avion[] registrarAvion(Avion[] arrayAvion, String matricula, int puestos, String tipoAvion) {
        Avion avion = new Avion(matricula, puestos, tipoAvion);
        for (int i = 0; i < arrayAvion.length; i++) {
            if (arrayAvion[i] == null) {
                arrayAvion[i] = avion;
                break;
            }
        }
        return arrayAvion;

    }

    public Avion[] buscarAviones(Avion[] aviones, String tipo) {
        Avion[] auxiliar = new Avion[aviones.length];
        int cont = 0;
        for (int j = 0; j < aviones.length; j++) {
            if (aviones[j].getTipoAvion().equalsIgnoreCase(tipo)) {
                auxiliar[cont] = aviones[j];
                cont++;
            }
        }
        return auxiliar;
    }

    public static void imprimirEmpleado(Avion[] arrayAvion) {
        System.out.println("empieza");
        for (int i = 0; i < arrayAvion.length; i++) {

            if (arrayAvion[i] == null) {
                break;
            }
            System.out.println("Matricula del avión " + arrayAvion[i].getMatricula()
                    + " Tipo avión " + arrayAvion[i].getTipoAvion()
                    + " Puestos disponibles " + arrayAvion[i].getPuestos());

        }
    }
}