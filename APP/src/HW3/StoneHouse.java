package HW3;

public class StoneHouse extends Builder {
    @Override
    public void buildRoof() {
        System.out.println("Build stone roof");
    }

    @Override
    public void buildWall() {
        System.out.println("Build stone wall");
    }

    @Override
    public void buildFloor() {
        System.out.println("Build stone floor");
    }
}
