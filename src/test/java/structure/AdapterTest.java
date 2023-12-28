package structure;

import org.example.structure.Adapter.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdapterTest {

    @Test
    public void test() {
        AdapterService service = new AdapterService();
        service.exec();
    }

    @Test
    public void unitRoundTest() {
        RoundHole roundHole = new RoundHole(10);
        RoundStick smallStick = new RoundStick(5);
        RoundStick bigStick = new RoundStick(15);

        assertTrue(roundHole.fits(smallStick));
        assertFalse(roundHole.fits(bigStick));
    }

    @Test
    public void unitSquareTest() {
        RoundHole roundHole = new RoundHole(10);
        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(new SquareStick(10));
        SquareStickAdapter bigSquareStickAdapter = new SquareStickAdapter(new SquareStick(20));

        assertTrue(roundHole.fits(smallSquareStickAdapter));
        assertFalse(roundHole.fits(bigSquareStickAdapter));
    }
}
