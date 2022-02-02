import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {
    Personne hammel = new Personne("hammel");
    Montre m = new Montre(9,25);
    @Test
    void porteMontre2() {
        hammel.porteMontre2(m);
        Assertions.assertEquals("9h25min" , hammel.siMontre());
    }

    @Test
    void enleveMontre() {
        hammel.enleveMontre(m);
        Assertions.assertEquals("9h25min" , hammel.siMontre());
    }


}