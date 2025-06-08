package collection;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementDate;
    private int size = 0;

    public MyArrayListV1(){
        elementDate = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementDate = new Object[initialCapacity];
    }
    public int size() {
        return size;
    }

    public void add(Object e) {
        elementDate[size] = e;
        size++;
    }

    public Object get(int index) {
        return elementDate[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementDate[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementDate[i])) {
                return i;
            }
        }
        return -1;
    }
    public String toString() {
        // [1,2,3,null,null] // size = 3
        // [1,2,3] // size = 3
//        return Arrays.toString(elementDate);
        return Arrays.toString(Arrays.copyOf(elementDate, size)) +
                "size = " + size + ", capacity = " + elementDate.length;
    }
}
