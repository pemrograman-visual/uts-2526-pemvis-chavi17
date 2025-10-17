//12S25056-Arauna Bagas Manurung
//12S25055-Marissa Silalahiimport java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        double nr, total, maks, min;
        double[] ns = new double[4];

        total = 0;
        for (i = 0; i <= 3; i++) {
            System.out.println("Masukkan nilai ke-" + i + 1 + ":");
            ns[i] = Double.parseDouble(input.nextLine());
            total = total + ns[i];
        }
        nr = total / 4;
        maks = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] > maks) {
                maks = ns[i];
            }
        }
        min = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] < min) {
                min = ns[i];
            }
        }
        System.out.println("Nilai rata-rata:" + nr);
        System.out.println("Nilai tertinggi:" + maks);
        System.out.println("Nilai terendah:" + min);
    }
}
