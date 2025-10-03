package Strings;

public class ExampleString {

    public static void main(String[] args) {
        String name = "Sergio";
        String name2 = "Sergio";

        System.out.println(name == name2);

        String name3 = new String("Sergio");

        System.out.println(name == name3);

        System.out.println(name.toUpperCase());
        System.out.println(name);

        Person person = new Person("Sergio", "Barreras");
        System.out.println(person.toString());
    }
}
