import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeatEatingTest {
    MeatEating meatEating = new MeatEating(0.5,"test");
    @Test
    void waterMERequired() {
        assert (meatEating.waterRequired()==0.2);
        assert (meatEating.waterRequired()!=0.5);
    }
}