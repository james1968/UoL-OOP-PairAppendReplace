import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tests of Pair
        Pair p = new Pair("Hello", "World");
        System.out.println(p.getObj1(p.arr));
        System.out.println(p.getObj2(p.arr));
        System.out.println(p.containedIn("Hello", p.arr));
        System.out.println(p.containedIn("Hell", p.arr));
        Pair r = new Pair("Two", 10);
        System.out.println(r.getObj1(r.arr));
        System.out.println(r.getObj2(r.arr));
        System.out.println(r.containedIn(5, r.arr));
        System.out.println(r.containedIn(10, r.arr));
        System.out.println(r.containedIn("Two", r.arr));
        System.out.println();
        // Test for Append
        Append a = new Append();
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add("hello");
        arr1.add("world");
        arr2.add(5);
        arr2.add(10);
        System.out.println(a.append(arr1, arr2));
        System.out.println();
        // Tests for Replace
        Replace t = new Replace();
        t.arr.add("Hello");
        t.arr.add("World");
        t.arr.add(5);
        t.arr.add(10);
        System.out.println(t.arr);
        System.out.println(t.replace(t.arr, "Hello", 6));
        System.out.println(t.replace(t.arr, 5, "SeeYa"));

        Replace s = new Replace();
        s.arr.add("Hello");
        s.arr.add(null);
        s.arr.add(5);
        s.arr.add(10);
        System.out.println(s.arr);
        System.out.println(s.replace(s.arr, null, 6));
        System.out.println(s.replace(s.arr, 10, 3));
    }
}