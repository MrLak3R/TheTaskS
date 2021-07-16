package TEST6;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        String line;
        line = scanner.nextLine();

        Control control = new Control();
        control.creator(line);

    }

}
