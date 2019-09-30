package pirates;

import java.util.Random;

public class RandomInt {
    public RandomInt(int min, int max){
        randomInt(min,max);
    }
    public int randomInt(int min,int max){
        return min+(int)(Math.random()*(max-min));

    }
    Random random=new Random();
    //random.nextInt!!!!!!
}
