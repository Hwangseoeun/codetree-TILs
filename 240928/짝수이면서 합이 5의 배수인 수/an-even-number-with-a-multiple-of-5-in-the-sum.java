import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        if(judgeNumber(n)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }

    public static boolean judgeNumber(String n){
        String[] num = n.split("");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);

        int sum = a+b;

        if(Integer.parseInt(n)%2==0 && sum%5==0){
            return true;
        }
        else{
            return false;
        }
    }
}