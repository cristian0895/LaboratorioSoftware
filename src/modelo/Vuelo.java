
package modelo;


public class Vuelo {
    String numeroVuelo;
    String fecha;
    String horaSalida;
    String horaLlegada;
    String destino;
    String tipoAvionn;
    int puestoss;

    public Vuelo(String numeroVuelo, String fecha, String horaSalida, String horaLlegada, String destino, String tipoAvion, int puestos) {
        this.numeroVuelo = numeroVuelo;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.destino = destino;
        this.tipoAvionn = tipoAvion;
        this.puestoss = puestos;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }



    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoAvion() {
        return tipoAvionn;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvionn = tipoAvion;
    }

    public int getPuestos() {
        return puestoss;
    }

    public void setPuestos(int puestos) {
        this.puestoss = puestos;
    }
    
}
