import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;
        int aver = sum/3;
        int result = sum-aver;

        System.out.println(sum);
        System.out.println(aver);
        System.out.println(result);
    }
}