import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        for(int i=0; i<N; i++){
            if(list.get(i)%3==0){
                System.out.println(list.get(i));
            }
        }
    }
}