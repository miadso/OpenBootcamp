public class ejercicioTema9 {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.telefono = 345654;
        cliente.nombre = "Pepe";
        cliente.credito = 100.000;
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.nombre);
        System.out.println(cliente.credito);
        System.out.print("______________________________________________________");
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 34;
        trabajador.telefono = 8767563;
        trabajador.salario = 1234567;
        trabajador.nombre = "Luigi";
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.salario);




    }
   static class Persona{
        int edad;
        String nombre;
        int telefono;

    }
     static class Cliente extends Persona{
        double credito;

    }
     static class Trabajador extends Persona{
        int salario;
    }
}
