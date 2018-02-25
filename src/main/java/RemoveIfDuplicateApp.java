import java.util.*;

public class RemoveIfDuplicateApp {

    public static void main(String[] args) {
        List<Integer> originalList = Arrays.asList(7, 0, 197, 3, 2, 9, 0, 197, 197, 0, 8, 9, 13, 197, -197, 199, 5, 2, 197);

        RemoveIfDuplicateApp app = new RemoveIfDuplicateApp();
        List<Integer> listWithoutDuplicates = app.removeAllDuplicates(originalList);

        System.out.println("Original List: " + originalList.toString());

        System.out.println("Output List: " + listWithoutDuplicates.toString());
    }

    public List<Integer> removeAllDuplicates(List<Integer> originalList) {
        if (originalList.size() < 2) {
            return originalList;
        } else {
            List<Integer> outputList = new ArrayList<>();
            Set<Integer> uniqueSet = new HashSet<>(originalList);

            int occuranceCounter = 0;

            for (Integer setElement : uniqueSet) {
                for (Integer listElement : originalList) {
                    if (setElement.equals(listElement)) {
                        occuranceCounter++;
                        if (occuranceCounter > 1) break;
                    }
                }
                if (occuranceCounter == 1) {
                    outputList.add(setElement);
                }
                occuranceCounter = 0;
            }

            return outputList;
        }
    }

}
