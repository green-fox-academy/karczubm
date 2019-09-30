package garden;

public class Main {
    public static void main(String[] args) {
        Garden garden =new Garden();
        Plant flower1=new Flower("yellow");
        Plant flower2=new Flower("blue");
        Plant tree1=new Tree("purple");
        Plant tree2=new Tree("orange");

        garden.addPlant(flower1);
        garden.addPlant(flower2);
        garden.addPlant(tree1);
        garden.addPlant(tree2);

        garden.info();
        System.out.println();
        garden.irrigation(40);
        garden.info();
        System.out.println();
        garden.irrigation(70);
        garden.info();
    }
}
