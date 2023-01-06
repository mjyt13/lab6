import java.util.*;

import static java.lang.System.*;
import static java.lang.Math.*;
public class zadanie_6_2 {
    public static void main(String[] args) {
        Scanner W2 = new Scanner(System.in);
        out.println("введите натуральное число");
        long I = W2.nextInt();
        long i=I;
        long min = 1111111111;
        long k=0,s=1;
        while(i>0){
            if(i%10<min){
                min=(i%10);
            }
            i/=10;
        }
        while(I>0){
            if(I%10==min){
                k+=1;
            }
            I/=10;
        }
        for(int n=1;n<=k;n++){
            s=s*n;
        }
        out.println("ответ "+s);
    }
}
