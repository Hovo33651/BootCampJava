package HomeWorks.day18.validator;

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


    public static boolean isValidPasspordId(String passportId) {
        if (passportId == null) {
            return false;
        }
        return passportId.length() == 8 && "AN".equals(passportId.substring(0, 2)) &&
                Integer.parseInt(passportId.substring(2)) >= 0;
    }

    public static boolean isValidGender(String gender) {
        return (gender != null && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")));
    }






}



