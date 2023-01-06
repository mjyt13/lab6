import static java.lang.System.*;

public class zadanie_6_7 {
    public static void main(String[] args) {
        double i, j, z;
        for (i = 1.0; i <= 9.0; i++) {
            for (j = 1.0; j <= 9.0; j++) {
                z = i / j;
                out.printf((int)i+"/"+(int)j+"=%.4f", z);
                out.print("   ");
            }
            out.println();
        }
    }
}
