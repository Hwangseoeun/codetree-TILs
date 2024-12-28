import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Student[] students = new Student[N];
        for(int i=0; i<N; i++) {
            students[i] = new Student(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(students, (a1,a2) -> {
            if(a1.height != a2.height) {
                return a1.height - a2.height;
            }
            else {
                return a2.weight - a1.weight;
            }
        });

        for(int i=0; i<N; i++) {
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].number);
        }
    }
}

class Student {
    int height, weight, number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }
}