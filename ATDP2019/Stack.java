import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> myData;

    public Stack() {
        myData = new ArrayList<T>(10000);
    }

    public void push(T pushMe) {
        myData.add(pushMe);
    }

    public T peek() {
        if (myData.size() == 0)
            return null;
        return myData.get(myData.size() - 1);
    }

    public T pop() {
        if (myData.size() == 0)
            return null;
        return myData.remove(myData.size() - 1);
    }
}
