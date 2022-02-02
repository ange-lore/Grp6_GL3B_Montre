import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontreTest {

    Montre m = new Montre(9,25);
    Montre n = new Montre(m);

    @Test
    void afficheHeure() {
        Assertions.assertEquals("8h25min" , m.afficheHeure());
    }

    @Test
    void testClone() {
        Assertions.assertEquals(m.afficheHeure() , n.afficheHeure());
    }
}