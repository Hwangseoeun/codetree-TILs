import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] num = new int[N];

        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        int[] sumList = new int[N/2];
        for(int i=0; i<N; i++){
            for(int j=0; j<N/2; j++){
                sumList[j] = num[i] + num[N-1-i];
            }
        }

        Arrays.sort(sumList);

        System.out.print(sumList[N/2-1]);
    }
}