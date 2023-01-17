public class Main {
    public static void main(String[] args) {
        int numerolf = 3;

        if (numerolf > 0 ){
            System.out.print("Positive");
        }else if (numerolf > 0){
            System.out.print("negative");
        }else{
            System.out.print(0);
        }

        int numeroWhile = 1;

        while (numeroWhile < 3) {
            System.out.print(numeroWhile);
            numeroWhile++;
        }

        do{
            numeroWhile = numeroWhile + 1;
            System.out.print(numeroWhile);
        }while(numeroWhile < 3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.print(numeroFor);
        }
        var estación = "Invierno";

        switch (estación){
            case "Invierno":
                System.out.print("Es Invierno");
                break;
            case "Primavera":
                System.out.print("Es Primavera");
                break;
            case "Verano":
                System.out.print("Es Verano");
                break;
            case "Otoño":
                System.out.print("Es Otoño");
                break;
            default:
                System.out.println("No es una estación");

        }




    }
}
