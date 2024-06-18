package loop;

public class While2_2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum = sum + i;//2
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum = sum + i;//3
        System.out.println("i=" + i + " sum=" + sum);
    }
}
