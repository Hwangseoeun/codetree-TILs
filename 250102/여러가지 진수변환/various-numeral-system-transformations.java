import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] dig = new int[4];
        int cnt = 0;
        while(true) {
            if(N<B) {
                dig[cnt++] = N%B;
                break;
            }

            dig[cnt++] = N%B;
            N/=B;
        }

        for(int i=cnt-1; i>=0; i--) {
            System.out.print(dig[i]);
        }
    }
}