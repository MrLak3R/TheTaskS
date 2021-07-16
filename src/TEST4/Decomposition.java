package TEST4;

public class Decomposition {
    public static int factor(int x){
        double sqrt = Math.sqrt(x);
        int currentValue = x;
          int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt)
        {
            if (currentValue % multiplier == 0)
            {
                System.out.println("простой множитель="+multiplier + " ");
                currentValue /= multiplier;
            }
            else if (multiplier == 2)
            {
                multiplier++;
            }
            else
            {
                multiplier += 2;
            }
        }
        if (currentValue != 1)
        {
            System.out.print(currentValue);
        }
        return x;
    }
}
