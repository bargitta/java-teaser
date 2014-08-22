package test;
import com.bargittachen.QStack;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QStackTest {
    @Test
    public void push_pop_one_element_with_qstack(){
        QStack<String> strStack = new QStack<String>();
        assertTrue(strStack.push("a"));
        assertEquals("a", strStack.pop());
    }

    @Test
    public void push_pop_invalid_elements_with_qstack(){
        QStack<String> strStack = new QStack<String>();
        assertFalse(strStack.push(null));
        assertNull(strStack.pop());
    }

    @Test
    public void push_pop_elements_with_qstack(){
        QStack<String> strStack = new QStack<String>();
        assertTrue(strStack.push("a"));
        assertTrue(strStack.push("b"));
        assertTrue(strStack.push("c"));
        assertEquals("c", strStack.pop());
        assertEquals("b", strStack.pop());
        assertEquals("a", strStack.pop());
        assertNull(strStack.pop());

    }

}
