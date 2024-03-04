public class Eventos {

    private String lugar;
    private String fecha;
    private String hora;
    private String motivo;

    public Eventos(String lugar, String fecha, String hora, String motivo) {
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        motivo = motivo;
    }


    @Override
    public String toString() {
        return "Eventos: " + lugar + ", " + fecha + ", " + hora + ", " + motivo;
    }
}
