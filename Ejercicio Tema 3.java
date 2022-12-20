    public class Main {
        public static void main(String[] args) {
          Coche miCoche = new Coche();
          miCoche.PonerPuertas();
          miCoche.PonerPuertas();
          miCoche.PonerPuertas();
          miCoche.PonerPuertas();
          System.out.println("Mi coche tiene " + miCoche.puertas + " puertas");
        int resultado;
        resultado = suma(15,25, 45);
        System.out.println("El resultado es " + resultado);
    }
    //Primera parte del ejercicio
        public static int suma(int a, int b, int c){
        return a + b + c;
    }
     static class Coche {
        public int puertas = 0;
        public void PonerPuertas() {
            this.puertas++;
        }

    }
}
