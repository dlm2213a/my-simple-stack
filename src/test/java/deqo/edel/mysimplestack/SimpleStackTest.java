package deqo.edel.mysimplestack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest {

    StackBis stack;

    @Before
    public void setUp() throws Exception {
        stack = new StackBis();
    }

    @Test
    public void isEmpty() {
        Assert.assertEquals(true, stack.isEmpty());
        Integer entier = 1;
        stack.push(new Item(new Integer(entier)));
        Assert.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void getSize() {
        Assert.assertEquals(0, stack.getSize());
        Integer entier = 1;
        Integer entier2 = 2;
        stack.push(new Item(new Integer(entier)));
        stack.push(new Item(new Integer(entier2)));
        Assert.assertEquals(2, stack.getSize());
    }

    @Test
    public void push() {
        Assert.assertEquals(true, stack.isEmpty());
        Assert.assertEquals(0, stack.getSize());
        Integer entier = 10;
        stack.push(new Item(new Integer(entier)));
        Assert.assertEquals(false, stack.isEmpty());
        Assert.assertEquals(1, stack.getSize());
        Assert.assertEquals(10, stack.peek().getEntier());
    }

    @Test
    public void peek() {
        Integer entier = 10;
        stack.push(new Item(new Integer(entier)));
        Assert.assertEquals(10, stack.peek().getEntier());
    }

    @Test
    public void pop() {
        Integer entier = 9;
        stack.push(new Item(new Integer(entier)));
        Integer entier2 = 10;
        stack.push(new Item(new Integer(entier2)));
        stack.pop();
        Assert.assertEquals(9, stack.peek().getEntier());
    }
}