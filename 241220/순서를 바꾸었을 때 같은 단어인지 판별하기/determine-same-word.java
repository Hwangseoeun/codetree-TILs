import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        char[] listA = A.toCharArray();
        char[] listB = B.toCharArray();

        Arrays.sort(listA);
        Arrays.sort(listB);

        if(compareWordSize(listA, listB) && compareList(listA, listB)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }

    public static boolean compareWordSize(char[] A, char[] B){
        if(A.length != B.length){
            return false;
        }

        return true;
    }

    public static boolean compareList(char[] A, char[] B){
        for(int i=0; i<A.length; i++){
            if(A[i] != B[i]){
                return false;
            }
        }

        return true;
    }
}