import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] day = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};

        int result = 0;
        if(m1 != m2) {
            for(int i=m1; i<m2; i++) {
                result += day[i];
            }

            result = result - d1 + d2 + 1;
        }
        else {
            result = d2 - d1;
        }

        System.out.println(result);
    }
}