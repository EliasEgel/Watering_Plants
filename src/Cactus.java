import javax.swing.*;

public class Cactus extends Plant{//Ärver av Plant
    public Cactus(double height, String name) {
        super(height, name);
    }

    @Override
    public double waterRequired() {
        return 2;
    }

    @Override
    public void waterPlant() {
        JOptionPane.showMessageDialog(null,getName()+" behöver "+ waterRequired() + " cl mineralvatten/dag");
    }
}
