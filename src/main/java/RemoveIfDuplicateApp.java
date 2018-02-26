import java.util.Arrays;

public class RemoveIfDuplicateApp {

    public static void main(String[] args) {
        int[] originalArray = {0, 1, 2, 3, 0, 0, 2};

        RemoveIfDuplicateApp app = new RemoveIfDuplicateApp();
        int[] listWithoutDuplicates = app.removeAllDuplicates(originalArray);

        System.out.println("Original List: " + Arrays.toString(originalArray));

        System.out.println("Output List: " + Arrays.toString(listWithoutDuplicates));
    }

    public int[] removeAllDuplicates(int[] originalArray) {

        if (originalArray.length < 2) {
            return originalArray;
        } else {
            Arrays.sort(originalArray);
            int[] outputArray = {};
            int counter = 0;

            for (int i = 0 ; i < originalArray.length - 1; i++) {
                if ((originalArray[i] != originalArray[i + 1]) && counter == 0) {
                    outputArray = addToArray(originalArray[i], outputArray);
                } else if ((originalArray[i] != originalArray[i + 1]) && (counter != 0)) {
                    counter = 0;
                } else {
                    counter++;
                }
            }

            if (originalArray[originalArray.length - 2] != originalArray[originalArray.length - 1]) {
                outputArray = addToArray(originalArray[originalArray.length - 1], outputArray);
            }

            return outputArray;
        }
    }

    public int[] addToArray(int element, int[] array) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        return array;
    }

}
