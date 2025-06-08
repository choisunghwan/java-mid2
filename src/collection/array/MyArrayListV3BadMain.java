package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 numberlist = new MyArrayListV3();


        //숫자만 입력 하기를 기대
        numberlist.add(1);
        numberlist.add(2);
        numberlist.add("문자3"); //문자를 입력
        System.out.println(numberlist);

        // Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer)numberlist.get(0);
        Integer num2 = (Integer)numberlist.get(1);


        // ClassCaseException 발생, 문자를 Integer로 캐스팅
        Integer num3 = (Integer)numberlist.get(2);
    }

}
