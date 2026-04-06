import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UC4Train {
    public static void main(String[] args){

        System.out.println("=========================================================");
        System.out.println("==============Train-Consist-Management-App===============");
        System.out.println("=========================================================");

        List<String> trainConsist = new LinkedList<>();

        trainConsist.addLast("Engine");
        trainConsist.addLast("Sleeper");
        trainConsist.addLast("AC");
        trainConsist.addLast("Cargo");
        trainConsist.addLast("Guard");

        System.out.println();
        System.out.println("Initial Train Consist:\n"+trainConsist);

        trainConsist.add(2,"Pantry Car");

        System.out.println();
        System.out.println("After Inserting 'Pantry Car' at Position 2:\n"+trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println();
        System.out.println("After Removing First And Last Bogie:\n"+trainConsist);

        System.out.println("\nTrain initialized successfully...");
    }
}