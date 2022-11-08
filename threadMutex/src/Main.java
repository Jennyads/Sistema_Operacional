public class Main {
    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("INICIANDO COMPETIÇÃO BRASILEIRA DE NATAÇÃO!!!");
        System.out.println("==================================================");

        Nadador nadador1 = new Nadador("Xuxa");
        Nadador nadador2 = new Nadador("Gustavo Borges");
        Nadador nadador3 = new Nadador("Cielo");

        nadador1.start();
        nadador2.start();
        nadador3.start();


    }
}