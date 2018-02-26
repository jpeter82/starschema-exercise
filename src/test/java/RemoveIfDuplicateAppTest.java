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
        int[] originalArray = new int[0];
        List<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithOneValueInList() {
        int[] originalArray = new int[1];
        originalArray[0] = 3;
        List<Integer> expectedList = Arrays.asList(3);
        assertEquals(expectedList, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithAllElementsInListAreSame() {
        int[] originalArray = {0, 0, 0, 0};
        List<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithAllElementsInListAreDifferent() {
        int[] originalArray = {7, 4, 9, 2};
        List<Integer> expectedList = Arrays.asList(7, 4, 9, 2);
        assertEquals(expectedList, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithNegativeIntegers() {
        int[] originalArray = {0, -11, 0, 0, 1, 4, 5, 1, -6, 5, -11};
        List<Integer> expectedList = Arrays.asList(4, -6);
        assertEquals(expectedList, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithManyDuplicates() {
        int[] originalArray = {7, 0, 197, 3, 2, 9, 0, 197, 197, 0, 8, 9, 13, 197, -197, 199, 5, 2, 197};
        List<Integer> expectedList = Arrays.asList(7, 3, 8, 13, -197, 199, 5);
        assertEquals(expectedList, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithOnlyDuplicates() {
        int[] originalArray = {0, 3, 0, 1, 1, 3, 0};
        List<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithFirstIndexDuplicate() {
        int[] originalArray = {0, 1, 1, 3, 0, 4};
        List<Integer> expectedList = Arrays.asList(3, 4);
        assertEquals(expectedList, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithLastIndexDuplicate() {
        int[] originalArray = {3, 0, 1, 3, 0};
        List<Integer> expectedList = Arrays.asList(1);
        assertEquals(new HashSet<>(expectedList), new HashSet<>(app.removeAllDuplicates(originalArray)));
    }

    @Test
    void testRemoveDuplicatesWithFirstIndexUnique() {
        int[] originalArray = {7, 0, 3, 0, 1, 3, 0};
        List<Integer> expectedList = Arrays.asList(7, 1);
        assertEquals(expectedList, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithLastIndexUnique() {
        int[] originalArray = {3, 1, 1, 3, 0, 7};
        List<Integer> expectedList = Arrays.asList(0, 7);
        assertEquals(expectedList, app.removeAllDuplicates(originalArray));
    }

    @AfterEach
    void cleanUp() {
        app = null;
    }

}
