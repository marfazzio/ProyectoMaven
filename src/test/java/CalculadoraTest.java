import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void multiplicar() {
        Calculadora c = new Calculadora();
        //assertEquals(8 , c.multiplicar(2,5));
        System.out.println("Hola!");
        assertEquals(10 , c.multiplicar(2,5));
        assertAll(() -> assertEquals(8, c.multiplicar(2, 5)),
                () -> assertEquals(7, c.multiplicar(2, 5)));

    }
}