import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String title = askForTitle();
        String directorName = askForDirectorName();
        boolean isPorno = askIsPorno();


        Film peliculas = new Film(title,directorName,isPorno);
        printFilm(peliculas);
    }

    private static void printFilm(Film peliculas) {
        System.out.println("El títol de la peli es: " + peliculas.getTitle() );
        System.out.println("El nom del director es: " + peliculas.getDirectorName() );
        System.out.println("Porno: " + printBoolean(peliculas.isPorno()));

    }
    private static String printBoolean(boolean value) {
        if (value) return "Sí";
        return "No";
    }

    private static boolean askIsPorno() {
        System.out.println(" La peli es porno? S/N");
        Scanner sc = new Scanner(System.in);
        String text=sc.nextLine();

        if (text.equals("S")){

            return true;


        }


        return false;
    }

    private static String askForDirectorName() {
        System.out.println("Indica el nom del director: ");
        Scanner sc = new Scanner(System.in);
        String text=sc.nextLine();
        return text;

    }

    private static String askForTitle() {
        System.out.println("Indica el títol de la peli: ");
        Scanner sc = new Scanner(System.in);
        String text=sc.nextLine();
        return text;

    }


}
