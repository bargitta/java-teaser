package test;

import com.bargittachen.VectorSearch;
import org.junit.Assert;
import org.junit.Test;

public class VectorSearchTest {

    private int[][] array = {{2, 7, 8, 20},{4, 13, 17, 40},{5, 14, 19, 60},{6, 15, 30, 100}};
    private VectorSearch vectorSearch = new VectorSearch(array, 4, 4);

    @Test
    public void should_succeed_with_quicksearch(){

        Assert.assertFalse(vectorSearch.quickSearch(0));
        Assert.assertFalse(vectorSearch.quickSearch(2000));

        Assert.assertTrue(vectorSearch.quickSearch(100));
        Assert.assertTrue(vectorSearch.quickSearch(2));
        Assert.assertTrue(vectorSearch.quickSearch(4));
        Assert.assertTrue(vectorSearch.quickSearch(5));

        Assert.assertTrue(vectorSearch.quickSearch(17));
        Assert.assertTrue(vectorSearch.quickSearch(40));
        Assert.assertTrue(vectorSearch.quickSearch(100));
        Assert.assertTrue(vectorSearch.quickSearch(60));


    }

    @Test
    public void should_succeed_with_quicksearch2(){

        Assert.assertFalse(vectorSearch.quickSearch2(0));
        Assert.assertFalse(vectorSearch.quickSearch2(2000));

        Assert.assertTrue(vectorSearch.quickSearch2(100));
        Assert.assertTrue(vectorSearch.quickSearch2(2));
        Assert.assertTrue(vectorSearch.quickSearch2(4));
        Assert.assertTrue(vectorSearch.quickSearch2(5));

        Assert.assertTrue(vectorSearch.quickSearch2(17));
        Assert.assertTrue(vectorSearch.quickSearch2(40));
        Assert.assertTrue(vectorSearch.quickSearch2(100));
        Assert.assertTrue(vectorSearch.quickSearch2(60));


    }

}