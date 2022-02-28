package HomeWorks.day18;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Armen");
        person1.setLastName("Meliqyan");
        person1.setPassportId("AK087595");
        person1.setAge(20);
        person1.setGender("Male");
        System.out.println(person1.display());
        Person person2=new Person();
        person2.setFirstName("5546546435");
        System.out.println(person2.getFirstName());
    }

}
