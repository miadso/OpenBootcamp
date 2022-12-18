public class Main {
    public static void main(String[] args) {
        int numeroIf = 5;

        if (numeroIf == 0){
            System.out.println("Es igual a cero");
        }
        else if (numeroIf < 0){
            System.out.println("Es menor a cero");
        }
        else if (numeroIf > 0){
            System.out.println("Es mayor a cero");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        int numeroDowhile = 0;
        do {
            numeroDowhile++;
            System.out.println(numeroDowhile);
        }while (numeroDowhile < 1);

        for (int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }
        String estacion = "Invierno";
        switch (estacion){
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
            default:
                System.out.println("No es una estacion");
        }
    }
}
