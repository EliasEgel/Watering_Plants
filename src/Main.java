import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public Main(){
        Plant palm1 = new Palm(5,"Laura");//Polymorfism Används när växterna skapas
        Plant palm2 = new Palm(1,"Putte");
        Plant kaktus = new Cactus(0.2,"Igge");
        Plant köttÄtande = new MeatEating(0.7,"Meatloaf");
        List<Plant> plants = new ArrayList<>();
        plants.add(palm1);
        plants.add(palm2);
        plants.add(kaktus);
        plants.add(köttÄtande);
        String userInput;
        userInput = JOptionPane.showInputDialog("Vilken växt ska få mat?");
        for(int i =0; i<plants.size();i++){
            if(userInput.equals(plants.get(i).getName())){
                plants.get(i).waterPlant();
                break;
            }else if(i==(plants.size()-1)){
                JOptionPane.showMessageDialog(null, "Den Växten finns inte");
            }
        }


    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
