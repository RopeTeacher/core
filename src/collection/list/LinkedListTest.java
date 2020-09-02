package collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Car");
        a.add("Erica");

        LinkedList<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doog");
        b.add("Frances");
        b.add("Gloria");

        //merge the words from a into b
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()){
            if(aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);
    }


}
