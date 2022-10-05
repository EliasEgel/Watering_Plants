import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {
    public Cactus cactus = new Cactus(0.2, "Kaktus");

    @Test
    public final void waterCactusTest() {
        assert (cactus.waterRequired() == 2);
        assert (cactus.waterRequired() != 1);
    }
}
