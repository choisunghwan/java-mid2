package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementDate;
    private int size = 0;

    public MyArrayListV4(){
        elementDate = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementDate = new Object[initialCapacity];
    }
    public int size() {
        return size;
    }

    public void add(E e) {
        if (size == elementDate.length) {
            grow();
        }
        elementDate[size] = e;
        size++;
    }

    // 코드 추가
    public void add(int index, Object e) {
        if (size == elementDate.length) {
            grow();
        }

        //데이터 이동
        shiftRightFrom(index);
        elementDate[index] = e;
        size++;
    }

    // 코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementDate[i] = elementDate[i - 1];
        }
    }

    //코드 추가
    public E remove(int index) {
        E oldValue = get(index);
        //데이터 이동
        shiftLeftFrom(index);

        size--;
        elementDate[size] = null;
        return oldValue;

    }

    //코드 추가 요소의 index 부터 마지막 까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementDate[i] = elementDate[i + 1];
        }
    }

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


    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementDate[index];
    }

    public E set(int index, Object element) {
        E oldValue = get(index);
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
