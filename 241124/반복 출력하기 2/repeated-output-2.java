import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printWord(N);
    }

    public static void printWord(int N){
        if(N == 0){
            return;
        }

        printWord(N-1);
        
        System.out.println("HelloWorld");
    }
}