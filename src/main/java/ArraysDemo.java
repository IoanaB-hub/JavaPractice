import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] grades = new int[4];

        grades[0] = 9;
        grades[1] = 10;
        grades[2] = 8;
        grades[3] = 9;

        System.out.println("Array length: " + grades.length);
        System.out.println("Index of last array element: " + (grades.length - 1));
        System.out.println(grades[1]);

        printSeparator();

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Element position is " + i + " and corespondent value is " + grades[i]);
        }

        printSeparator();

        int i = 0;
        while (i < grades.length) {
            System.out.println("The grade is: " + grades[i]);
            i++;
        }

        printSeparator();

        for (int g : grades) {
            System.out.println("The value is: " + g);
        }

        printSeparator();

        int[] firstArray = {5, 10, 5, 8};
        System.out.println("The sum of array values is: " + sumOfArrayValues(firstArray));

        printSeparator();

        System.out.println("The average is " + average(firstArray));

        printSeparator();

        int[] secondArray = {5, -9, 10, -3, -6, 2};
        System.out.println("Sum of positive numbers: " + sumOfPositiveNumbers(secondArray));

        printSeparator();

        int[] thirdArray = {1, 2, 3};
        System.out.println("Array values multiplied by the chosen number: " + Arrays.toString(multipleEachValueBy(thirdArray, 2)));

        printSeparator();

        System.out.println("Reversed array: " + Arrays.toString(reverseArray(thirdArray)));

        printSeparator();


        int[] fourthArray = {10, 55, 105, 210, 400};
        System.out.println("Does the array contain the specific value? " + containsSpecificValue(fourthArray, 210)); //true
        System.out.println("Does the array contain the specific value? " + containsSpecificValue(fourthArray, 999)); //false

        printSeparator();

        int[] fifthArray = {10, 25, 14, 86, 29, 49, 9};
        System.out.println("Copied array: " + Arrays.toString(copyElementsFromArray(fifthArray)));


    }

    public static void printSeparator() {
        System.out.println("------------------");
    }

    public static int sumOfArrayValues(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static int average(int[] array) {
        return sumOfArrayValues(array) / array.length;
    }

    public static int sumOfPositiveNumbers(int[] array) {
        int sum = 0;

        for (int j : array) {
            if (j > 0) {
                sum += j;
            }
        }
        return sum;
    }

    public static int[] multipleEachValueBy(int[] array, int multiplier) {

        int[] newArray = new int[array.length]; //new array with same size

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * multiplier;
        }
        return newArray;
    }

    public static int[] reverseArray(int[] array) {

        int[] reversed = new int[array.length]; //new array with same dimension
        int j = 0; // index for the new array

        for (int i = array.length - 1; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }
        return reversed;

    }

    public static boolean containsSpecificValue(int[] array, int searchValue) {

        for (int i : array) {
            if (i == searchValue) {
                return true;
            }
        }
        return false;
    }

    public static int[] copyElementsFromArray(int[] array) {

        int[] copiedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }

    Person person1 = new Person("Ioana Dima", 29, "Iasi", 9, 17);


}
