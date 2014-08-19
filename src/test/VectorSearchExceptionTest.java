package test;

import com.bargittachen.VectorSearch;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.security.InvalidParameterException;

/**
 * Created by xichen on 8/10/14.
 */
public class VectorSearchExceptionTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test(expected = InvalidParameterException.class)
    public void should_not_accept_null_array(){
        VectorSearch search = new VectorSearch(null,2,2);
    }
    @Test
    public void should_throw_exception_with_null_array(){
        expectedException.expect(InvalidParameterException.class);
        expectedException.expectMessage("required");
        VectorSearch search = new VectorSearch(null,2,2);

    }

}
