class Vehicle{
    private final String make;
    private final String model;
    final int  year;

    public Vehicle(String mk, String md, int yr){
        this.make = mk;
        this.model = md;
        this.year = yr;
    }

    public String getMake(){ return make; }

    public String getModel(){ return model; }

    public  int getYear(){ return year; }
}

class Car extends Vehicle{
    final int doors;

    public Car(String make, String model, int year,int doors){
        super(make,model,year);
        this.doors = doors;
    }
    public void displayDetails(){
        System.out.println("Car Details");
        System.out.println("Make:" + getMake());
        System.out.println("Model:" + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + doors);
    }
}


public class Task13 {
    public static void main(String[] args) {
        Car c = new Car("Toyota","Camry",2022, 4);
        c.displayDetails();
    }

}

