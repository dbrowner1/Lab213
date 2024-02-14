/**
 * Class: 2150 ITEC
 * * @author D'Quavious Browner
 * * @version 1.0
 * * Course: ITEC 2150 Fall 2024
 * * Written: feb 12, 2024
 * *
 * * This class
 */
import java.util.ArrayList;
public class Bike {
    //instance variables
    private int numberOfWheels;
    private String manufacturer;
    private int year;

    // No argument constructor
    public Bike() {
        this.numberOfWheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
    }

    // Parameter constructor
    public Bike(int numberOfWheels, String manufacturer, int year) {
        this.numberOfWheels = numberOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    // Getters "3"
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    //setters "3"
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method override
    @Override
    public String toString() {
        return "Bike's info: Number of Wheels = " + numberOfWheels + ", manufacturer = " + manufacturer + ", year = " + year;
    }
}
