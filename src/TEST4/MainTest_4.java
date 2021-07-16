package TEST4;

import java.util.Scanner;

public class MainTest_4 {
    public static void main(String[] args) {
        System.out.println("ввести целое число");
        int x=0;
        Scanner scanner = new Scanner(System.in);
        try
        {
            x=scanner.nextInt();
        }catch (Exception e)
        {
            System.out.println("число не  целое");
        }

        System.out.println("число которое разложили="+Decomposition.factor(x));

    }
}
