/*Design a CruiseShip class that extends the Ship class. The CruiseShip class should have the following members:
● A field for the maximum number of passengers (an int )
● A constructor and appropriate accessors and mutators
● A toString method that overrides the toString method in the base class. The
CruiseShip class’s toString method should display only the ship’s name and the maximum number of passengers.*/

public class CruiseShip extends Ship {


    private int maxPassengers;

    // Constructor
    public CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Override the toString method
    @Override
    public String toString() {
        return "Ship Name: " + getName() + " Max Passengers: " + maxPassengers;
    }
}
