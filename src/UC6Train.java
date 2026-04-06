import java.util.*;

public class UC6Train {
    public static void main(String[] args){

        System.out.println("=========================================================");
        System.out.println("==============Train-Consist-Management-App===============");
        System.out.println("=========================================================");

        Map<String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        System.out.println();
        System.out.println("Bogie Capacity Details:");
        System.out.println("First Class -> "+capacityMap.get("First Class"));
        System.out.println("Cargo -> "+capacityMap.get("Cargo"));
        System.out.println("Sleeper -> "+capacityMap.get("Sleeper"));
        System.out.println("AC Chair -> "+capacityMap.get("AC Chair"));

        System.out.println();
        System.out.println("Train initialized successfully...");
    }
}