package sharpieset;

import sharpie.Sharpie;

public class Main {
    public static void main(String[] args) {
        SharpieSet sharpieSet = new SharpieSet();

        sharpieSet.sharpies.add(new Sharpie("green", 3.3f));
        sharpieSet.sharpies.add(new Sharpie("blue", 3.4f));
        sharpieSet.sharpies.add(new Sharpie("red", 3.5f));

        for (int i = 0; i < 100; i++) {
            sharpieSet.sharpies.get(1).use();
        }

        for (int i = 0; i < sharpieSet.sharpies.size(); i++) {
            if (sharpieSet.removeTrash(sharpieSet.sharpies.get(i))) {
                i--;
            }
        }
        //for (Sharpie sharp:sharpieSet.sharpies) {
        //  sharpieSet.removeTrash(sharp);}

    }
}
