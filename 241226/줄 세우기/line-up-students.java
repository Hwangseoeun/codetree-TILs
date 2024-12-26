import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Person[] people = new Person[N];
        for(int i=0; i<N; i++) {
            people[i] = new Person(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(people, (a1, a2) -> {
            if(a1.height != a2.height) {
                return a2.height - a1.height;
            }
            else if(a1.weight != a2.weight) {
                return a2.weight - a1.weight;
            }
            else {
                return a1.number - a2.number;
            }
        });

        for(int i=0; i<N; i++) {
            System.out.println(people[i].height + " " + people[i].weight + " " + people[i].number);
        }
    }
}

class Person {
    int height, weight, number;

    public Person(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }
}