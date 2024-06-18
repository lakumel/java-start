package S3.operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); //둘이 같지 않다.
        System.out.println(a != b); //둘이 같지 않기에 true
        System.out.println(a > b);  //b가 크기에 false
        System.out.println(a < b);  //b가 크기에 true
        System.out.println(a >= b); //b가크기에 false
        System.out.println(a <= b); //b가 큰게 맞기에 true

        //결과를 boolean 변수에 담을
        boolean result = a == b;        //둘이 같지 않기에 값 result는 항상 false이다.
        System.out.println(result);
    }
}
