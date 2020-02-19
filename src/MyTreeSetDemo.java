import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>((s1, s2) ->{
           int diff =  s1.length() - s2.length();
           if (diff == 0)
               return s1.compareTo(s2);
           else
               return diff;
        });

        ts.add("one");
        ts.add("seventy");
        ts.add("fifty");
        ts.add("two");
        ts.add("hundred");
        ts.add("sixty");
        for (String t : ts) {
            System.out.println(t);
        }


        TreeSet<Integer> myintts = new TreeSet<>();
        myintts.add(10);
        myintts.add(100);
        myintts.add(40);
        myintts.add(70);
        myintts.add(20);
        myintts.add(90);
        myintts.add(35);
        Integer floor = myintts.floor(75);
        Integer ce = myintts.ceiling(75);
        System.out.println("Floor value = " + floor);
        System.out.println("Ceiling value = " + ce);
        Integer pollla = myintts.pollLast();
        Integer last = myintts.last();
        System.out.println("Poll last = " + pollla);
        System.out.println("last = " + last);

        for (Integer myintt : myintts) {
            System.out.println("After polling " + myintt);
        }
        Iterator<Integer> integerIterator = myintts.descendingIterator();
        while (integerIterator.hasNext()){
            Integer next = integerIterator.next();
            System.out.println("Desc " + next);
        }
    }
}
