public class WoodHouse extends Builder {
    String material = "wood";

    @Override
    protected void buildRoof() {
        System.out.println("Build wood roof");
    }

    @Override
    protected void buildWall() {
        System.out.println("Build wood wall");
    }

    @Override
    protected void buildFloor() {
        System.out.println("Build wood floor");
    }

    @Override
    public String getMaterial(){
        return material;
    }
}
