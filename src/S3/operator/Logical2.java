package S3.operator;

public class Logical2 {

    public static void main(String[] args) {
        int a = 15;
        int b=30;
        //int c = 50;
        //a는 10보다 크고 20보다 작다
        //두 연산자가 모두 참이여야 true로 반환이 된다. 둘중 하나라도 거짓이면 false로 반환
//        boolean result = a > 10 && a < 20; //(a > 10) && (a < 20)
        boolean result = 10 < a && a < 20; //(a > 10) && (a < 20)
        System.out.println("result = " + result);

        //b는 40보다 크고 60보다 작다
        //반면 두 피연산자중 하나라도 참이면 true로 반환한다.
        boolean result2= 40< b||b<60;   //조건 b<60은 항상 true이기에 true로 도달이 된다.
        System.out.println("result2 = " + result2);



    }
}
