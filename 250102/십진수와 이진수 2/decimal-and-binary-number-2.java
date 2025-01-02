import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] N = sc.nextLine().split("");
        int[] digNum = new int[N.length];

        for(int i=0; i<N.length; i++) {
            digNum[i] = Integer.parseInt(N[i]);
        }

        int sum = 0;
        for(int i=0; i<digNum.length; i++) {
            sum = sum * 2 + digNum[i];
        }

        sum *= 17;

        int[] resultDigit = new int[41];
        int cnt = 0;
        while(true) {
            if(sum<2) {
                resultDigit[cnt++] = sum%2;
                break;
            }

            resultDigit[cnt++] = sum%2;
            sum /= 2;
        }

        for(int i=cnt-1; i>=0; i--) {
            System.out.print(resultDigit[i]);
        }
    }
}