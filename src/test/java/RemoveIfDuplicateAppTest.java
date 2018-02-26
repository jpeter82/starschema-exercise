import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class RemoveIfDuplicateAppTest {

    private RemoveIfDuplicateApp app;

    @BeforeEach
    void init() {
        this.app = new RemoveIfDuplicateApp();
    }

    @Test
    void testRemoveDuplicatesWithEmptyArray() {
        int[] originalArray = new int[0];
        int[] expectedArray = new int[0];
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithOneValueInArray() {
        int[] originalArray = new int[1];
        originalArray[0] = 1;
        int[] expectedArray = {1};
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithAllElementsInArrayAreSame() {
        int[] originalArray = {0, 0, 0, 0};
        int[] expectedArray = new int[0];
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithAllElementsInArrayAreDifferent() {
        int[] originalArray = {7, 4, 9, 2};
        int[] expectedArray = {2, 4, 7, 9};
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithNegativeIntegers() {
        int[] originalArray = {0, -11, 0, 0, 1, 4, 5, 1, -6, 5, -11};
        int[] expectedArray = {-6, 4};
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithManyDuplicates() {
        int[] originalArray = {7, 0, 197, 3, 2, 9, 0, 197, 197, 0, 8, 9, 13, 197, -197, 199, 5, 2, 197};
        int[] expectedArray = {-197, 3, 5, 7, 8, 13, 199};
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithOnlyDuplicates() {
        int[] originalArray = {0, 3, 0, 1, 1, 3, 0};
        int[] expectedArray = new int[0];
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithFirstIndexDuplicate() {
        int[] originalArray = {0, 1, 1, 3, 0, 4};
        int[] expectedArray = {3, 4};
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithLastIndexDuplicate() {
        int[] originalArray = {3, 0, 1, 3, 0};
        int[] expectedArray = {1};
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithFirstIndexUnique() {
        int[] originalArray = {7, 0, 3, 0, 1, 3, 0};
        int[] expectedArray = {1, 7};
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testRemoveDuplicatesWithLastIndexUnique() {
        int[] originalArray = {3, 1, 1, 3, 0, 7};
        int[] expectedArray = {0, 7};
        assertArrayEquals(expectedArray, app.removeAllDuplicates(originalArray));
    }

    @Test
    void testAddToArrayWithNonEmptyArray() {
        int[] originalArray = {2, 0, 7};
        int newElement = 5;
        int[] expectedArray = {2, 0, 7, 5};
        assertArrayEquals(expectedArray, app.addToArray(newElement, originalArray));
    }

    @Test
    void testAddToArrayWithEmptyArray() {
        int[] originalArray = new int[0];
        int newElement = 5;
        int[] expectedArray = {5};
        assertArrayEquals(expectedArray, app.addToArray(newElement, originalArray));
    }

    @AfterEach
    void cleanUp() {
        app = null;
    }

}
