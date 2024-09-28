import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numList = new Integer[5];
        
        for(int i=0; i<5; i++){
            numList[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<5; i++){
            if(numList[i]%2==0){
                count++;
            }
        }

        System.out.print(count);
    }
}