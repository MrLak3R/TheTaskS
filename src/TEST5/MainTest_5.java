package TEST5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class MainTest_5 {
    public static void main(String[] args) {
        System.out.println("ввести предложение");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        String[] strings = input.split(" ");

        Comparator<String> comparator = Comparator.comparingInt(s -> StringTestClass.getCount.apply(s));

        List<String> stringList = Arrays.asList(strings);

        stringList.sort(comparator.reversed());

        for (String s: stringList){
            System.out.println(StringTestClass.findFirstVocal(s)+", количество гласных: "+StringTestClass.getCount.apply(s));
        }
    }
}
