package HomeWorks.Day5;

/**
 * Class and Object
 * Define Author class
 */
public class Author {
/**
 Class which
 * Has  fields name, email, gender
 * define all argument constructor
 * write method which will print all information about  Author
 * create an instance of Author and print all info about him
 */

    /**
     * fields name, email, gender
     */
    String name;
    String email;
    char gender;

    /**
     * define all argument constructor
     */
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * write method which will print all information about  Author
     */

    public void allInfoAboutAuthor() {
        System.out.println("name-  " + name + "\n" + "email- " + email + "\n" + "gender-  " + gender);
    }

    /**
     * write methods which will print name and email of the author
     */

    public void nameEmailAboutAuthor() {
        System.out.println("name-  " + name + "\n" + "email- " + email);

    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

