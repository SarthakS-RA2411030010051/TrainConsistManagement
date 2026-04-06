import java.util.LinkedHashSet;
import java.util.Set;

public class UC5Train {
    public static void main(String[] args){

        System.out.println("=========================================================");
        System.out.println("==============Train-Consist-Management-App===============");
        System.out.println("=========================================================");

        Set <String> formation = new LinkedHashSet<>();

        System.out.println();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        //Duplicate Entry is ignored by HashSet
        formation.add("Engine");
        formation.add("Sleeper");

        System.out.println("Final Train Formation:\n"+ formation);

        System.out.println();
        System.out.println("Note:\nDuplicates are automatically ignored by LinkedHashSets.");

        System.out.println();
        System.out.println("Train initialized successfully...");
    }
}
