/**
 * Created by Ben Maxwell on 1/31/17.
 * Established constructor, setters, and getters for this class
 */
public class Vehicle {

    String make;
    String model;
    int year;
    String type; //i.e. sedan, truck, SUV, and etc.
    String color;
    int numPass; //number of passengers
    double price; //current price of vehicle

    public Vehicle(String make, String model, int year, String type, String color, int numPass, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.type = type;
        this.color = color;
        this.numPass = numPass;
        this.price = price;
    }

    //Creates getter for make
    public String getMake() {
        return make;
    }

    //Creates setter for make
    public void setMake(String make) {
        this.make = make;
    }
    //Creates getter for model
    public String getModel() {
        return model;
    }

    //Creates setter for model
    public void setModel(String model) {
        this.model = model;
    }

    //Creates getter for year
    public int getYear() {
        return year;
    }

    //Creates setter for year
    public void setYear(int year) {
        this.year = year;
    }

    //Creates getter for vehicle type
    public String getType() {
        return type;
    }

    //Creates setter for type
    public void setType(String type) {
        this.type = type;
    }

    //Creates getter for color
    public String getColor() {
        return color;
    }

    //Creates setter for color
    public void setColor(String color) {
        this.color = color;
    }

    //Creates getter for passengers
    public int getNumPass() {
        return numPass;
    }

    //Creates setter for passengers
    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

    //Creates getter for price
    public double getPrice() {
        return price;
    }

    //Creates setter for price
    public void setPrice(double price) {
        if(price < 20000) {
            System.out.println("Price is too cheap to advertise");
        } else {
            this.price = price;
        }
    }


    public static void main(String[] args) {


    }


}
