import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();

        String[] word = new String[n];
        for(int i=0; i<n; i++){
            word[i] = sc.nextLine();
        }

        Arrays.sort(word);

        int cnt = 0;
        for(int i=0; i<n; i++){
            if(word[i].indexOf(T) == 0){
                cnt++;
            }
            if(cnt == k){
                System.out.print(word[i]);
            }
        }
    }
}