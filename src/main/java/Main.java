import interfaces.*;
import players.*;
import obstacle.*;

public class Main {
    public static void main(String[] args) {

       // Wall wall = new Wall(2);
        Road road = new Road(11);
        Wall[] walls = GenerateObstacle.getWalls();
        Runnuble[] runnubles = GeneratePlayers.getRunnables();
        Jumpuble[] jumpubles = GeneratePlayers.getJumpables();
        /*String[] roads  = new int[] {10, 50, 20, "Autumn"};
        int[] roads  = new int[] {10, 50, 20};

        for (int num: roads) {
            for (Runnuble runnuble : runnubles) {
                runnuble.run(num);
            }
        }

        for (Jumpuble jumpuble : jumpubles) {
            jumpuble.jump(wall);
        }*/
        for (Wall wal: walls){
            for (Jumpuble jumpuble : jumpubles) {
                jumpuble.jump(wal);
            }
        }




    }
}
