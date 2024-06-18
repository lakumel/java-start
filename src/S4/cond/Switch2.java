package S4.cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 1;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);

        int car = 2;

        int coupon2;
        switch (car){
            case 1:
            coupon2 = 1000;
            break;
            case 2:
                coupon2 = 2000;
                break;
            case 3:
                coupon2 = 3000;
                break;
            default:
                coupon2 = 500;
        }

        System.out.println("발급 받은 쿠폰 " + coupon2);



    }
}
