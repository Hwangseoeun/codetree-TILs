import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int start = A*60 + B;
        int end = C*60 + D;

        int time = end - start;

        System.out.println(time);
    }
}