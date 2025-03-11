import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int aLen = 1, bLen = 1;
        int[] A = new int[1000000];
        int[] B = new int[1000000];

        A[0] = 0;
        B[0] = 0;

        for(int i=0; i<N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for(int j=aLen; j<aLen+t; j++) {
                A[j] = A[j-1] + v;
            }

            aLen += t;
        }

        // for(int i=0; i<aLen; i++) {
        //     System.out.print(A[i] + " ");
        // }
        // System.out.println();

        for(int i=0; i<M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for(int j=bLen; j<bLen+t; j++) {
                B[j] = B[j-1] + v;
            }

            bLen += t;
        }

        // for(int i=0; i<bLen; i++) {
        //     System.out.print(B[i] + " ");
        // }
        // System.out.println();

        boolean[] head = new boolean[aLen];
        head[0] = true;
        for(int i=1; i<aLen; i++) {
            if(A[i]>B[i]) {
                head[i] = head[0];
            }
            else if(A[i]<B[i]) {
                head[i] = !head[0];
            }
            else {
                head[i] = head[i-1];
            }    
        }

        int cnt = 0;
        for(int i=1; i<aLen; i++) {
            if(i!=1 && head[i-1] != head[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}