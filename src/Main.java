/*
An application needs to be developed to manage a parking structure near an Airport
•             The parking structure contains multiple levels marked as L1, L2 … Lm.
•             Each level has multiple parking spots marked with 1, 2 … n.
•             There are three types of parking spaces
o             General
o             Valet
o             Frequent Flyer
•             Each parking space cost depends on its type and how long the car has been parked in that space
o             General is the least expensive. Frequent flyer is the most expensive
•             Only one car per space
•             Frequent flyer spaces can only be reserved by owners who are frequent fliers
•             The license plate of the car and name of the owner is stored
 
The application needs to have an API that can be used by other applications with the following features:
•             AddCar – Adds a car to a given parking space on a given level
•             RemoveCar – Remove the car from a given parking space on a given level
•             ParkingCost – Given a parking space and a level, provide the total cost of the parking
•             GetOwner – Given a parking space and a level, get the license plate and owner of the car
•             GetParkingSpace – Given a name or license plate, return the level and space on that level where the car is parked.
 
As a bonus, please provide the unit test cases against these API functions
 
*/

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
