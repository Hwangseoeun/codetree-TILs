import java.util.*;

public class Main {
    static int num[];
    static int n, result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        
        findResult();
        System.out.print(result);
    }

    public static int findGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return findGCD(b, a%b);
    }

    public static int findLCM(int a, int b){
        return a*b/findGCD(a,b);
    }

    public static void findResult(){
        result = num[0];
        for(int i=1; i<n; i++){
            result = findLCM(result, num[i]);
        }
    }
}
