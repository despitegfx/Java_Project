import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrockTest {

    @Test
    void getName1() {
        Petrock pet = new Petrock("Seth");
        assertEquals("Seth",pet.getName());
    }


    @Test
    void getName2() {
        Petrock pet = new Petrock("Seth");
        assertEquals("Seth",pet.getName());
    }
}