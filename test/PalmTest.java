import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm palm = new Palm(3, "test");

    @Test
    void waterPalmRequired() {
        assert (palm.waterRequired()== 1.5);
        assert (palm.waterRequired()!=3);
    }
}