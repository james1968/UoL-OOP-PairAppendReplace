import java.util.ArrayList;

public class Append<E> {
    ArrayList<E> append(ArrayList<E> arr1, ArrayList<E> arr2) {
        for (E item: arr2) {
            arr1.add(item);
        }
        return arr1;
    }
}
