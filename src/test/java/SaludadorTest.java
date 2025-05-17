import org.junit.Test;
import static org.junit.Assert.*;

public class SaludadorTest {

    @Test
    public void testSaludar() {
        Saludador s = new Saludador();
        String resultado = s.saludar("Paula");
        assertEquals("Hola, Paula!", resultado);
    }
}

