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
        Map<Integer, Integer> container = new HashMap<>();
        List<Integer> outputList = new ArrayList<>();

        for (Integer element : originalList) {
            if (container.containsKey(element)) {
                container.put(element, container.get(element) + 1);
            } else {
                container.put(element, 1);
            }
        }

        for (Integer key : container.keySet()) {
            Integer value = container.get(key);
            if (value.equals(1)) {
                outputList.add(key);
            }
        }

        return outputList;
    }

}
