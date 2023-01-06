import static java.lang.System.*;
import static java.lang.Math.*;
public class zadanie_6_3 {
    public static void main(String[] args) {
        double s=0;double p=1;double ps=1;
        double s1=0;double p1=1; double p2=1; double ps1=0; double ps2=0; double ps3=0;
        for (int i=1;i<=8;i++){
            for(int j=1;j<=i;j++){
                s1+=pow(log(j)+log(i),2);
            }
            s+=s1;
            s1=0;
        }
        out.println(s);
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                p2=pow(j,log(i+1));
                p1*=p2;
            }
            p*=p1;
            p1=1;
        }
        out.println(p);
        for(int i=1;i<=8;i++){
            for(int j=i;j<=(2*i)-1;j++){
                for(int k=i+j;k<=2*(i+j);k++){
                    ps3=2*sin(j)-3*cos(i-(0.5)*k);
                    ps2+=ps3;
                }
                ps1+=ps2;
                ps2=0;
            }
            ps*=ps1;
            ps1=0;
        }
        out.println(ps);
    }
}
