package HouseExample;

public class House {
    int doors;
    int windows;
    double size;

    void openDoor() {
        System.out.println("La puerta esta abierta");
    }

    double calculateArea() {
        return size * size;
    }
}
