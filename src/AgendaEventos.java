import java.util.LinkedList;

public class AgendaEventos {

    private LinkedList<Eventos> listacontactos;

    public AgendaEventos() {
        this.listacontactos = new LinkedList<Eventos>();
    }

    public void agregarEvento(String lugar, String fecha, String hora, String motivo) {
        this.listacontactos.add(new Eventos(lugar, fecha, hora, motivo));
    }

    public void imprimirLista(){
        for (Eventos evento : listacontactos) {
            System.out.println("Lista de eventos en la agenda: ");
            System.out.println("\n"+evento);
        }
    }
}
