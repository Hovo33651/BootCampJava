package HomeWorks.day18;

/**
 * 1. Write a Person.java class which `
 * - - has private fields firstName, lastName, passportId, age, gender(String),
 * nationality.
 * - - add all argument constructor, and no argument constructor.
 * - - add public getters and setters.
 * - - has a display() method which will give all information about the person.
 * Example` firstName is Armen
 * lastName is Meliqyan etc…
 * <p>
 * 2.Add in Person class validations with getters and setters with following options
 * - - firstName must be in range 3 to 15
 * - - lastName must be in range 6 to 20
 * - - age must be in range 18 - 99
 * - - gender must be male or female(compareToIgnoreCase())
 * - - passportId must be start with “AN” and contain 6 digits with length 8
 */

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String firstName, String lastName, String passprtId, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passprtId;
        this.age = age;
        this.gender = gender;
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setGender(gender);
        setPassportId(passportId);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() < 3 || firstName.length() > 15) {
            System.out.println(" first Name must be in range 3 to 15");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() < 6 || lastName.length() > 20) {
            System.out.println("last Name must be in range 6 to 20");
        }
        this.lastName = lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        int length = passportId.length();
        boolean isDigit = true;
        for (int i = 3; i < length - 2; i++) {
            if (passportId.charAt(i) < '0' || passportId.charAt(i) > '9') {
                isDigit = false;
                break;
            }
        }
        if (!passportId.substring(0, 2).equals("AN") && length != 8 && !isDigit) {
            System.out.println("Invalid pasport ID");
        }
        this.passportId = passportId;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 99) {
            System.out.println("age must be in range 18 - 99");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.compareToIgnoreCase("Male") != 0 || gender.compareToIgnoreCase("Female") != 0) {
            System.out.println(" gender must be male or female");
        }
        this.gender = gender;
    }


    public String display() {
        return "Person{" +
                "firstName is '" + firstName + '\'' +
                ", lastName is'" + lastName + '\'' +
                ", passprtId is'" + passportId + '\'' +
                ", age is " + age +
                ", gender is'" + gender + '\'' +
                '}';
    }
}