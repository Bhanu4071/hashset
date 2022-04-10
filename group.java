import java.util.HashSet;
import java.util.Iterator;

public class group {
    public static void main(String[]args)
    {
        HashSet<Integer>  a =new HashSet<Integer>();
        a.add(1);
        a.add(1);
        a.add(100);
        a.add(101);
        a.add(102);
        a.add(103);
        a.add(100);
        a.add(101);
        a.add(111);
        a.add(222);
        a.add(333);
        a.add(444);

        Iterator <Integer> itr=a.iterator();
        while(itr.hasNext())
        {

            System.out.println(itr.next());
        }










    }
}
