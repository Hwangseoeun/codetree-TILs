import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        String result = String.format("%.2f", a+1.5);

        System.out.print(result);
    }
}