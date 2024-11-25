import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printNum(N);
    }

    public static void printNum(int N){
        if(N == 0){
            return;
        }

        System.out.print(N + " ");
        printNum(N-1);
        System.out.print(N + " ");
    }
}