package players;
import interfaces.Jumpuble;
import interfaces.Runnuble;
import obstacle.*;

public class Cat implements Runnuble, Jumpuble {
    private String name;
    private int lengthRun;
    private int highJump;

    public Cat(String name, int lengthRun, int highJump) {
        this.name = name;
        this.lengthRun = lengthRun;
        this.highJump = highJump;
    }


    public Boolean jump(Wall wall) {
        Boolean tryResult = highJump >= wall.getHigh();
        System.out.println("_________________________________________");
        System.out.println(name + " пытается перепрыгнуть стену..." + wall.getHigh());
        tryDo(tryResult);
        return tryResult;

    }

    public Boolean run(Road road) {
        Boolean tryResult = lengthRun >= road.getLength();
        System.out.println("_________________________________________");
        System.out.println(name + " пытается пробежать..." + road.getLength());
        tryDo(tryResult);
        return tryResult;

    }

    private void tryDo(Boolean tryResult) {
        if (tryResult) {
            System.out.println("Успешно!");
        } else {
            System.out.println("Не вышло");
        }

    }
}
