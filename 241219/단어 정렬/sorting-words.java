import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] word = new String[n];
        for(int i=0; i<n; i++){
            word[i] = sc.next();
        }

        Arrays.sort(word);

        for(int i=0; i<n; i++){
            System.out.println(word[i]);
        }
    }
}