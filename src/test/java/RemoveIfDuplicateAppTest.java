import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveIfDuplicateAppTest {

    private RemoveIfDuplicateApp app;

    @BeforeEach
    void init() {
        this.app = new RemoveIfDuplicateApp();
    }

    @Test
    void testRemoveDuplicatesWithEmptyList() {
        List<Integer> originalList = new ArrayList<>();
        List<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, app.removeAllDuplicates(originalList));
    }

    @Test
    void testRemoveDuplicatesWithOneValueInList() {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        List<Integer> expectedList = Arrays.asList(1);
        assertEquals(expectedList, app.removeAllDuplicates(originalList));
    }

    @Test
    void testRemoveDuplicatesWithAllElementsInListAreSame() {
        List<Integer> originalList = Arrays.asList(0, 0, 0, 0);
        List<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, app.removeAllDuplicates(originalList));
    }

    @Test
    void testRemoveDuplicatesWithAllElementsInListAreDifferent() {
        List<Integer> originalList = Arrays.asList(7, 4, 9, 2);
        List<Integer> expectedList = Arrays.asList(2, 4, 7, 9);
        assertEquals(expectedList, app.removeAllDuplicates(originalList));
    }

    @Test
    void testRemoveDuplicatesWithNegativeIntegers() {
        List<Integer> originalList = Arrays.asList(0, -11, 0, 0, 1, 4, 5, 1, -6, 5, -11);
        List<Integer> expectedList = Arrays.asList(-6, 4);
        assertEquals(expectedList, app.removeAllDuplicates(originalList));
    }

    @Test
    void testRemoveDuplicatesWithManyDuplicates() {
        List<Integer> originalList = Arrays.asList(7, 0, 197, 3, 2, 9, 0, 197, 197, 0, 8, 9, 13, 197, -197, 199, 5, 2, 197);
        List<Integer> expectedList = Arrays.asList(-197, 3, 5, 7, 8, 13, 199);
        assertEquals(expectedList, app.removeAllDuplicates(originalList));
    }

    @Test
    void testRemoveDuplicatesWithOnlyDuplicates() {
        List<Integer> originalList = Arrays.asList(0, 3, 0, 1, 1, 3, 0);
        List<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, app.removeAllDuplicates(originalList));
    }

    @Test
    void testRemoveDuplicatesWithFirstIndexDuplicate() {
        List<Integer> originalList = Arrays.asList(0, 1, 1, 3, 0, 4);
        List<Integer> expectedList = Arrays.asList(3, 4);
        assertEquals(new HashSet<>(expectedList), new HashSet<>(app.removeAllDuplicates(originalList)));
    }

    @Test
    void testRemoveDuplicatesWithLastIndexDuplicate() {
        List<Integer> originalList = Arrays.asList(3, 0, 1, 3, 0);
        List<Integer> expectedList = Arrays.asList(1);
        assertEquals(new HashSet<>(expectedList), new HashSet<>(app.removeAllDuplicates(originalList)));
    }

    @Test
    void testRemoveDuplicatesWithFirstIndexUnique() {
        List<Integer> originalList = Arrays.asList(7, 0, 3, 0, 1, 3, 0);
        List<Integer> expectedList = Arrays.asList(1, 7);
        assertEquals(expectedList, app.removeAllDuplicates(originalList));
    }

    @Test
    void testRemoveDuplicatesWithLastIndexUnique() {
        List<Integer> originalList = Arrays.asList(3, 1, 1, 3, 0, 7);
        List<Integer> expectedList = Arrays.asList(0, 7);
        assertEquals(expectedList, app.removeAllDuplicates(originalList));
    }

    @AfterEach
    void cleanUp() {
        app = null;
    }

}
