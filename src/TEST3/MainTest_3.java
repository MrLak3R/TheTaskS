package TEST3;

import java.util.Scanner;
import java.util.Scanner;
import java.lang.Math;

public class MainTest_3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x1,x2,y1,y2; // кординаты
        int x0,y0,x,y; // точки
        System.out.println("ввести кординаты точки А(x,y)");
        x = scanner.nextInt(); //x1
        y = scanner.nextInt(); //y1
        System.out.println("ввести кординаты точки B(x,y)");
        x0 = scanner.nextInt(); //x2
        y0 = scanner.nextInt();  //y2
        x1 = (x0-x); y1 = (y0 - y); // кординаты вектора AB
        x2 = (x-x0); y2 = (y - y0); // кординаты BA
        double AB,BA;
        //длина вектора AB BA
        AB = Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
        BA = Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));
        System.out.println("Длина вектора AB("+x1+y1+")="+AB);
        System.out.println("Длина вектора BA("+ x2+ y2+")="+BA);
        // произведение векторов
        // c = |ab| * |ba| * cos(a);
        double a;
        a = (x1*x2+y1*y2)/(AB+BA); //cos(a)
        double pov1, pov2;
        pov1 = Math.abs(AB)*Math.abs(BA)*a;
        pov2 = Math.abs(BA)*Math.abs(AB)*a;
        System.out.println("Произведение вектора AB*BA="+pov1);
        System.out.println("Произведение вектора BA*AB="+pov2);
    }
}
