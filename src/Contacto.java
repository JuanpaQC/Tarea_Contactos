public class Contacto {

        private int telefono;

        private Persona person;

        public Contacto(String n, int e, int c,int telefono) {
            this.person = new Persona(n, e, c);
            this.telefono = telefono;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return "Telefono: " + telefono
                    + ", " + person;
        }

}
