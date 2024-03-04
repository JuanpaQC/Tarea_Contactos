public class Empresarial extends Contacto{
    private String correo;
    private String empresa;

    public Empresarial(String n, int e, int c, int telefono, String correo, String empresa) {
        super(n, e, c, telefono);
        this.correo = correo;
        this.empresa = empresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    @Override
    public String toString() {
        return "Empresarial: " + correo + ", " + empresa + ", " + super.toString();
    }
}
