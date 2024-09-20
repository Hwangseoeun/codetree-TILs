import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double cal = (double) (a+b)/(a-b);

        String result = String.format("%.2f", cal);

        System.out.print(result);
    }
}