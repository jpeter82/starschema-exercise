import java.util.ArrayList;
import java.util.Arrays;
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
        //TODO: implement this method...

        return new ArrayList<>();
    }

}
