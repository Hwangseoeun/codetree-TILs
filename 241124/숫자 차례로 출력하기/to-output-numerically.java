import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ascending(N);
        System.out.println();
        decending(N);
    }

    public static void ascending(int N){
        if(N == 0){
            return;
        }

        ascending(N-1);
        System.out.print(N + " ");
    }

    public static void decending(int N){
        if(N == 0){
            return;
        }

        System.out.print(N + " ");
        decending(N-1);
    }
}