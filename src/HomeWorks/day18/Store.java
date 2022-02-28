package HomeWorks.day18;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    int[] productNumbers;

    public Store(){

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
        if (countOfWorkers < 2 || countOfWorkers > 50) {
            System.out.println("count Of Workers must be in range 2 - 50");
        }
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name==null || name.length()<3 ){
            System.out.println("name must have at least 3 characters");
        }
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
}
