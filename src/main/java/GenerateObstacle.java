import interfaces.*;
import players.*;
import obstacle.*;

public class GenerateObstacle {
    public static Wall[] getWalls(){
        Wall wall0 = new Wall(1);
        Wall wall1 = new Wall(2);
        Wall wall2 = new Wall(3);
        return new Wall[]{wall0,wall1,wall2};
    }
    public static Jumpuble[] getJumpables(){
        Jumpuble cat = new Cat("Мурзик", 50, 2);
        Jumpuble human = new Human("Игнат", 60, 1);
        Jumpuble robot = new Robot("XiaoBot", 10, 2);
        return new Jumpuble[]{cat, human, robot};
    }
}
