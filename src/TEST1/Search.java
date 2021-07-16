package TEST1;

public class Search {
    public static int SearchForRepetition(String line)
    {

        int l = line.length();
        int n = 0;
        for (int i = 0; i < l-2; i++) {
            char tmp = line.charAt(i);
            if (tmp == line.charAt(i+1) && tmp == line.charAt(i+2))
                n++;
        }
        return n;
    }

}
