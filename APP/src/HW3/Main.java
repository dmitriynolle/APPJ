package HW3;

public class Main {
    public static void main(String[] args){
        Builder woodHouse = new WoodHouse();
        Builder stoneHouse = new StoneHouse();
        Builder newHouse = new NewHouse();
        System.out.println(woodHouse.getMaterial());
        woodHouse.buildHouse();
        stoneHouse.buildHouse();
        newHouse.buildHouse();
    }
}
