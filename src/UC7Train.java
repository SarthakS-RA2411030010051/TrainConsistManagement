import java.util.*;

public class UC7Train {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args){

        System.out.println("=========================================================");
        System.out.println("==============Train-Consist-Management-App===============");
        System.out.println("=========================================================");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Cargo", 120));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println();
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        bogies.sort(Comparator.comparingInt(b->b.capacity));
        System.out.println();

        System.out.println("After Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println();
        System.out.println("Train initialized successfully...");
    }
}