import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[10];

        for(int i=0; i<10; i++){
            num[i] = sc.nextInt();
        }

        int sum = num[2] + num[4] + num[9];
        System.out.println(sum);
    }
}