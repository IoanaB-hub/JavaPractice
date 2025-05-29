public class Methods {
    /*Write a method for each of these cases, which:
            Receive 2 numbers (integers) and returns their sum.
            Receives 1 number (double) and returns the square of its value.
            Receives 2 string values, joins them and returns the result as a single string.
            Receives a string value, computes and returns its length (number of characters).
            Receives 3 values (x, min, max) and returns true if the first one is between the other 2 values (min <= x <= max), or false otherwise.
            Receives 2 string values, compares their length and returns a boolean result (true if they are equal, false otherwise)
            Receives 3 boolean values, returns true if at least one of them is true.
            Receives 3 boolean values, returns true if all 3 are true.
            Receives 3 boolean values, returns true if none of them is true.
            Receives 3 boolean values, returns true if exactly 2 of them are true.*/
    public static void main(String[] args) {

        int intFirstNumber = 10;
        int intSecondNumber = 20;
        System.out.println("The sum of two numbers is: " + sumOfTwoNumbers(intFirstNumber, intSecondNumber));


        double doubleNumber = 6.2;
        System.out.println("The square of " + doubleNumber + " is: " + theSquareOfTheNumber(doubleNumber));

        String myFirstString = "Have a wonderful";
        String mySecondString = "day!";
        System.out.println("Join of two Strings: " + joinTwoStrings(myFirstString, mySecondString));

        String stringValue = "watch";
        System.out.println("The length of " + stringValue + " is: " + lengthOfAString(stringValue));

        int x = 5;
        int min = 1;
        int max = 10;
        System.out.println("Is " + x + " in range? " + isWithinRange(x, min, max));

        String first_option = "red";
        String second_option = "blue";
        System.out.println("The strings are equal: " + lengthOfTwoStringComparison(first_option, second_option));

        boolean firstBooleanValue = true;
        boolean secondBooleanValue = false;
        boolean thirdBooleanValue = true;
        System.out.println("At least one value is true: " + isAnyTrue(firstBooleanValue, secondBooleanValue, thirdBooleanValue));
        System.out.println("All values are true: " + areAllTrue(firstBooleanValue, secondBooleanValue, thirdBooleanValue));
        System.out.println("All values are false: " + areNoneTrue(firstBooleanValue, secondBooleanValue, thirdBooleanValue));
        System.out.println("Number of true values: " + countTrue(firstBooleanValue, secondBooleanValue, thirdBooleanValue));

    }

    public static int sumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double theSquareOfTheNumber(double number) {
        return number * number;
    }

    public static String joinTwoStrings(String firstString, String secondString) {
        return firstString + " " + secondString;
    }

    public static int lengthOfAString(String stringValue) {
        return stringValue.length();
    }

    public static boolean isWithinRange(int x, int min, int max) {
        return (x >= min && x <= max);
    }

    public static boolean lengthOfTwoStringComparison(String option1, String option2) {
        return (option1.length() == option2.length());
    }

    public static boolean isAnyTrue(boolean a, boolean b, boolean c) {
        return a || b || c;
    }

    public static boolean areAllTrue(boolean a, boolean b, boolean c) {
        return a && b && c;
    }

    public static boolean areNoneTrue(boolean a, boolean b, boolean c) {
        return !a && !b && !c;
    }

    public static int countTrue(boolean a, boolean b, boolean c) {

        int count = 0;

        if (a) {
            count++;
        }
        if (b) {
            count++;
        }
        if (c) {
            count++;
        }
        return count;
    }
}
