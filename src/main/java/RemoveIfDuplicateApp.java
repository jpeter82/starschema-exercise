import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIfDuplicateApp {

    public static void main(String[] args) {
        int[] originalArray = {0, 1, 2, 3, 0, 0, 2};

        RemoveIfDuplicateApp app = new RemoveIfDuplicateApp();
        List<Integer> listWithoutDuplicates = app.removeAllDuplicates(originalArray);

        System.out.println("Original List: " + Arrays.toString(originalArray));

        System.out.println("Output List: " + listWithoutDuplicates.toString());
    }

    public List<Integer> removeAllDuplicates(int[] originalArray) {
        List<Integer> outputList = new ArrayList<>();

        if (originalArray.length < 2) {
            for (int i : originalArray) {
                outputList.add(i);
            }
        } else {
            boolean inValidated = false;
            boolean[] inValidHelper = new boolean[originalArray.length];

            for (int i = 0; i < originalArray.length - 1; i++) {
                if (!inValidHelper[i]){
                    for (int j = i + 1; j < originalArray.length; j++) {

                        if (originalArray[i] == originalArray[j]) {
                            inValidHelper[j] = true;
                            inValidated = true;
                        }
                    }

                    if (!inValidated) {
                        outputList.add(originalArray[i]);
                    }

                    inValidated = false;
                }
            }
        }

        return outputList;
    }

}
