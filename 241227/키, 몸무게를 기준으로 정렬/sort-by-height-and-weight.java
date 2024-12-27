import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] people = new Person[n];
        for(int i=0; i<n; i++) {
            people[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(people, (a1, a2) -> {
            if(a1.height != a2.height) {
                return a1.height - a2.height;
            }
            else {
                return a2.weight - a1.weight;
            }
        });

        for(int i=0; i<n; i++) {
            System.out.println(people[i].name + " " + people[i].height + " " + people[i].weight);
        }
    }
}

class Person {
    String name;
    int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}