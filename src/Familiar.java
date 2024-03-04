public class Familiar extends Contacto{

    private String parentezco;

    public Familiar(String n, int e, int c, int telefono, String parentezco) {
        super(n,e,c,telefono);
        this.parentezco = parentezco;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }


    @Override
    public String toString() {
        return "Familiar: " + parentezco
                + ", " + super.toString();
    }
}
