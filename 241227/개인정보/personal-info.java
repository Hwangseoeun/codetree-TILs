import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[5];
        for(int i=0; i<5; i++) {
            people[i] = new Person(sc.next(), sc.nextInt(), sc.nextFloat());
        }

        System.out.println("name");
        Arrays.sort(people, Comparator.comparing(a -> a.name));
        for(int i=0; i<5; i++) {
            System.out.println(people[i].name + " " + people[i].height + " " + String.format("%.1f", people[i].weight));
        }

        System.out.println();

        System.out.println("height");
        Arrays.sort(people, (a1, a2) -> a2.height - a1.height);
        for(int i=0; i<5; i++) {
            System.out.println(people[i].name + " " + people[i].height + " " + String.format("%.1f", people[i].weight));
        }
    }
}

class Person {
    String name;
    int height;
    float weight;

    public Person(String name, int height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}