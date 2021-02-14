import interfaces.*;
import players.*;
import obstacle.*;

public class GeneratePlayers {
    public static Runnuble[] getRunnables(){
        Runnuble cat = new Cat("Мурзик", 50, 2);
        Runnuble human = new Human("Игнат", 60, 1);
        Runnuble robot = new Robot("XiaoBot", 10, 2);
        return new Runnuble[]{cat, human, robot};
    }
    public static Jumpuble[] getJumpables(){
        Jumpuble cat = new Cat("Мурзик", 50, 2);
        Jumpuble human = new Human("Игнат", 60, 1);
        Jumpuble robot = new Robot("XiaoBot", 10, 2);
        return new Jumpuble[]{cat, human, robot};
    }
}
