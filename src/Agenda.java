import java.util.LinkedList;
public class Agenda {
    private LinkedList<Contacto> listacontactos;


    public Agenda() {
        this.listacontactos = new LinkedList<Contacto>();
    }

    public void agregarContactoFamiliar(String n, int e, int c,  int telefono, String parentezco) {
        this.listacontactos.add(new Familiar(n,e,c,telefono, parentezco));
    }

    public void agregarContactoEmpresa(String n, int e, int c,  int telefono, String empresa, String correo) {
        this.listacontactos.add(new Empresarial(n,e,c,telefono, empresa, correo));
    }

    public void agregarContactoPersonales(String n, int e, int c,  int telefono, String direccion) {
        this.listacontactos.add(new Personales(n,e,c,telefono, direccion));
    }


    public void imprimirLista(){
        for (Contacto contacto : listacontactos) {
            System.out.println("Lista de contactos en la agenda: ");
            System.out.println("\n"+contacto);
        }
    }


}
