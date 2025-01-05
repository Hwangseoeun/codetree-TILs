import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N];

        for(int i=0; i<K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j=A; j<=B; j++) {
                list[j-1] += 1;
            }
        }

        Arrays.sort(list);

        System.out.println(list[N-1]);
    }
}