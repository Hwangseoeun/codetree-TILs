import java.util.*;

public class Main {

    public static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[200];
        for(int i=0; i<n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            x1 += OFFSET;
            x2 += OFFSET;

            for(int j=x1; j<x2; j++) {
                list[j] += 1;
            }
        }

        Arrays.sort(list);

        System.out.println(list[199]);
    }
}