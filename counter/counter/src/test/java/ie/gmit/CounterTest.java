package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

//Testing Upload


public class CounterTest {

    Counter myCounter;

    @Test
    void TestConstructor()
    {
        myCounter = new Counter();
        assertEquals(0,myCounter.getCount());
    }
}
