package test;

import com.bargittachen.SpaceConverter;
import org.junit.Assert;
import org.junit.Test;
import java.security.InvalidAlgorithmParameterException;

public class SpaceConverterTest {

    @Test(expected = InvalidAlgorithmParameterException.class)
    public void should_throw_exception_with_invalid_input() throws InvalidAlgorithmParameterException {
        SpaceConverter.convert(null);
    }

    @Test
    public void should_pass_vector_as_reference() throws InvalidAlgorithmParameterException {
        char[] words = {'a',' ','c'};
        SpaceConverter.convert(words);
        char[] expected = {'a','%','2','0','c'};
        Assert.assertArrayEquals("should equal", expected, words);



    }
}