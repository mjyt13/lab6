import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;
public class zadanie_6_9 {
    public static void main(String[] args) {
        Scanner Y9 = new Scanner(System.in);
        out.println("введите аргумент корня");
        double x = Y9.nextDouble();
        out.println("введите степень корня");
        double p = Y9.nextInt();
        out.println("введите значение для итерационной процедуры");
        double y=0,y0=Y9.nextDouble();
        if(y0<exp(log(x*(p+1))/p)){
            double y1=y0;
            y=0;
            for(double e=0.01;e>=0.000001;e=e*0.1){
                int i=0, i0=0;
                y0=y1;
                while(abs(y0-y)>e){
                    y=y0;
                    i0=i;
                    y0=(((p-1)*y0+(x/pow(y0,p-1)))/p);
                    i++;
                }
                out.println("точность "+e+" корень "+y+" Число итераций "+i0);
            }
        }else{
           out.println("значение корня для введенных значений вычислить невозможно");
           out.println("введите аргумент корня");
           x = Y9.nextDouble();
           out.println("введите степень корня");
           p = Y9.nextInt();
           out.println("введите значение для итерационной процедуры");
           y0=Y9.nextDouble();
           while ((y0>=exp(log(x*(p+1))/p))){
               out.println("значение корня для введенных значений вычислить невозможно");
               out.println("введите аргумент корня");
               x = Y9.nextDouble();
               out.println("введите степень корня");
               p = Y9.nextInt();
               out.println("введите значение для итерационной процедуры");
               y0=Y9.nextDouble();
           }
            double y1=y0;
            y=0;
            for(double e=0.01;e>=0.000001;e=e*0.1) {
                int i = 0, i0 = 0;
                y0 = y1;
                while (abs(y0 - y) > e) {
                    y = y0;
                    i0 = i;
                    y0 = (((p - 1) * y0 + (x / pow(y0, p - 1))) / p);
                    i++;
                }
                out.println("точность " + e + " корень " + y + " Число итераций " + i0);
            }
        }
    }
}
