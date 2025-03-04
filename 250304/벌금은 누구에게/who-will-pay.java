import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] student = new int[N+1];
        student[0] = 0;

        boolean fine = false;

        for(int i=0; i<M; i++) {
            int num = sc.nextInt();

            student[num]++;
            if(student[num] == K) {
                fine = true;
                System.out.println(num);
            }
        }

        if(fine == false) {
            System.out.println("-1");
        }
    }
}