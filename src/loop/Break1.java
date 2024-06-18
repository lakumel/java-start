package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

//        while(true){
//      //while만 있을 경우 무한 반복을 한다.
//        }

        while(true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
