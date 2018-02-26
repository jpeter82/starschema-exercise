import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveIfDuplicateApp {

    public static void main(String[] args) {
        List<Integer> originalList = Arrays.asList(0, 1, 2, 3, 0, 0, 2);

        RemoveIfDuplicateApp app = new RemoveIfDuplicateApp();
        List<Integer> listWithoutDuplicates = app.removeAllDuplicates(originalList);

        System.out.println("Original List: " + originalList.toString());

        System.out.println("Output List: " + listWithoutDuplicates.toString());
    }

    public List<Integer> removeAllDuplicates(List<Integer> originalList) {

        if (originalList.size() < 2) {
            return originalList;
        } else {
            Collections.sort(originalList);
            List<Integer> outputList = new ArrayList<>();

            int counter = 1;

            for (int i = 1; i < originalList.size(); i++) {
                if (counter == 1 && (!originalList.get(i).equals(originalList.get(i - 1)))) {
                    outputList.add(originalList.get(i - 1));
                } else if (counter > 1 && (!originalList.get(i).equals(originalList.get(i - 1)))) {
                    counter = 1;
                } else {
                    counter++;
                }
            }

            if (! originalList.get(originalList.size()-1).equals(originalList.get(originalList.size()-2))) {
                outputList.add(originalList.get(originalList.size()-1));
            }

            return outputList;
        }
    }

}
