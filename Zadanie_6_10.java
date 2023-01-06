import static java.lang.Math.*;
import static java.lang.System.*;
public class Zadanie_6_10 {
    public static void main(String[] args) {
        double a=1, b=2;
        double fB=0 ,x = 0, S, f0=0, f1=0, f;
        double fA =((6*pow(cos(2),3)+16*pow(cos(2),3)+21*cos(2)+32)*sin(2)+8*pow(2,3)+21*2)/24.0-(((6*pow(cos(1),3)+16*pow(cos(1),3)+21*cos(1)+32)*sin(1)+8*pow(1,3)+21*1)/24.0);
        for(double n=10;n<=10000;n=n*10){
            double h=(b-a)/n;
            S=0;
            for(int i=1;i<=n;i++){
                if(i>1){
                    double j=i-0.5;
                    f1=pow(a+(b-a)*h*j,2)+pow(cos(a+(b-a)*h*j)+pow(cos(a+(b-a)*h*j),2),2);
                }else{
                    f1=0;
                }
                f0=pow(a+(b-a)*h*(i-1),2)+pow(cos(a+(b-a)*h*(i-1))+pow(cos(a+(b-a)*h*(i-1)),2),2);
                f=pow(a+(b-a)*h*i,2)+pow(cos(a+(b-a)*h*i)+pow(cos(a+(b-a)*h*i),2),2);
                S+=(h/6.0)*(f0+4*f1+f);
            }
            fB=abs(fA-S);
            out.println(" n="+n+" h="+h+" S= "+S+ " Аналитическое решение= "+fA+" Погрешность= "+fB);
        }
    }
}
