public class Main {
    public static void main(String[] args) {
        // Primera parte
        int numeroIf = 10;
        if (numeroIf > 0) {
            System.out.println("numeroIf es mayor que cero");
        } else if (numeroIf < 0) {
            System.out.println("numeroIf es menor que cero");
        } else {
            System.out.println("numeroIf es igual que cero");
        }

        // Segunda parte
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // Tercera parte
        numeroWhile = 2;
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        // Cuarta parte
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Quinta parte
        String estacion = "otoño";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en " + estacion);
                break;
            case "otoño":
                System.out.println("Estamos en " + estacion);
                break;
            case "invierno":
                System.out.println("Estamos en " + estacion);
                break;
            case "verano":
                System.out.println("Estamos en " + estacion);
                break;
            default:
                System.out.println("No corresponde a una estación válida");
                break;
        }

    }
}
