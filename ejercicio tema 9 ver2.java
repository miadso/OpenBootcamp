public class ejercicioTema9 {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setTelefono(345667);
        cliente.setNombre("pepe");
        cliente.setCredito(100.000);
        int clienteEdad = cliente.getEdad();
        int clienteTelefono = cliente.getTelefono();
        double clienteCredito = cliente.getCredito();
        String clienteNombre = cliente.getNombre();
        System.out.println(clienteNombre);
        System.out.println(clienteEdad);
        System.out.println(clienteCredito);
        System.out.println(clienteTelefono);
        System.out.println("______________________________________________________");
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(45);
        trabajador.setTelefono(5465577);
        trabajador.setSalario(78837483);
        trabajador.setNombre("luigi");
        int trabajadorEdad = trabajador.getEdad();
        int trabajadorTelefono = trabajador.getTelefono();
        int trabajadorSalario = trabajador.getSalario();
        String trabajadorNombre = trabajador.getNombre();
        System.out.println(trabajadorNombre);
        System.out.println(trabajadorTelefono);
        System.out.println(trabajadorEdad);
        System.out.println(trabajadorSalario);




    }
   static class Persona{
      private  int edad;
      private  String nombre;
      private  int telefono;

      public void setEdad(int edad){
          this.edad = edad;

      }
      public void setNombre(String nombre){
          this.nombre = nombre;

      }
      public void setTelefono(int telefono){
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
     static class Cliente extends Persona{
        private double credito;

        public void setCredito(double credito){
            this.credito = credito;
        }
        public double getCredito(){
            return this.credito;
        }

    }
     static class Trabajador extends Persona{
        private int salario;

        public void setSalario(int salario){
            this.salario = salario;
        }
        public int getSalario(){
            return this.salario;
        }
    }
}
