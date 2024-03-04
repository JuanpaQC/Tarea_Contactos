public class Personales extends Contacto {
    private String direccion;

    public Personales(String n, int e, int c, int telefono, String direccion) {
        super(n, e, c, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Personales: " + direccion + ", " + super.toString();
    }

}
