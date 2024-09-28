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

    public static boolean hasNumber(int num){
        String[] strNumArray = new String[7];
        strNumArray = Integer.toString(num).split(""); 
    
        for(int i=0; i<strNumArray.length; i++){
            if(strNumArray[i].equals("3") || strNumArray[i].equals("6") || strNumArray[i].equals("9")){
                return true;
            }
        }

        if(multiple(num)){
            return true;
        }

        return false;
    }

    public static boolean multiple(int num){
        return num%3==0;
    }
}