import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Set;

public class ch11_10a
{
    /*Write a method removeOddLength that accepts a set of strings as a parameter and that removes all of the strings of
    odd length from the set.*/

    public void run()
    {
        Set<String> set = new HashSet<>();
        set.add("kage");
        set.add("lagkage");
        set.add("slikepind");
        set.add("is");
        set.add("trækage");
        set.add("sodavand");
        set.add("chips");

        System.out.println(removeOddLength(set));
    }

    public Set<String> removeOddLength(Set<String> set)
    {
        try
        {
            for (String string: set)
            {
                if (string.length()%2 != 0)
                {
                    set.remove(string);
                    removeOddLength(set);
                }
            }
        }catch (ConcurrentModificationException CMe)
        {
            return set;
        }
        return set;
    }
}
