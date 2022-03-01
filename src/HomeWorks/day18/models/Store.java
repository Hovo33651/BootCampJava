package HomeWorks.day18.models;

import java.util.Arrays;

/**4.
 * Write a Store.java class which`
 * - - has a countOfWorkers, name, phoneNumber,
 * array of product numbers(what kind of product are in store)
 * where`
 * - - countOfWorkers must be in range 2 - 50
 * - - name must have at least 3 characters
 * - - phoneNumber must have 8 digits, also can not consist negative
 * digits
 */
public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    int[] productNumbers;

    public Store() {

    }

    public Store(int countOfWorkers, String name, String phoneNumber, int[] productNumbers) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.productNumbers = productNumbers;
    }

    public int getCountOfWorkers() {

        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public int[] getProductNumbers() {

        return productNumbers;
    }

    public void setProductNumbers(int[] productNumbers) {

        this.productNumbers = productNumbers;
    }

    @Override
    public String toString() {
        return "Store{" +
                "countOfWorkers=" + countOfWorkers +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", productNumbers=" + Arrays.toString(productNumbers) +
                '}';
    }
}
