public abstract class Builder {
    private String material = "Test";
    protected abstract void buildRoof();
    protected abstract void buildWall();
    protected abstract void buildFloor();
    public String getMaterial(){
        return material;
    }
    public void buildHouse(){
        buildFloor();
        buildWall();
        buildRoof();
    }
}
