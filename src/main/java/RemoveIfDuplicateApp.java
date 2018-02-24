import java.util.*;

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
            List<Integer> outputList = new ArrayList<>();
            Set<Integer> uniqueSet = new HashSet<>(originalList);

            int occuranceCounter = 0;

            for (Integer setElement : uniqueSet) {
                for (Integer listElement : originalList) {
                    if (setElement.equals(originalList.get(listElement))) {
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
