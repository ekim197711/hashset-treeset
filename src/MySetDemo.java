import java.util.ArrayList;
import java.util.HashSet;

public class MySetDemo {

    public static void main(String[] args) {
        ArrayList<String> myStrings = new ArrayList();
        myStrings.add("one");
        myStrings.add("ten");
        myStrings.add("ten");
        myStrings.add("twenty");
        myStrings.add("fourty");
        myStrings.add("fourty");
        myStrings.add("fourty");
        myStrings.add("fifty");
        myStrings.add(null);
        for (String s : myStrings){
            System.out.println("element: " + s);
        }

        HashSet<String>  hs = new HashSet<>(myStrings);
        hs.remove("ten");
//        hs.clear();
        for (String h : hs) {
            System.out.println(h);
        }
        System.out.println(hs.isEmpty());


    }
}
