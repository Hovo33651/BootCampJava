package HomeWorks.Day5;

/**
 * Class and Object
 * Define a Person class
 */

public class Person {

/**
 Class which
 * Has  fields name, age, address
 * define no argument constructor
 * define all argument constructor
 * write method which will print all information about person
 * create 2 person objects, print all info about them
 */
    /**
     * Has  fields name, age, address
     */

    String name;
    int age;
    String address;

    /**
     * define no argument constructor
     */

    public Person() {
    }

    /**
     * define all argument constructor
     */

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * write method which will print all information about person
     */
    public void allInfoAboutPerson() {
        System.out.println("name-  " + name + "\n" + "age- " + age + "\n" + "address- " + address);

    }

}






