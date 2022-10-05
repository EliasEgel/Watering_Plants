import javax.swing.*;

public class MeatEating extends Plant{//Ärver av Plant

    public MeatEating(double height, String name) {
        super(height, name);
    }

    @Override
    public double waterRequired() {
        return (0.1 + (0.2*getHeight()));
    }

    @Override
    public void waterPlant() {
        JOptionPane.showMessageDialog(null,getName() + " behöver " + waterRequired() + " liter proteindryck/dag");
    }
}
