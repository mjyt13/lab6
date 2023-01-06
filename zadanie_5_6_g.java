import java.util.Scanner;

import static java.lang.System.out;

public class zadanie_5_6_g {
    public static void main(String[] args) {
        Scanner N6 = new Scanner(System.in);
        out.println("Хотите ли вы проверить попадание точки в область?");
        String b = N6.next();
        if(b.equals("да")||b.equals("Да")) {
            while(b.equals("да")||b.equals("Да")){
                out.println("Введите координаты точки для проверки, попала ли точка в закрашенную область фигуры");
                double x = N6.nextDouble();
                double y = N6.nextDouble();
                oblast T = new oblast();
                if (T.oblast(x, y)) {
                    out.println("Точка попала в закрашенную часть фигуры");
                } else {
                    out.println("Точка не попала в закрашенную часть фигуры");
                }
                out.println("Хотите ли вы проверить попадание точки в область?");
                b=N6.next();
            }
            out.println("Хорошо, вычисления окончены");
        }else if(b.equals("нет")||b.equals("Нет")){
            out.println("Принято, процесс не стартует");
        }else{
            out.println("Введенный ответ недопустим, запустите программу ещё раз");
        }
    }
}

