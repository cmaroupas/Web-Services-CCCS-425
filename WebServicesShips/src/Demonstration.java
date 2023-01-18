/*Demonstrate the classes in a program that has a Ship array. Assign various Ship , CruiseShip , and CargoShip objects to the array elements.
The program should then step through the array, calling each object’s toString method.*/


public class Demonstration {

    public static void main(String[] args) {
        // Create an array of Ship objects

        Ship[] ships = new Ship[3];


        ships[0] = new Ship("Titanic", "1912");
        ships[1] = new CruiseShip("Queen Elizabeth", "1939", 2500);
        ships[2] = new CargoShip("Black Pearl", "1845", 500);

        for (Ship s : ships)
            System.out.println(s);
    }
}

