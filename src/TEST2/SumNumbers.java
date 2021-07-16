package TEST2;

public class SumNumbers
{
    public static int sumDigits(String str)
    {

        int count = 0;
        char[] data = str.toCharArray();

        for (int i = 0; i < data.length; ++i) {
            if (Character.isDigit(data[i])) {
                count += Integer.parseInt(String.valueOf(data[i]));
            }
        }

        return count;
    }
}
