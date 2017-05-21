package controlador;

import modelo.Vuelo;

public class CtlVuelo {

    String vuelo;
    int i = 0;

    public Vuelo[] registrarVuelo(Vuelo[] arrayVuelo, int puestos, String numeroVuelo, String fecha, String horaSalida, String horaLlegada, String tipoAvion, String destino) {
        Vuelo vuelo = new Vuelo(numeroVuelo, fecha, horaSalida, horaLlegada, destino, tipoAvion, puestos);
        for (int j = 0; j < arrayVuelo.length; j++) {
            if (arrayVuelo[j] == null) {
                arrayVuelo[j] = vuelo;
                break;
            }
        }
        return arrayVuelo;
    }
    public static void imprimirVuelo (Vuelo[] arrayVuelo){
        System.out.println("empieza");
            for (int i = 0; i < arrayVuelo.length; i++) {
               
                if(arrayVuelo[i] == null){
                    break;
                }
                System.out.println("Número de vuelo: "+ arrayVuelo[i].getNumeroVuelo()
        + " , fecha " + arrayVuelo[i].getFecha()+ " , hora de salida "+ arrayVuelo[i].getHoraSalida()
        + " , hora de llegada "+arrayVuelo[i].getHoraLlegada()+ " , destino "+ arrayVuelo[i].getDestino()
        + " , tipo de avion "+ arrayVuelo[i].getTipoAvion()+ " número de puestos "+ arrayVuelo[i].getPuestos());
            }
        
    }
}
