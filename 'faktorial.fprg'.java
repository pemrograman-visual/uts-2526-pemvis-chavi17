//12S25056-Arauna Bagas Manurung
//12S25055-Marissa Silalahi
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bilangan, faktorial, i;

        System.out.println("Masukkan bilangan");
        bilangan = Integer.parseInt(input.nextLine());
        faktorial = 1;
        i = 1;
        while (i <= bilangan) {
            faktorial = faktorial * i;
            i = i + 1;
        }
        System.out.println("hasil faktorial=" + faktorial);
    }
}
