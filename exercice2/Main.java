
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        org.example.exercice2.Film un = new org.example.exercice2.Film("La Haine", "Matthieu Kassovitz", LocalDate.of(1995,05,31), "Drame");
        org.example.exercice2.Film deux = new org.example.exercice2.Film("Avatar 2", "James Cameron", LocalDate.of(2022,12,14), "Action");

        System.out.println(deux.toString());
        System.out.println(un.toString());

        un.afficher();

    }

}