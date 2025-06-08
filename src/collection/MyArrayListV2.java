package collection;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementDate;
    private int size = 0;

    public MyArrayListV2(){
        elementDate = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementDate = new Object[initialCapacity];
    }
    public int size() {
        return size;
    }

    public void add(Object e) {
        //코드 추가
        if (size == elementDate.length) {
            grow();
        }
        elementDate[size] = e;
        size++;
    }

    //코드 추가
    private void grow() {
        int oldCapacity = elementDate.length;
        int newCapacity = oldCapacity * 2;
        elementDate = Arrays.copyOf(elementDate, newCapacity);
        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
/*        Object[] newArr = new Object[newCapacity];

        for (int i = 0; i < elementDate.length; i++) {
            newArr[i] = elementDate[i];
        }*/

        /*Object[] newArr = Arrays.copyOf(elementDate, newCapacity);
        elementDate = newArr;*/
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
