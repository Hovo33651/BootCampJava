package HomeWorks.day18.Validator;

public final class PersonValidator {
    private PersonValidator() {
        super();
    }

    public static boolean isValidAge(int age) {

        return (age >= 18 && age <= 99);
    }

    public static boolean isValidFirstName(String firstName) {
        if (firstName == null || firstName.length() == 0) {
            return false;
        }
        int len = firstName.length();
        return (len >= 3 && len <= 15);
    }

    public static boolean isValidLastName(String lastName) {
        if (lastName == null || lastName.length() == 0) {
            return false;
        }
        int len = lastName.length();
        return (len >= 6 && len <= 20);
    }


    public static boolean isValidPasswordId(String passportId) {
        int length = passportId.length();
        boolean isDigit = true;
        for (int i = 3; i < length - 2; i++) {
            if (passportId.charAt(i) < '0' || passportId.charAt(i) > '9') {
                isDigit = false;
                break;
            }
        }
        return passportId.substring(0, 2).equals("AN") || length == 8 || isDigit;
    }

    public static boolean isValidGender(String gender) {
        return gender.compareToIgnoreCase("Male") == 0 && gender.compareToIgnoreCase("Female") == 0;
    }




}



