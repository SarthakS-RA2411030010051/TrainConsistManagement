import java.util.*;

public class UC3Train {
    public static void main(String[] args){

        System.out.println("=========================================================");
        System.out.println("==============Train-Consist-Management-App===============");
        System.out.println("=========================================================");

        Set <String> bogies = new HashSet<>();

        System.out.println();
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        //Duplicate Entry is ignored by HashSet
        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println("Bogie IDs after insertion:\n"+bogies);

        System.out.println();
        System.out.println("Note:\nDuplicates are automatically ignored by HashSets.");

        System.out.println();
        System.out.println("Train initialized successfully...");
    }
}
