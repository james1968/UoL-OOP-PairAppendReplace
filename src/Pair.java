import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pair<E> {
    E obj1;
    E obj2;
    ArrayList<E> arr;
    Pair( E obj1, E obj2 ) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.arr = new ArrayList<E>();
        this.arr.add(this.obj1);
        this.arr.add(this.obj2);
    }

    E getObj1(ArrayList arr) {
        return this.arr.get(0);
    }

    E getObj2(ArrayList arr) {
        return this.arr.get(1);
    }

    boolean containedIn(E obj, ArrayList arr) {
        if (getObj1(arr).equals(obj) || getObj2(arr).equals(obj)) {
            return true;
        } else {
            return false;
        }
    }
}
