import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        String result = "Y";
        for(int i=0; i<n; i++){
            if(A[i] != B[i]){
                result = "N";
                break;
            }
            else{
                result = "Y";
                continue;
            }
        }
        
        if(result == "Y"){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}