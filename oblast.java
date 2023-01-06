
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class oblast {
    public static boolean oblast(double x, double y) {
        int i = 0;
        if (x >= -6 & x <= -4) {
            double y1 = -sqrt(36 - pow(x, 2)), y2 = 0;
            if (y >= y1 & y <= y2) {
                i++;
            }
        }
        if (x >= -4 & x <= -3) {
            double y1 = -sqrt(36 - pow(x, 2)), y2 = -3 * x - 12;
            if (y >= y1 & y <= y2) {
                i++;
            }
        }
        if (x >= -3 & x <= -1) {
            double y1 = -sqrt(36 - pow(x, 2)), y2 = (3 / 4.0) * x - (3 / 4.0);
            if (y >= y1 & y <= y2) {
                i++;
            }
        }
        if (x >= -1 & x <= 1) {
            double y1 = -sqrt(36 - pow(x, 2)), y2 = (3 / 4.0) * x - (3 / 4.0), y3 = -sqrt(1 - pow(x, 2)) - 3, y4 = sqrt(1 - pow(x, 2)) - 3, y5 = sqrt(4 - pow(x - 1, 2)) - 3, y6 = -sqrt(4 - pow(x - 1, 2)) - 3;
            if ((y >= y1 & y <= y6) || (y >= y3 & y <= y4) || (y >= y5 & y <= y2)) {
                i++;
            }
        }
        if (x >= 1 & x <= 3) {
            double y1 = -sqrt(36 - pow(x, 2)), y2 = -sqrt(4 - pow(x - 1, 2)) - 3, y3 = sqrt(4 - pow(x - 1, 2)) - 3, y4 = -sqrt(1 - pow(x - 2, 2)) - 3, y5 = sqrt(1 - pow(x - 2, 2)) - 3, y6 = -x + 1;
            if ((y >= y1 & y <= y2) || (y >= y4 & y <= y5) || (y >= y3 & y <= y6)) {
                i++;
            }
        }
        if (x >= 3 & x <= 4) {
            double y1 = -sqrt(36 - pow(x, 2)), y2 = -x + 1;
            if (y >= y1 & y <= y2) {
                i++;
            }
        }
        if (x >= 4 & x <= 6) {
            double y1 = -sqrt(36 - pow(x, 2)), y2 = 0;
            if (y >= y1 & y <= y2) {
                i++;
            }
        }
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }
}



