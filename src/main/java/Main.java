import interfaces.*;
import obstacle.*;

public class Main {
    public static void main(String[] args) {

        // Wall wall = new Wall(2);
        Road[] roads = GenerateObstacle.getRoads();
        Wall[] walls = GenerateObstacle.getWalls();
        Runnuble[] runnubles = GeneratePlayers.getRunnables();
        Jumpuble[] jumpubles = GeneratePlayers.getJumpables();


        for (Runnuble runnuble : runnubles) {
            for (Road length : roads) {
                runnuble.run(length);
            }
        }


        for (Jumpuble jumpuble : jumpubles) {
            for (Wall high : walls) {
                jumpuble.jump(high);
            }
        }


    }
}
