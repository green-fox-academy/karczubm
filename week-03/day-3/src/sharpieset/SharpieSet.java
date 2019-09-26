package sharpieset;

import sharpie.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies = new ArrayList<>();

    public SharpieSet() {

    }

    public boolean countUsable(Sharpie sharpie) {
        return sharpie.inkAmount != 0; //true=usable
    }

    public boolean removeTrash(Sharpie sharpie) {
        if (!countUsable(sharpie)) {
            sharpies.remove(sharpie);
            return true;
        } else {
            return false;
        }
    }

}
