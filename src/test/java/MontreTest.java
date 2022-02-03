import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MontreTest {

    Montre montre = new Montre(10,25);
    Montre montre2 = new Montre(montre); //celui ci clone sur la montre 1

    @BeforeEach
    void init(){
        Montre montre = new Montre(10,25);
        Montre montre2 = new Montre(montre);
    }

    //    Test d'une montre cree
    @Test
    void moNtreCreeTest() {
        Assertions.assertEquals("10 h 25 m" , montre.afficheHeure());
    }

    //    Test d'une montre clone
    @Test
    void cloneTest(){
        Assertions.assertEquals(montre.afficheHeure() , montre2.afficheHeure());
    }
}