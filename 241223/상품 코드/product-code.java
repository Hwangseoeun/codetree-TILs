import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Object object1 = new Object();
        Object object2 = new Object(sc.next(), sc.nextInt());

        System.out.println("product " + object1.code + " is " + object1.name);
        System.out.println("product " + object2.code + " is " + object2.name);
    }
}

class Object {
    String name;
    int code;

    public Object() {
        this.name = "codetree";
        this.code = 50;
    }
    
    public Object(String name, int code) {
        this.name = name;
        this.code = code;
    }
}