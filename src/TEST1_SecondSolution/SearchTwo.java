package TEST1_SecondSolution;
import java.util.Scanner;
public class SearchTwo
{


    public static int Two(char ch)
    {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < charArray.length; i++)
        {
            if (i != 0) {
                if (charArray[i] == ch) continue;//ddddee
                if (charArray[i] == charArray[i - 1])
                {
                    count++;
                    if (count == 2) {
                        count1++;
                        count = 0;
                        ch = charArray[i];
                    }
                } else
                {
                    count = 0;//aabb

                }
            }
        }
     return count1;
    }
}
