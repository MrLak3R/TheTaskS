package TEST2;
import java.util.Scanner;

public class MainTest_2 {
    public static void main(String[] args)
    {
        System.out.println("ввести строку");
        Scanner scanner = new Scanner(System.in);
        String data;

        data = scanner.nextLine();
        System.out.println("строка=" + data);

       // SumNumbers sumNumbers = new SumNumbers();
        int sum =SumNumbers.sumDigits(data);
        if(sum==0)
        {
            System.out.println("нет чисел в строке сумма=0");
        }else
        {
            System.out.println("сумма чисел в строке: " +sum);
        }
    }
}
