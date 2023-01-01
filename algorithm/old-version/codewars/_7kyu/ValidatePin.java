package codewars._7kyu;

public class ValidatePin {
    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]{4}|[0-9]{6}");
    }

    public static boolean validatePin_2(String pin) {
        if (pin == null || (pin.length() != 4 && pin.length() != 6)) {
            return false;
        }
        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

/*
* https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
* */