import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] n = sc.next().split("");

        int[] dig = new int[n.length];

        for(int i=0; i<n.length; i++) {
            dig[i] = Integer.parseInt(n[i]);
        }

        int sum = 0;
        for(int i=0; i<dig.length; i++) {
            sum = sum * a + dig[i];
        }

        int[] resultDig = new int[23];
        int cnt = 0;
        while(true) {
            if(sum<b) {
                resultDig[cnt++] = sum%b;
                break;
            }

            resultDig[cnt++] = sum%b;
            sum /= b;
        }

        for(int i=cnt-1; i>=0; i--) {
            System.out.print(resultDig[i]);
        }
    }
}