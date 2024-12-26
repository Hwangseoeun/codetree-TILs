import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        People[] person = new People[n];
        for(int i=0; i<n; i++){
            person[i] = new People(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(person, Comparator.comparing(a -> a.height));

        for(int i=0; i<n; i++){
            System.out.println(person[i].name + " " + person[i].height + " " + person[i].weight);
        }
    }
}

class People {
    String name;
    int height, weight;

    public People(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}