import java.util.*;

class primebetween {

    public static void main(String[] args) {

        int flag = 0;

        System.out.println("Enter any number two number: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println();

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("All prime Number between "+ min + " and " + max);
        

        for (int k = min; k <= max; k++) {

            flag = 0;

            for (int i = 2; i <= (int) Math.sqrt(k); i++) {
                if (k % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(k + " ");
            }
        }
    }
}
