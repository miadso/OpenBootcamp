public class EjerciciosTema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(26);
        persona.setNombre("Estefania");
        persona.setTelefono(317647);

        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();
        System.out.println(edad + "," + telefono+ "," + nombre);



    }
}

    class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setTelefono(int   telefono){
            this.telefono = telefono;
        }
        public int getEdad(){
            return this.edad;
        }
        public String getNombre(){
            return this.nombre;
        }
        public int getTelefono(){
            return this.telefono;
        }
    }
