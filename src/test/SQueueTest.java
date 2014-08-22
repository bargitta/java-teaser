package test;
import com.bargittachen.SQueue;
import org.junit.Test;

import static org.junit.Assert.*;

public class SQueueTest {
    @Test
    public void push_pop_one_element_with_squeue(){
        SQueue<String> queue = new SQueue<String>();
        assertTrue(queue.offer("a"));
        assertEquals("a",queue.poll());
    }

    @Test
    public void push_pop_invalid_elements_with_squeue(){
        SQueue<String> queue = new SQueue<String>();
        assertFalse(queue.offer(null));
        assertNull(queue.poll());
    }

    @Test
    public void push_pop_elements_sequentially_with_squeue(){
        SQueue<String> queue = new SQueue<String>();
        assertTrue(queue.offer("a"));
        assertTrue(queue.offer("b"));
        assertTrue(queue.offer("c"));
        assertTrue(queue.offer("d"));

        assertEquals("a",queue.poll());
        assertEquals("b",queue.poll());
        assertEquals("c",queue.poll());
        assertEquals("d",queue.poll());
        assertNull(queue.poll());
    }

    @Test
    public void push_pop_elements_with_squeue(){
        SQueue<String> queue = new SQueue<String>();
        assertTrue(queue.offer("a"));
        assertTrue(queue.offer("b"));
        assertEquals("a",queue.poll());

        assertTrue(queue.offer("c"));
        assertTrue(queue.offer("d"));

        assertEquals("b",queue.poll());
        assertEquals("c",queue.poll());
        assertTrue(queue.offer("e"));
        assertEquals("d",queue.poll());
        assertEquals("e",queue.poll());
        assertNull(queue.poll());
    }

}
