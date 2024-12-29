import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int first = (11*24*60)+(11*60)+11;
        int second = (a*24*60)+(b*60)+c;

        if(second < first) {
            System.out.println(-1);
        }
        else {
            System.out.println(second - first);
        }
    }
}