package collection;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("==데이터 추가 ===");

        System.out.println(list);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);


        System.out.println("==기능 추가 ===");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));

    }
}
