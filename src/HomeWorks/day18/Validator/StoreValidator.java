package HomeWorks.day18.Validator;

public final  class StoreValidator {
 private StoreValidator() {
        super();
    }

    public static boolean isValidCountOfWorkers(int countOfWorkers) {
        return countOfWorkers >= 2 && countOfWorkers <= 50;
    }

    public static boolean isValidName1(String name) {
        return name != null && name.length() >= 3;
    }

    public static boolean isValidPhoneName(String phoneNumber) {
        return phoneNumber != null && phoneNumber.length() == 8 &&
                phoneNumber.matches("[0-9]+") &&
                Integer.parseInt(phoneNumber) >= 0;
    }




}
