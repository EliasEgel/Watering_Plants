import javax.swing.*;

public class Palm extends Plant{//Ärver av Plant
    public Palm(double height, String name) {
        super(height, name);
    }

    @Override
    public double waterRequired() {
        return (getHeight()*0.5);
    }


    @Override
    public void waterPlant() {
        JOptionPane.showMessageDialog(null,getName() + " behöver " + waterRequired() + " liter kranvatten/dag");
    }
}
