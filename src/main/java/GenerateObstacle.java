import obstacle.*;

public class GenerateObstacle {
    public static Wall[] getWalls() {
        Wall wall0 = new Wall(1);
        Wall wall1 = new Wall(2);
        Wall wall2 = new Wall(3);
        return new Wall[]{wall0, wall1, wall2};
    }

    public static Road[] getRoads() {
        Road road0 = new Road(11);
        Road road1 = new Road(51);
        Road road2 = new Road(61);
        return new Road[]{road0, road1, road2};
    }
}
