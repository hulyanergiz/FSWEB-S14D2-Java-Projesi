import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.models.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lamp lamp=new Lamp(LampType.LAMP1,true,60);
        lamp.turnOn();

        Bed bed=new Bed("king",2,1,1,1);
        bed.make();

        Wardrobe wardrobe=new Wardrobe(4,2,50);
        wardrobe.add();

        Carpet carpet=new Carpet(2,3, PaintColor.COLOR2);
        carpet.lying();

        Ceiling ceiling=new Ceiling(3,PaintColor.COLOR3);

        //directions N:north, S:South, E:East, W:West
        Wall wall1=new Wall("N");
        Wall wall2=new Wall("S");
        Wall wall3=new Wall("E");
        Wall wall4=new Wall("W");

        Bedroom bedroom=new Bedroom(wall1,wall2,wall3,wall4,ceiling,"my Bedroom",bed,lamp,wardrobe,carpet);
        System.out.println(bedroom);

    }
}