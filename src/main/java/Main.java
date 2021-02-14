import interfaces.*;
import players.*;
import obstacle.*;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall(2);
        Road road = new Road(11);

        Runnuble[] runnubles = GeneratePlayers.getRunnables();
        Jumpuble[] jumpubles = GeneratePlayers.getJumpables();

        for (Runnuble runnuble : runnubles) {
            runnuble.run(road);
        }
        for (Jumpuble jumpuble : jumpubles) {
            jumpuble.jump(wall);
        }





    }
}
