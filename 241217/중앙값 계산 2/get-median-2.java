import java.util.*;

public class Main {

    static int num[], modNum[], n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        printMidNum();
    }

    public static void inputList(int idx){
        modNum = new int[n];

        for(int i=0; i<=idx; i++){
            modNum[i] = num[i];
        }

        sort(idx);
    }

    public static void sort(int idx){
        for(int i=0; i<idx; i++){
            for(int j=i+1; j<=idx; j++){
                if(modNum[i]>modNum[j]){
                    int temp = modNum[i];
                    modNum[i] = modNum[j];
                    modNum[j] = temp;
                }
            }
        }
    }

    public static void printMidNum(){
        for(int i=0; i<n; i++){
            if(i%2==0){
                inputList(i);
                System.out.print(modNum[i/2] + " ");
            }
        }
    }
}
