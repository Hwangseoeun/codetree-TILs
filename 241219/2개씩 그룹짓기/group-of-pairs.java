import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int size = 2*N;

        int[] num = new int[size];

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        int[] sumList = new int[size/2];
        for(int i=0; i<size/2; i++){
            sumList[i] = num[i] + num[size-1-i];
        }

        Arrays.sort(sumList);

        System.out.print(sumList[size/2-1]);
    }
}