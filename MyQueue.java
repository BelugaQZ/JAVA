import java.util.Iterator;
import java.util.LinkedList;

public class MyQueue {
    LinkedList<Integer> arr = new LinkedList<Integer>();

    Integer dequeue(){
        return arr.poll();
    }


    void enqueue(Integer item){
        arr.add(item);
    }

    Integer first(){
        return arr.peek();
    }

    public Integer sum() {
        Iterator<Integer> iterator = arr.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            sum += element;
        }
        return sum;
    }
}
