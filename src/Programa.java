import java.util.Scanner;

public class Programa {
    public void pajamosMetodas (){ // Metodas
        System.out.println("Įveskite pajamas");

        Scanner scanner = new Scanner(System.in);
        String pajamos = scanner.nextLine();

        System.out.println("Sveiki, įvedėte pajamas: " + pajamos);
    }
}