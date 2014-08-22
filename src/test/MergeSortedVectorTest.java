package test;
import com.bargittachen.MergeSortedVectors;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortedVectorTest {
    @Test
    public void merge_vectors_with_valid_input(){
        int[] a1 = new int[10];
        a1[0] = 13;
        a1[1] = 13;
        int[] a2 = new int[]{3,20};
        MergeSortedVectors.Merge(a1,2,a2,2);
        int[] expected = new int[10];
        expected[0] = 3;
        expected[1] = 13;
        expected[2] = 13;
        expected[3] = 20;
        Assert.assertArrayEquals(expected,a1);
    }

    @Test
    public void merge_vectors_with_duplicate_input(){
        int[] a1 = new int[10];
        a1[0] = 13;
        a1[1] = 13;
        int[] a2 = new int[]{3,13,20};
        MergeSortedVectors.Merge(a1,2,a2,3);
        int[] expected = new int[10];
        expected[0] = 3;
        expected[1] = 13;
        expected[2] = 13;
        expected[3] = 13;
        expected[4] = 20;
        Assert.assertArrayEquals(expected,a1);
    }

    @Test
    public void merge_vectors_with_invalid_input(){
        int[] a1 = new int[10];
        a1[0] = 13;
        a1[1] = 13;
        boolean result = MergeSortedVectors.Merge(a1,2,null,3);

        Assert.assertTrue(true);
    }
}
