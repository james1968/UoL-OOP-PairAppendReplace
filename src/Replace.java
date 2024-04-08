import java.util.ArrayList;

public class Replace<T> {
    T obj;
    ArrayList<T> arr;
    Replace() {
        this.arr = new ArrayList<T>();
    }
    ArrayList<T> replace(ArrayList<T> arr, T obj1, T obj2) {
        if (obj1 == null) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == null) {
                    arr.set(i, obj2);
                }

            }
        } else {
            for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i).equals(obj1)) {
                        arr.set(i, obj2);
                    }
                }
            }
        return arr;
    }
}
