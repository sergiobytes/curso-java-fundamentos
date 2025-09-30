package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House();

        myHouse.doors = 2;
        myHouse.windows = 4;
        myHouse.size = 10;

        House myHouse2 = new House();

        myHouse2.doors = 4;
        myHouse2.windows = 6;
        myHouse2.size = 20;

        System.out.println("My house has " + myHouse.doors + " doors, " + myHouse.windows + " windows, and is "
                + myHouse.calculateArea() + " square meters.");

        myHouse.openDoor();
    }
}