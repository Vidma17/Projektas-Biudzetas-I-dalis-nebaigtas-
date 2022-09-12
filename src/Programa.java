import java.util.Scanner;

public class Programa {
    public void pajamosMetodas (){ // Metodas1
        System.out.println("\n" + "Įveskite pajamas:");

        Scanner scanner = new Scanner(System.in);
        String pajamos = scanner.nextLine();

        System.out.println("Jūsų įvestos pajamos: " + pajamos + "\n");
    }

    public void islaidosMetodas (){ // Metodas
        System.out.println("Įveskite išlaidas:");

        Scanner scanner = new Scanner(System.in);
        String islaidos = scanner.nextLine();

        System.out.println("Jūsų įvestos išlaidos: " + islaidos);
    }
}