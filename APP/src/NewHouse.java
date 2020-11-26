public class NewHouse extends Builder{
    @Override
    public void buildRoof() {
        System.out.println("Build wood roof");
    }

    @Override
    public void buildWall() {
        System.out.println("Build stone wall");
    }

    @Override
    public void buildFloor() {
        System.out.println("Build stone floor");
    }

    @Override
    public void buildHouse(){
        buildFloor();
        buildWall();
        buildRoof();
        buildGarage();
    }

    private void buildGarage() {
        System.out.println("Build stone garage");
    }
}
