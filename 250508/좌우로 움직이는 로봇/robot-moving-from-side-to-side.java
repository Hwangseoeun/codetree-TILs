import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[2000000];
        int[] B = new int[2000000];

        int N = sc.nextInt();
        int M = sc.nextInt();

        int aIdx = 0, bIdx = 0, aLen = 0, bLen = 0;
        A[0] = 0;
        B[0] = 0;

        for(int i=0; i<N; i++) {
            int t = sc.nextInt();
            String d = sc.next();

            for(int j=aIdx+1; j<=aIdx+t; j++) {
                if(d.equals("L")) {
                    A[j] = --aLen;
                }
                else {
                    A[j] = ++aLen;
                }
            }

            aIdx += t;
        }

        for(int i=0; i<M; i++) {
            int t = sc.nextInt();
            String d = sc.next();

            for(int j=bIdx+1; j<=bIdx+t; j++) {
                if(d.equals("L")) {
                    B[j] = --bLen;
                }
                else {
                    B[j] = ++bLen;
                }
            }

            bIdx += t;
        }

        for(int i=aIdx; i<A.length; i++) {
            A[i] = A[aIdx];
        }

        for(int i=bIdx; i<B.length; i++) {
            B[i] = B[bIdx];
        }

/*
        for(int i=0; i<=aIdx+3; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        for(int i=0; i<=bIdx+3; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
*/

        int cnt = 0;

        for(int i=1; i<Math.max(aIdx, bIdx); i++) {
            if(A[i-1]!=B[i-1] && A[i]==B[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}