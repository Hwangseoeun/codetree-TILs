import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Number[] nums = new Number[N];
        for(int i=0; i<N; i++) {
            nums[i] = new Number(sc.nextInt(), i+1, 0);
        }

        Arrays.sort(nums, (a1,a2) -> {
            if(a1.num != a2.num) {
                return a1.num - a2.num;
            }
            else {
                return a1.rank - a2.rank;
            }
        });

        for(int i=0; i<N; i++) {
            nums[i].updatedRank = i+1;
        }

        Arrays.sort(nums, (a1,a2) -> a1.rank - a2.rank);

        for(int i=0; i<N; i++) {
            System.out.print(nums[i].updatedRank + " ");
        }
    }
}

class Number {
    int num, rank, updatedRank;

    public Number(int num, int rank, int updatedRank) {
        this.num = num;
        this.rank = rank;
        this.updatedRank = updatedRank;
    }
}