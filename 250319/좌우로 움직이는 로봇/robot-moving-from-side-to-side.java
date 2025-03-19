import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int ALen = 0, BLen = 0, ATime = 0, BTime = 0;
        int[] A = new int[1000000];
        int[] B = new int[1000000];

        for(int i=0; i<N; i++) {

            int t = sc.nextInt();
            String d = sc.next();

            for(int j=ATime; j<ATime+t; j++) {
                if(d.equals("L")) {
                    ALen--;
                }
                else {
                    ALen++;
                }

                A[j] = ALen;
            }

            ATime += t;
        }

        for(int i=0; i<M; i++) {

            int t = sc.nextInt();
            String d = sc.next();

            for(int j=BTime; j<BTime+t; j++) {
                if(d.equals("L")) {
                    BLen--;
                }
                else {
                    BLen++;
                }

                B[j] = BLen;
            }

            BTime += t;
        }

        // for(int i=0; i<BTime; i++) {
        //     System.out.print(A[i]+" ");
        // }
        // System.out.println();
        
        // for(int i=0; i<BTime; i++) {
        //     System.out.print(B[i]+" ");
        // }
        // System.out.println();
        
        boolean[] same = new boolean[Math.max(ATime,BTime)];
        for(int i=0; i<Math.max(ATime,BTime); i++) {
            if(A[i] == B[i]) {
                same[i] = true;
            }
            else if(i>=Math.min(ATime,BTime) && A[i]==0 && A[ATime-1] == B[i]){
                same[i] = true;
            }
            else if(i>=Math.min(ATime,BTime) && B[i]==0 && B[BTime-1] == A[i]) {
                same[i] = true;
            }
            else {
                same[i] = false;
            }
        }

        int cnt = 0;
        for(int i=1; i<same.length; i++) {
            if(same[i-1] != same[i] && same[i] == true) {
                cnt++;
            }
        }

        // for(int i=0; i<same.length; i++) {
        //     System.out.print(same[i]+" ");
        // }
        // System.out.println();

        System.out.println(cnt);
    }
}