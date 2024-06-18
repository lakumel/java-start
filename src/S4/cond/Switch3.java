package S4.cond;

public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);

        //break문이 없으면 어떻게 되는지 확인하기 위한 조건으로 없을 경우
        //그냥 3천원 쿠폰을 줘버린다.
    }
}
