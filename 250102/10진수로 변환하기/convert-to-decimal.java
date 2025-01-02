import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dig = sc.nextLine().split("");
        int[] digNum = new int[dig.length];

        for(int i=0; i<dig.length; i++) {
            digNum[i] = Integer.parseInt(dig[i]);
        }

        int sum = 0;
        for(int i=0; i<digNum.length; i++) {
            sum = sum*2 + digNum[i];
        }

        System.out.println(sum);
    }
}