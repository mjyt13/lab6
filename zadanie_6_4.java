import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;
public class zadanie_6_4 {
    public static void main(String[] args) {
        Scanner W4 =new Scanner(System.in);
        out.println("введите десятичную дробь, чья целая часть равна нулю");
        double x = W4.nextDouble();
        int i=0;
        if(floor(x)!=0){
            while (floor(x)!=0){
                out.println("ошибка: целая часть числа должна быть равна нулю");
                out.println("введите число ещё раз");
                x = W4.nextDouble();
            }
        }
        out.println("Введите основание системы счисления");
        int N = W4.nextInt();
        if(N<2 || N>10){
            while(N<2 || N>10){
                out.println("ошибка: основание системы счисления должно быть в диапазоне от 2 до 10");
                out.println("введите основание системы счисления ещё раз");
                N=W4.nextInt();
            }
        }
        if(x-floor(x)==0 & N>=2 & N<=10){
            out.print("Ответ: 0");
        }else{
            out.print("Ответ: 0.");
            while(x>0 & i!=20){
                x=x*N;
                out.print((int)floor(x));
                x=x-floor(x);
                i++;
                if (i==20){
                    out.println("");
                    out.println("Достигнута погрешность 10^(-20)");
                    break;
                }
            }
        }
    }
}
