package Chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise15
{
    /*
    Write a method maxOccurrences that accepts a list of integers as a parameter
     and returns the number of times the most frequently occurring integer (the “mode”)
      occurs in the list. Solve this problem using a map as auxiliary storage. If the list is empty, return 0.
     */

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(2);



        System.out.println(maxOccurrences(list));
    }

    public static Integer maxOccurrences(ArrayList<Integer> list)
    {
        Integer occurrence = 0;
        Integer mode = 0;
        Map<Integer, Integer> storage = new HashMap<>();

        if(list.size() == 0)
        {
            return mode;
        }

        for (int i = 0; i < list.size() ; i++)
        {
            for (int j = 0; j < list.size() ; j++)
            {
                if(list.get(i) == list.get(j))
                {
                    occurrence++;
                }
            }

            storage.put(list.get(i),occurrence);
            occurrence = 0;

        }
        for (Map.Entry<Integer, Integer> m: storage.entrySet())
        {
            if(m.getValue() > mode)
            {
                mode = m.getValue();
            }
        }

        return mode;
    }

}
