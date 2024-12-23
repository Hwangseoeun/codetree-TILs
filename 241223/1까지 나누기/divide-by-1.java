import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        for(int i=1; i<=5000; i++){
            if(n/i == 0){
                System.out.print(cnt+1);
                break;
            }
            else{
                n = n/i;
                cnt++;
                continue;
            }
        }
    }
}