/*Design a CargoShip class that extends the Ship class. The CargoShip class should have the following members:
● A field for the cargo capacity in tonnage (an int )
● A constructor and appropriate accessors and mutators
● A toString method that overrides the toString method in the base class.TheCargoShip class’s toString method
should display only the ship’s name and the ship’s cargo capacity. */


public class CargoShip extends Ship {


    private int cargoCapacity;

    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Override the toString method
    @Override
    public String toString() {
        return "Ship Name: " + getName() + " Cargo Capacity: " + cargoCapacity;
    }
}