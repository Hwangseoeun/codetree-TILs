import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] num = new int[n];
        for(int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<n; i++) {
            if(i%2!=0) {
                sum += num[i];
            }
        }
        
        float avg = (float)sum/(n/2);

        System.out.print(sum + " " + String.format("%.1f", avg));
    }
}