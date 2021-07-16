package TEST1;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class MainTest_1
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        String line =  scanner.nextLine();

        Search search = new Search();
        System.out.println("Заданная сторока: " + line);
        System.out.println("Количество \"троек\" в заданной строке: " + Search.SearchForRepetition(line));
    }
}
