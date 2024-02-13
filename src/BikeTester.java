import java.util.ArrayList;

// "BikeTester" class
public class BikeTester {
    public static void main(String[] args) {
        //create object bike1 using no argument constructor
        Bike bike1 = new Bike();

        //Print for bike1
        System.out.println(bike1);

        //Create object bike2 in same manner
        Bike bike2 = new Bike();

        //setter methods to change instance variable values of bike2
        bike2.setNumberOfWheels(3);
        bike2.setManufacturer("Jay");
        bike2.setYear(2023);

        //Print for bike2
        System.out.println(bike2);

        //create an ArrayList for bikes called bikeList
        ArrayList<Bike> bikeList = new ArrayList<>();

        //add bike1 and bike2 to list
        bikeList.add(bike1);
        bikeList.add(bike2);

        //Print the bikeList
        System.out.println("Bike List: " + bikeList);

        //count total number of wheels on all bikes in the bikeList
        int totalWheels = 0;
        for (Bike bike : bikeList) {
            totalWheels += bike.getNumberOfWheels();
        }

        //printing total number of wheels
        System.out.println("Total number of wheels on all of bikes: " + totalWheels);

        //Find year of the oldest bike in the list
        int oldestYear = Integer.MAX_VALUE;
        for (Bike bike : bikeList) {
            if (bike.getYear() < oldestYear) {
                oldestYear = bike.getYear();
            }
        }

        //print year of the oldest bike
        System.out.println("Year of the oldest bike in list: " + oldestYear);
    }
}