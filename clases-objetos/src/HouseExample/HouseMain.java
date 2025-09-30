package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House(2, 4, 10);

        House myHouse2 = new House(4, 6, 20);

        System.out.println("My house has " + myHouse.doors + " doors, " + myHouse.windows + " windows, and is "
                + myHouse.calculateArea() + " square meters.");

        myHouse2.openDoor();
    }
}