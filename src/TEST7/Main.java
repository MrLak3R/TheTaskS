package TEST7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Напиток Non-stop", 3, 800));
        items.add(new Item("Антирадиационный препорад", 1, 700));
        items.add(new Item("Аптечка", 2, 300));
        items.add(new Item("Армейская аптечка", 2, 400));
        items.add(new Item("болт", 1, 10));
        items.add(new Item("Велес", 5, 3000));
        items.add(new Item("Сева", 8, 7000));
        items.add(new Item("Гром-С14", 7, 4500));

        System.out.println("ввести размер сейфа");
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();

        Safe safe = new Safe(x);
        safe.makeAllSets(items);
        System.out.println(items);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(safe.getBestItems());

    }

}
