import javax.swing.*;

public class Cactus extends Plant{//Ärver av Plant
    public Cactus(double height, String name) {
        super(height, name);
    }

    @Override
    public void waterPlant() {
        JOptionPane.showMessageDialog(null,getName()+" behöver 2 cl Mineralvatten/dag");
    }
}
