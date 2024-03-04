public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        AgendaEventos agendaEventos = new AgendaEventos();
        agenda.agregarContactoFamiliar("Agustin Quesada", 56, 208440370, 83439013, "Papa");
        agenda.agregarContactoEmpresa("Ana Luz", 32, 2020384294, 74382342, "Golabs", "Luzana@labs.go.cr");
        agenda.agregarContactoPersonales("Nahum Murillo", 20 , 2023845754, 98432728, "San Jose, Costa Rica");

        agendaEventos.agregarEvento("Revision de proyecto con Ana Luz", "22/01/2024", "14:00", "Reunion de trabajo");
        agendaEventos.agregarEvento("Casa de Agustin Quesada", "23/03/2024", "18:00", "Cumpleaños de Papa");

        agenda.imprimirLista();

        agendaEventos.imprimirLista();
    }
}
