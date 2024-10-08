package example;

import java.util.*;


public class Buffer {
    private Queue<Integer> queueNumbers;

    public Buffer() {
        queueNumbers = new LinkedList<>();
    }

    public void put(int number) {
        queueNumbers.add(number);
    }

    public int get() {
        return queueNumbers.poll();
    }

    public boolean isEmptyQueue() {
        return queueNumbers.isEmpty();
    }
}
