package players;

import interfaces.Jumpuble;
import interfaces.Runnuble;
import obstacle.*;

public class Robot implements Runnuble, Jumpuble {
    private String name;
    private int lengthRun;
    private int highJump;

    public Robot(String name, int lengthRun, int highJump) {
        this.name = name;
        this.lengthRun = lengthRun;
        this.highJump = highJump;
    }

    @Override
    public Boolean jump(Wall wall) {
        Boolean tryResult = highJump >= wall.getHigh();
        if (tryResult) {
            System.out.println("_________________________________________");
            System.out.println(name + " пытается перепрыгнуть стену..." + wall.getHigh());
            System.out.println("Успешно!");
        }
        return tryResult;

    }
    @Override
    public Boolean run(Road road) {
        Boolean tryResult = lengthRun >= road.getLength();
        if (tryResult) {
            System.out.println("_________________________________________");
            System.out.println(name + " пытается пробежать..." + road.getLength());
            System.out.println("Успешно!");
        }
        return tryResult;

    }


}
