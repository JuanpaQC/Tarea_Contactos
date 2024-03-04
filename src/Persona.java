public class Persona {

    private String nombre;
    private int edad;
    private int cedula;

    public Persona(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + ", Edad: " + edad
                + ", Cedula: " + cedula;
    }
}
