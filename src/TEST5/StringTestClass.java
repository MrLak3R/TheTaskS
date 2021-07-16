package TEST5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;


public class StringTestClass {
    public static String findFirstVocal(String s)
    {
        StringBuilder fin = new StringBuilder();
        char[] array = s.toCharArray();
        boolean count = false;
        for (int i = 0; i < array.length; i++)
        {

            if (!count)
            {
                if (array[i] == 'а' || array[i] == 'е' || array[i] == 'у' || array[i] == 'ы' ||
                        array[i] == 'о' || array[i] == 'я' || array[i] == 'ё' ||
                        array[i] == 'э' || array[i] == 'и' || array[i] == 'ю')
                {

                    fin.append(Character.toUpperCase(array[i]));
                    count = true;
                }
                else
                {
                    fin.append(array[i]);
                }
            }
            else
            {
                fin.append(array[i]);
            }
        }
        return fin.toString();
    }

    public static Function<String, Integer> getCount = new Function<String, Integer>()
    {
        // коллекция содержащая гласные буквы
        private Set<Character> set = new HashSet<>(Arrays.asList('а', 'е', 'у', 'ы', 'о', 'я', 'ё', 'э', 'и', 'ю'));

        @Override
        public Integer apply(String s)
        {
            int count = 0;
            for (int i = 0; i < s.length(); i++)
                count += set.contains(s.charAt(i)) ? 1 : 0;

            return count;
        }
    };
}

