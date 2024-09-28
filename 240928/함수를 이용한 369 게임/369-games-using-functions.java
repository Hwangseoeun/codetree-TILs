import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;

        for(int i=a; i<=b; i++){
            if(hasNumber(i)){
                count++;
            }
        }

        System.out.print(count);
    }

    public static boolean hasNumber(int i){
        String[] strNumArray = Integer.toString(i).split(""); 
    
        List<String> num = Arrays.asList(strNumArray);

        if(num.contains("3") || num.contains("6") || num.contains("9") || multiple(i)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean multiple(int i){
        if(i%3==0){
            return true;
        }
        else{
            return false;
        }
    }
}