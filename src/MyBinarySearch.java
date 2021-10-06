/**
 * MyBinarySearch
 */
public class MyBinarySearch {

    public static void main(String[] args) {
        String[] myFamily = { "Elizabeth", "Orlando", "Celibeth", "Nidia", "Yomaika", "Victor", "Angela" };

        // Display unsorted Array
        System.out.println("This is Unsorted Array ");
        for (String string : myFamily) {
            System.out.print(string + " ");
        }

        // Sort the Array
        bubbleSort(myFamily);

        // Display sorted Array
        System.out.println("\nThis is the Sorted Array ");
        for (String string : myFamily) {
            System.out.print(string + " ");
        }
    }

    public static int search(Comparable[] array, int value) {

        int lower = 0;
        int middle = 0;
        int upper = array.length - 1;
        int position = -1;
        boolean found = false;

        if (lower > upper) {
            return -1;
        }
        while (!found && lower <= upper) {
            middle = (lower + upper) / 2;
            if (middle == value) {
                found = true;
                position = middle;
            } else {

            }
        }

        return position;
    }

    public static void bubbleSort(Comparable[] array) {
        int lastPos;
        int index;
        Comparable temp; // for swapping elements
        // outter loop lastPos = last element to compare each pass.
        // Initially is last index but with each iteration it decreases by one

        // Start at end and decrease array size by one each loop
        for (lastPos = array.length - 1; lastPos >= 0; lastPos--) { // Compare each element to adjacent element
            for (index = 0; index <= lastPos - 1; index++) {
                // If compared elements are out of order then swap them
                if (array[index].compareTo(array[index + 1]) > 0) { // Swap elements
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;

                }
            }
        }
    }
}