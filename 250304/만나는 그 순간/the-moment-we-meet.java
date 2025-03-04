import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] NList = new int[1000000];
        int[] MList = new int[1000000];
        int cnt = 0, idx = 0, Nlen = 0, Mlen = 0, len = 0;

        for(int i=0; i<N; i++) {
            String d = sc.next();
            int b = sc.nextInt();

            if(d.equals("L")) {
                for(int j=idx; j<idx+b; j++) {
                    cnt--;
                    NList[j] = cnt;
                }
            }
            else {
                for(int k=idx; k<idx+b; k++) {
                    cnt++;
                    NList[k] = cnt;
                }
            }

            idx += b;
        }

        Nlen = idx;

        cnt = 0;
        idx = 0;

        for(int i=0; i<M; i++) {
            String d = sc.next();
            int b = sc.nextInt();

            if(d.equals("L")) {
                for(int j=idx; j<idx+b; j++) {
                    cnt--;
                    MList[j] = cnt;
                }
            }
            else {
                for(int k=idx; k<idx+b; k++) {
                    cnt++;
                    MList[k] = cnt;
                }
            }

            idx += b;
        }

        Mlen = idx;

        if(Nlen >Mlen) {
            len = Nlen;
        }
        else {
            len = Mlen;
        }

        boolean type = false;
        for(int i=0; i<len; i++) {
            if(NList[i] == MList[i]) {
                type = true;
                System.out.println(i+1);
                break;
            }
        }

        if(type == false) {
            System.out.println("-1");
        }
    }
}