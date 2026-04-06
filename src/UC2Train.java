import java.util.*;

public class UC2Train {
    public static void main(String[] args){

        System.out.println("=========================================================");
        System.out.println("==============Train-Consist-Management-App===============");
        System.out.println("=========================================================");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println();
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : "+passengerBogies);

        System.out.println();
        passengerBogies.remove("AC Chair");
        System.out.println("After removing 'AC Chair':");
        System.out.println("Passenger Bogies : "+passengerBogies);

        System.out.println();
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : "+passengerBogies.contains("Sleeper"));

        System.out.println();
        System.out.println("Final Train Passenger Consist:\n"+passengerBogies);

        System.out.println();
        System.out.println("Train initialized successfully...");
    }
}
