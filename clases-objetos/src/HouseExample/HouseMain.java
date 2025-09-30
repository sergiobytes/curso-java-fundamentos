package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.setDoors(2);
        myHouse.setWindows(4);
        myHouse.setSize(10);

        House myHouse2 = new House(4, 6, 20);

        System.out
                .println("My house has " + myHouse.getDoors() + " doors, " + myHouse.getWindows() + " windows, and is "
                        + myHouse.calculateArea() + " square meters.");

        myHouse2.openDoor();
    }
}