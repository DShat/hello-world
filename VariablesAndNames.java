public class VariablesAndNames {
    public static void main(String[] args) {
    //Declares integer and double variables
        int cars, drivers, passengers, carsNotDriven, carsDriven; 
        double spaceInCar, carpoolCapacity,averagePassengersPerCar;
        
        //Assigns variables
        cars = 100;
        spaceInCar = 4.0; // it doesnt matter if it is 4.0 or 4 since the variable has been declared as a double and not an int
        // a floating point number is a kind of numerical data that stores one decimal place for more accuracy than an int but less than a double
        drivers = 30; 
        passengers = 90;
        carsNotDriven = cars - drivers;
        carsDriven = drivers;
        carpoolCapacity = carsDriven * spaceInCar;
        averagePassengersPerCar = passengers / carsDriven;

        //Prints out the amount of cars and drivers available with a respective statement
        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        //Prints out the amount of empty cars, people to drive and people to carpool along with a respective statement
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        //Prints out the amount of average amount of people per car with a respective statement
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}
