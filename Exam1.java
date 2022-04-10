
import java.util.HashSet;
import java.util.Iterator;

public class Exam1
{
    public static void main(String[]args)
    {
        HashSet<Integer> c=new HashSet();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(4);
        Iterator<Integer> itr=c.iterator();
        System.out.println("final result of hashset after giving the same values:");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
